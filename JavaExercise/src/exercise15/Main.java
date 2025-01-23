package exercise15;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("Sum: " + calculator.getAdditionResult());
		System.out.println("Difference: " + calculator.getSubtractionResult());
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		System.out.println("Product: " + calculator.getMultiplicationResult());
		System.out.println("Quotient: " + calculator.getDivisionResult());
	}

}
