package exercise14;

//DESCRIPTION EXERCISE: 
//- Write a method named getOddDigitSum with one parameter of type int called number
//- The method should return the sum of the odd digits within the number 
//- If the number is negative, the method should return -1 to indicate an invalid value
//NOTE: 
//- The method getEvenDigitSum should be defined as public static like 

public class OddDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Output: " + getOddDigitSum(123456));
		System.out.println("Output: " + getOddDigitSum(13579));
		System.out.println("Output: " + getOddDigitSum(24680));
		System.out.println("Output: " + getOddDigitSum(-12345));
		System.out.println("Output: " + getOddDigitSum(0));

	}
	
	public static int getOddDigitSum(int num) {
		
		if (num < 0) {
			return -1;
		}
		
		int sum = 0;
		
		while (num > 0) {
			int digit = num % 10;
			if (digit % 2 != 0) {
				sum += digit;
			}
			num /= 10;
		}
		return sum;
		
	}

}
