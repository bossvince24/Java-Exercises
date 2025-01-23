package exercise14;

//DESCRIPTION EXERCISE: 
//	  - Write a method named getEvenDigitSum with one parameter of type int called number
//	  - The method should return the sum of the even digits within the number 
//	  - If the number is negative, the method should return -1 to indicate an invalid value
//	NOTE: 
//	  - The method getEvenDigitSum should be defined as public static like 
	  
public class EvenDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Output: " + getEvenDigitSum(252));
		System.out.println("Output: " + getEvenDigitSum(257));
		System.out.println("Output: " + getEvenDigitSum(0));
		System.out.println("Output: " + getEvenDigitSum(5));
		System.out.println("Output: " + getEvenDigitSum(-10));
		
	}
	
	public static int getEvenDigitSum(int num) {
		
		int sum = 0;
		
		if (num < 0) {
			return -1;
		}
		
		while (num > 0) {
			int digit = num % 10;
			if (digit % 2 == 0) {
				sum += digit;
			}
			num /= 10;
		}
		return sum;
	}

}
