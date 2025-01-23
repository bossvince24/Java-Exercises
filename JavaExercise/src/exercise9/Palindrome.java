package exercise9;

import java.util.Scanner;

//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and 
//removing all non-alphanumeric characters, it reads the same forward and backward. 
//Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.
//
//Example 1:
//Input: s = "A man, a plan, a canal: Panama"Output: trueExplanation: "amanaplanacanalpanama" 
//is a palindrome.
//Example 2:
//Input: s = "race a car"Output: falseExplanation: "raceacar" is not a palindrome.
//Example 3:
//Input: s = " "Output: trueExplanation: s is an empty string "" after removing 
//non-alphanumeric characters.
//Since an empty string reads the same forward and backward, 

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a palindrome: ");
		s = scanner.nextLine();
		
		int i = 0, j = s.length() - 1;
		
		while (i < j) {
			if (!Character.isLetterOrDigit(s.charAt(i))) {
				i++;
			} else if (!Character.isLetterOrDigit(s.charAt(j))) {
				j--;
			} else  if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
				 System.out.println("It is not a palindrome!");
				 scanner.close();
				 return;
			} else {
				i++;
				j--;

			}
		}
		System.out.println("It is a palindrome!");
		scanner.close();
	}

}
