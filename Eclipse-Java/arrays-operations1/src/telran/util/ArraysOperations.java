package telran.util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysOperations {
	public static final String OK = "ok";
	public static final String WRONG_INDEX = "wrong-index";
	public static final String WRONG_RESULT_LENGTH = "wrong-result-length";

public static <T> String insert (T[] array, T element,int index,T[] res) {
	if( index < 0 || index > array.length) {
		return WRONG_INDEX;
	}
	if( res.length != array.length +1) {
		return WRONG_RESULT_LENGTH;
	}
	System.arraycopy(array, 0, res, 0, index);
	res[index] = element;
	System.arraycopy(array, index, res, index + 1, array.length - index);
	return OK;
}
public static <T> String remove(T[] array, int index, T[] res) {
	// TODO removes any object at the given index
	if (index < 0 || index > array.length) {
		return WRONG_INDEX;
	}
	if(res.length != array.length - 1) {
		return WRONG_RESULT_LENGTH;
	}
	System.arraycopy(array, 0, res, 0, index);
	System.arraycopy(array, index + 1, res, index, array.length - index - 1);
	return OK;
}
public static <T> String insertSorted(T[] sortedArray, T element, T[] res) {
	// TODO insert given element at index to keep array sorted
	// below is the example of binarySearch call
	// How to use a result of that call - is your challenge
	Arrays.sort(sortedArray, (Comparator<T>)Comparator.naturalOrder());
	int index = Arrays.binarySearch(sortedArray, element, (Comparator<T>)Comparator.naturalOrder());
	
	return insert(sortedArray, element, index, res);
}
public static <T> String addLast(T[] array, T element, T[] res) {
	//TODO adds a given element at beginning of the result array
	int index = array.length;
	if (index < 0 || index > array.length) {
		return WRONG_INDEX;
	}
	if (res.length != array.length + 1) {
		return WRONG_RESULT_LENGTH;
	}
	System.arraycopy(array, 0, res, 0, index);
	res[index] = element;
	System.arraycopy(array, index, res, index + 1, array.length - index);

	return OK;

}
public static <T> String addFirst(T[] array, T element, T[] res) {
	//TODO adds a given element at beginning of the result array
	int index = 0;
	if (index < 0 || index > array.length) {
		return WRONG_INDEX;
	}
	if (res.length != array.length + 1) {
		return WRONG_RESULT_LENGTH;
	}
	res[index] = element;
	System.arraycopy(array, 0, res, 1, array.length);

	return OK;
}
}
