package exercise10;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Employee Info: ");
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Salary: " + salary);
	}
	
	
}
