
public class Bird extends Animal {
	
	private int featherCount;

	public int getFeatherCount() {
		return featherCount;
	}

	public void setFeatherCount(int featherCount) {
		this.featherCount = featherCount;
	}

	public void makeSound() {
		System.out.println("Cheep!");
	}
}
