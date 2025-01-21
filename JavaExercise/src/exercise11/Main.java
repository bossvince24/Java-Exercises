package exercise11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		Mammal m = new Mammal();
		
		a.setSpecies("Lion");
		a.setAge(5);
		m.setFurColor("Golden");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter species: ");
		a.setSpecies(scanner.nextLine());
		
		System.out.print("Enter age: ");
		a.setAge(scanner.nextInt());
		
		scanner.nextLine();
		System.out.print("Enter Fur Color: ");
		m.setFurColor(scanner.nextLine());
		
		scanner.close();
		
		System.out.println("Mammal:Species:" + a.getSpecies() + ",Age:" + a.getAge() + ",Fur Color:" + m.getFurColor());
	}

}
