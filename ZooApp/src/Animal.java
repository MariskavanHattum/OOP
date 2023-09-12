
public abstract class Animal {
	
	protected String name; // protected: alle subclasses hebben ook property name
	
	protected int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void makeSound(); // dwingt af dat alle subclasses deze abstract method moeten implementeren
	
	

}
