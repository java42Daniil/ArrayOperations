package telran.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static telran.util.ArraysOperations.*;

class ArrayOperationsTests {

	private static final String INSERTED_STRING = "World and";
	private static final int INSERTED_NUMBER = 100;
	private static final int INSERT_SORTED1 = 1;
	private static final int INSERT_SORTED2 = 2;
	private static final int INSERT_SORTED3 = 3;

	@Test
	void testInsert() {
		String arStr[] = {"hello", "Java"}; 
		String expectedStr[] = {"hello", INSERTED_STRING, "Java"}; 
		String actualStr[] = new String[arStr.length + 1];
		int indexInsert = 1;
		assertEquals(OK,insert(arStr, INSERTED_STRING, indexInsert, actualStr));
		assertArrayEquals(expectedStr, actualStr);
		assertEquals(WRONG_INDEX,insert(arStr, INSERTED_STRING, 100, actualStr));
		actualStr = new String[1];
		assertEquals(WRONG_RESULT_LENGTH,insert(arStr, INSERTED_STRING, indexInsert, actualStr));
		Integer numbers[] = {1, 2, 3};
		indexInsert = 0;
		Integer actualNumbers[] = new Integer[numbers.length + 1];
		Integer expectedFirst[] = {INSERTED_NUMBER, 1, 2, 3};
		insert(numbers,INSERTED_NUMBER, indexInsert, actualNumbers );
		assertArrayEquals(expectedFirst, actualNumbers);
		indexInsert = numbers.length;
		Integer expectedLast[] = { 1, 2, 3, INSERTED_NUMBER};
		insert(numbers,INSERTED_NUMBER, indexInsert, actualNumbers );
		assertArrayEquals(expectedLast, actualNumbers);
		

	}


	@Test
	void testRemove() {
		Integer numbers[] = {1, 2, 3};
		Integer actualNum[] = new Integer[numbers.length-1];
		int indexRemoveNum = 2;
		Integer expectedNum[] = {1, 2};
		assertEquals(OK, remove(numbers, indexRemoveNum, actualNum));
		assertArrayEquals(expectedNum, actualNum);
		}

	@Test
	void testInsertSorted() {
		Integer numbers[] = {2, 1, 3};
		Integer expectedNum1[] = {1, INSERT_SORTED1, 2, 3};
		Integer expectedNum2[] = {1, 2, INSERT_SORTED2, 3};
		Integer expectedNum3[] = {1,2, 3, INSERT_SORTED3};
		Integer actual[] = new Integer[numbers.length + 1];
		
		insertSorted(numbers, INSERT_SORTED1, actual);
		assertArrayEquals(expectedNum1, actual);
		
		insertSorted(numbers, INSERT_SORTED2, actual);
		assertArrayEquals(expectedNum2, actual);
		
		insertSorted(numbers, INSERT_SORTED3, actual);
		assertArrayEquals(expectedNum3, actual);
	}

	@Test
	void testAddLast() {
		Integer arr[] = {1, 2, 3, 4, 5};
		Integer expected[] = {1, 2, 3, 4, 5, 100};
		Integer actual[] = new Integer[arr.length + 1];
		
		addLast(arr, INSERTED_NUMBER, actual);
		assertArrayEquals(expected, actual);
	}

	@Test
	void testAddFirst() {
		Integer arr[] = {1, 2, 3, 4, 5};
		Integer expected[] = {100, 1, 2, 3, 4, 5};
		Integer actual[] = new Integer[arr.length + 1];
		
		addFirst(arr, INSERTED_NUMBER, actual);
		assertArrayEquals(expected, actual);
	}

}
