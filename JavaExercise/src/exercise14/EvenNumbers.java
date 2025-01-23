package exercise14;

//Create a Java program to display even numbers from 1 to 100

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 100;
		System.out.print("List of Even Numbers: ");
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
