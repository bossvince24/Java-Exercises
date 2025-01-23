package exercise6;

//mag gegenerate ka ng 1-49 with no same number
//
//Note: Dapat walang duplicate number
// 
//Bawal ka gumamit ng Collections, eg. List, Set, Map
// 
//Array lang talaga, ex. int[ ]
 
import java.util.Random;

public class lottoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 6;
		int min = 1;
		int max = 49;
		
		int[] numbers = new int[size];
		Random random = new Random();
		
		for (int i = 0; i < size; i++) {
			numbers[i] = random.nextInt(max - min + 1) + min;
		}
		System.out.println("Generated Lotto Numbers: ");
		for (int num : numbers) {
			System.out.println(num + " ");
		}
	}

}
