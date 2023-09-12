
// Class
public class Product {
	
	// Properties
	private String name;
	
	private int price;
	
	private int totalPrice;
	
	private int taxPercentage;
	
	// public int telephone; // hij haalt de 0 weg en + is niet toegestaan
	// public String telephone; // +31641248773 werkt wel!
	
	
	// Constructors (initialisatie van de waarden)
	public Product() {
		System.out.println("In constructor");
		name = "default";
		price = 10;
		taxPercentage = 21;
	}
	
	// onderstaande constructor heet ook Product maar die heeft een argument
	// dus is zo te onderscheiden
	public Product(String name) {
		System.out.println("In constructor met naam " + name);
	}
	
	
	// Methods
	public void printName() {
		System.out.println("Naam is " + name);
	}
	
	// onderstaande method aanroepen in application als bijv. p1.defineName("Laptop");
	public void defineName(String name) {
		this.name = name; // this refereert naar de object name, bijv. p1
	}
	
	public void calculateTotalPrice() {
		totalPrice = price * (taxPercentage/100);
	}
	
	public String description() {
		String a = "Naam product is " + name + " en prijs is " + price;
		return a;
		
		// alles onder de return wordt nooit uitgevoerd
	}

	
	// Setters & Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price <=10000000)
		this.price = price;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(int taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
}
