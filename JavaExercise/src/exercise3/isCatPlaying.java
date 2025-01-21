package exercise3;

//- The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive). Unless it is summer, then 
//the upper limit is 45 (inclusive) instead of 35. 
//- Write a method isCatPlaying that has 2 parameters
//- Method needs to return if the cat is playing, otherwise, return false. 
//- 1st parameter should be of type boolean and be named summer - it represents if it is summer 
//- 2nd parameter represents the temperature and is of type int with the name temperature.
//
//Ex. (true, 37)
//Output. True
//
//Ex. (false, 39)
//output. False
//
//Ex. (true, 24)
//Output. False
//
//Ex. (true, 44)
//Output. True


import java.util.Scanner;

public class isCatPlaying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isSummer = true;
		int temperature;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Value: ");
		temperature = scanner.nextInt();
		
		System.out.println("Output: " + (isSummer ? temperature >= 25 && temperature <= 45 : temperature >= 25 && temperature <=35));
	}

}
