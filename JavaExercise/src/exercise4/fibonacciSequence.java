package exercise4;

//ang parameter nya is isa lang, which is integer
//
//for example ang value is 6
// 
//ang magiging output nya is
// 
//1 1 2 3 5 8
// 
//6 digits ung magiging output dpat nasa isang line lang
 
public class fibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6;
		
		int firstValue = 1;
		int secondValue = 1;
		
		System.out.println("Fibonacci sequence up to " + n + " terms:");
		
		for (int i = 1; i <= n; i++) {
			System.out.print(firstValue + ", " );
			
			int result = firstValue + secondValue;
			firstValue = secondValue;
			secondValue = result;
		}
	}

}
