package exercise1;

import java.util.Scanner;

//create a Java Program what will add the digits on a given Integer


public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an Integer: ");
		num = scanner.nextInt();
		
		while (num > 0) {
			int digit = num % 10;
			sum += digit;
			num /= 10;
		}
		System.out.println("Sum of Digit: " + sum);
	}

}
