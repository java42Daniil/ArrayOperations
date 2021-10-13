import java.util.Scanner;

//Application for printing out the useful information about Java integer primitives
public class PrimitivesinformationAppl {

	public	static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);//input data from the console
		while(true) {
			System.out.println("enter integer primitive type (long, int, short, char, byte or exit)");
			String line = scanner.nextLine();
			if (line.equals("exit")) {
				break;
			}
			printInfoByType(line);
		}
		System.out.println("thanks for using our application & bye");
	}

	private static void printInformationByByte() {
		// your homework should contain switch by the given type(long, int, short, char, byte)
		//for default there should be out: wrong primitive type
		//for each type there should be an appropriate method of printing information of the type
		//for example, printCharInformation - method printing out the info about type "char"
	    byte minValue = 1;
		byte maxValue = 1;
		int nBits = 1;
		while(minValue > 0) {
			minValue = (byte)  (minValue * 2);//compiler casts minValue to int,multiplies on2
			nBits = nBits + 1;
		}
		maxValue = (byte) (minValue - 1);
		System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n",(int)minValue, (int)maxValue,nBits / 8);
	}

   private static void printInformationByChar() {
	   char minValue = 1;
	   char maxValue = 1;
	   int nBits = 1;
		while (minValue > 0) {
			minValue = (char) (minValue * 2);
			nBits = nBits + 1;
		}
		maxValue = (char) (minValue - 1);
		System.out.printf("minimum value is %d, maximal value is %d, number of bites is %d\n", (int) minValue, (int) maxValue, (int) nBits / 8);
   }
   private static void printInformationByInt() {
		int minValue = 1;
		int maxValue = 1;
		int nBits = 1;
		while (minValue > 0) {
			minValue = minValue * 2;
			nBits = nBits + 1;
		}
		maxValue = minValue - 1;
		System.out.printf("minimum value is %d, maximal value is %d, number of bites is %d\n", (int) minValue, (int) maxValue, (int) nBits / 8);
	}
   private static void printInformationByLong() {
		long minValue = 1;
		long maxValue = 1;
		int nBits = 1;
		while (minValue > 0) {
			minValue = (long) (minValue * 2);
			nBits = nBits + 1;
		}
		maxValue = (long) (minValue - 1);
		System.out.printf("minimum value is %d, maximal value is %d, number of bites is %d\n", (long) minValue, (long) maxValue, (int) nBits / 8);
	}
   private static void printInformationByShort() {
		short minValue = 1;
		short maxValue = 1;
		int nBits = 1;
		while (minValue > 0) {
			minValue = (short) (minValue * 2);
			nBits = nBits + 1;
		}
		maxValue = (short) (minValue - 1);
		System.out.printf("minimum value is %d, maximal value is %d, number of bites is %d\n", (int) minValue, (int) maxValue, (int) nBits / 8);
	}
   private static void printInfoByType(String type) {

		switch (type) {
		case "int":
			printInformationByInt();
			break;

		case "short":
			printInformationByShort();
			break;

		case "long":
			printInformationByLong();
			break;

		case "char":
			printInformationByChar();
			break;

		case "byte":
			printInformationByByte();
			break;

		default:
			System.out.println("exit");
			break;

		}
   }
}
