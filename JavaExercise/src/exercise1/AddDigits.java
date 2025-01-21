package exercise1;

//create a Java Program what will add the digits on a given Integer

import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an Integer: ");
		num = scanner.nextInt();
		
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		System.out.println("The sum of the digits is: " + sum);

	}

}
