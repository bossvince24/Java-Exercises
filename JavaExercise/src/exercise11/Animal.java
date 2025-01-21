package exercise11;

public class Animal {
	
	private String species;
	private int age;
	
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [species=" + species + ", age=" + age + "]";
	}
	
	void showSpecies() {
		System.out.println("Species: " + species );
	}
	void showAge() {
		System.out.println("Age: " + age);
	}
}
