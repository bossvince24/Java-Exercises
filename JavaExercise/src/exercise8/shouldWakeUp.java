package exercise8;

//Description Exercise: 
//We have a dog that likes to bark. We need to wake up if the dog is barking at night!
//- Write a method shouldWakeUp that has 2 parameters.
//- 1st parameter should be of type boolean and be named barking, it represents if our dog is currently parking.
//- 2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0 - 23. 
//- We have to wake up if the dog is barking before 8 or after 22 hours s in that case return value
//- In all other case return false. 
//- If the hourOfDay parameter is less than 0 or greater than 23 return false.
//TIP/NOTES:
//- Use the if-else statement with multiple conditions. 
//- The shouldWakeUp method needs to be defined as public static 
//- In this code solution, no main method used.

public class shouldWakeUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isBarking = true;
		int hourDay = 24;
		
		if (hourDay < 0 || hourDay > 23) {
			System.out.println(false);
		} else if (isBarking && (hourDay < 8 || hourDay > 22)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}{

		}
	}

}
