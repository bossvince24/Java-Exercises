package exercise5;

//DESCRIPTION EXERCISE: 
//	  - Write a method named canPack with 3 parameters of type int named bigCount, smallCount and goal
//	  - The parameter bigCount represents the count of big flour bags(5 kilos each)
//	  - The parameter smallCount represents the count of small flour bag (1 kilo each)
//	  - The parameter goal represents the goal amount of kilos of flour needed to assemble a package 
//	  - Therefore, the sum of kilos of bigCount and smallCount must be at least eqaul to the value of goal. The method should return true if it
//	    is possible to make a package with goal kilos of flour
//	  - If the sum is greater than goal, ensure that only full bags are used towards the goal amount. 
//	  - If any of the parameters are negative, return false.
//	 
//	 
//	Ex. (1, 0, 4)
//	Output. False
//	 
//	Ex. (1, 2, 6)
//	Output. True
//	 
//	Ex. (2, 3, 9)
//	Output. False

import java.util.Scanner;

public class canFlourPack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bigCount;
		int smallCount;
		int goal;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Big Count Value: ");
		bigCount = scanner.nextInt();
		System.out.print("Small Count Value: ");
		smallCount = scanner.nextInt();
		System.out.print("Goal Value: ");
		goal = scanner.nextInt();
		
		boolean result = canPack(bigCount, smallCount, goal);
		System.out.println(result);
		
//		int bigBag = bigCount * bigCountValue;
//		int remainingGoal = goal - (bigBag * bigCount);
		
	}
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		
		int bigCountWeight = bigCount * 5;
		int smallCountWeight = smallCount;
		
		if (bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		} else {
			if (bigCountWeight >= goal && bigCountWeight % goal == 0) {
				return true;
			} else if (bigCountWeight + smallCountWeight >= goal && bigCountWeight % goal == 0) {
				return true;
			} else if (bigCountWeight < goal && bigCountWeight + smallCountWeight >= goal) {
				return true;
			} else {
				return false;
			}
		}
	}
}
