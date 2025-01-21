package exercise10;

public class Manager extends Employee {
	
	private String department;

	public Manager(int id, String name, double salary, String department) {
		super(id, name, salary);
		this.department = department;
		// TODO Auto-generated constructor stub
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public void display() {
		super.display();
		System.out.println("Department: " + department);
	}
}
