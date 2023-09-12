
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		Product p1 = new Product(); // initialization = declaration + assignment
		p1.setName("TV");
		p1.setPrice(20);
		p1.printName();
		
		// mag ook:
		Product p2;			// declaration
		p2 = new Product();	// assignment, gebruikt 1e constructor
		// p2.name = "wasmachine";
		p2.printName();
		
		Product p3 = new Product("Fiets"); // gebruikt 2e constructor
		System.out.println(p3.getName());
		
		String antwoord = p1.description();
		System.out.println("Antwoord = " + antwoord);
		
		Werknemer w1 = new Werknemer();
		w1.naamWerknemer = "Niek";
		w1.leeftijd = 32;
		w1.bedrijfNaam = "Working Talent";
		w1.actief = true;
		w1.leukWerk = true;
		w1.printNaamWerknemer();
		w1.printBedrijfNaam();
		
		Werknemer w2 = new Werknemer();
		w2.naamWerknemer = "Jorrit";
		w2.leeftijd = 40;
		w2.bedrijfNaam = "Working Talent";
		w2.actief = true;
		w2.leukWerk = true;
		w2.printNaamWerknemer();
		w2.printBedrijfNaam();
		
		Werknemer w3 = new Werknemer();
		w3.stelAllesIn("Lokke", 30, true, "Working Talent", true);
		String antwoord2 = w3.description2();
		System.out.println(antwoord2);
		
		Werknemer w4 = new Werknemer("Arnoud", 35, true, "Working Talent", true);
		System.out.println(w4.naamWerknemer);
	}

}
