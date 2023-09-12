import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Animal animal1 = new Animal();
//		animal1.setAge(12);
//		animal1.setName("Lion");
		
		Bird bird1 = new Bird();
		bird1.setName("Musje");
		bird1.setAge(2);
		bird1.setFeatherCount(15);
		bird1.makeSound();
		
		// Array - lijst van strings, int's
		// List - Map - Set
		
		List<Animal> animals = new ArrayList<>();
		
		// Vul de lijst
		
		animals.forEach(animal -> {
			animal.makeSound()
		});
		
	}

}
