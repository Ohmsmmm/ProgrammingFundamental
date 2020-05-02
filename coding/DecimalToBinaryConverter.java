import java.util.Scanner;

public class DecimalToBinaryConverter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int decimalNumber;
		String binaryNumber;
		System.out.print("Enter a positive integer: ");
		decimalNumber = in.nextInt();
		if (decimalNumber <= 0)
			System.out.println("ERROR: entered integer is nonpositive.");
		else {
			binaryNumber = "";
			// algorithm step by step
			// initial: binaryNumber = "", decimalNumber = 123
 			// step 1 : binaryNumber = "1 ", decimalNumber = 61
			// step 2 : binaryNumber = "11 ", decimalNumber = 30
			// step 3 : binaryNumber = "011 ", decimalNumber = 15
			// step 4 : binaryNumber = "1011 ", decimalNumber = 7
			// step 5 : binaryNumber = "1 1011 ", decimalNumber = 3
			// step 6 : binaryNumber = "11 1011 ", decimalNumber = 1
			// step 6 : binaryNumber = "111 1011 ", decimalNumber = 0
			// stop   : (decimalNumber != 0)
			while (decimalNumber != 0) {
				// add spaces to separate 4-digit groups 
				if (binaryNumber.length() % 5 == 0)
					binaryNumber = " " + binaryNumber;
				// extract last digit in binary representation
				// and add it to binaryNumber
				binaryNumber = (decimalNumber % 2) + binaryNumber;
				// cut last digit in binary representation
				decimalNumber /= 2;
			}
			System.out.println("Binary: " + binaryNumber);
		}
	}
}