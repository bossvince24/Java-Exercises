package exercise10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee(1, "Vince", 15000.00);
		employee.display();
		
		System.out.println();
		
		Manager manager = new Manager(2, "John", 20000.00, "IT");
		manager.display();
		
		System.out.println();
		
		employee.setName("Alex");
		employee.setId(2);
		employee.setSalary(40000.00);
		employee.display();
		
		System.out.println();
		
		manager.setId(3);
		manager.setName("Vincent");
		manager.setSalary(50000.00);
		manager.setDepartment("ITSMD");
		manager.display();
		
	}

}
