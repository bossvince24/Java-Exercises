package exercise14;

//Create a program that will check whether Odd number or Even Number

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("The number " + num + " is Even Number");
		} else {
			System.out.println("The number " + num + " is Odd Number");
		}
	}

}
