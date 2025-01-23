package exercise13;

//DESCRIPTION EXERCISE: 
//- Write a method named sumFirstAndLastDigit with one parameter of type int called number
//- The method needs to find the first and last digit of the parameter number passed to 
//the method, using a loop and return the sum of the first and the last 
//digit of that number
//- If the number is negative then the method needs to return -1 to indicate an invalid value 
//	NOTE: 
//- The method sumFirstAndLastDigit needs to be defined as public static
//- As per the exercise solution solution, do not add a main method
	  
public class FirstAndLastDigit {
	
	public static void main(String[] args) {
		System.out.println("Output: " + sumFirstAndLastDigit(252));
		System.out.println("Output: " + sumFirstAndLastDigit(257));
		System.out.println("Output: " + sumFirstAndLastDigit(0));
		System.out.println("Output: " + sumFirstAndLastDigit(5));
		System.out.println("Output: " + sumFirstAndLastDigit(-10));
	}
	
	public static int sumFirstAndLastDigit(int num) {
		
		if (num < 0) {
			return -1;
		}
		
		int firstDigit = num;
		while (firstDigit >= 10) {
			firstDigit /= 10;
			
		}
		int lastDigit = num % 10;
		return firstDigit + lastDigit ;
		}
}
