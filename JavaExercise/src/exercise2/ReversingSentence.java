package exercise2;

//reverse the sentence without reversing the words
//ex. The quick brown fox jumps over the lazy dog
//output. dog lazy the over jumps fox brown quick

import java.util.Scanner;

public class ReversingSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Give a Word: ");
		sentence = scan.nextLine();
		
		String[] word = sentence.split(" ");
		
		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print(word[i] + " ");
		}
	}

}
