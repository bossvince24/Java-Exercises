package exercise14;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 100;
		System.out.println("Even Numbers are: ");
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n\nOdd Numbers are: ");

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

}
