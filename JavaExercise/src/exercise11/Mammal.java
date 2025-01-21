package exercise11;

public class Mammal extends Animal {
	private String furColor;

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	@Override
	public String toString() {
		return "Mammal [furColor=" + furColor + "]";
	}
	
	public void showFurColor() {
		System.out.println("FurColor: " + furColor);
	}
}
