package exercise7;

import java.util.Scanner;

//Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
//Sample data (Monthly compounded) and Output:
//Input the investment amount: 1000
//Input the rate of interest: 10
//Input number of years: 5
//Expected Output:
//Years    FutureValue                                     
//1            1104.71                                     
//2            1220.39                                     
//3            1348.18                                     
//4            1489.35                                     
//5            1645.31

public class Investment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double investmentAmount;
		double rateOfInterest;
		int noOfYears;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Investment Amount: ");
		investmentAmount = scanner.nextDouble();
		
		System.out.print("Enter Rate of Interest: ");
		rateOfInterest = scanner.nextInt();
		
		System.out.print("Number of Years: ");
		noOfYears = scanner.nextInt();
		
		System.out.println("Years\tFutureValue");
		
		int n = 12;
		double r = rateOfInterest/100;
		
//		for (int i = 1; i <= noOfYears; i++) {
//			double futureValue = investmentAmount * Math.pow(1 + r / n, n * i);
//			System.out.printf("%d\t%.2f\n", i, futureValue);
//		}
		
		for (int i = 1; i <= noOfYears; i++) {
			double factor = 1 + r/n;
			double futureValue = investmentAmount;
			
			for (int j = 1; j <= n * i; j++) {
				futureValue *= factor;
			}
			System.out.printf("%d\t%.2f\n", i, futureValue);
		}
		
	}

}
