package Exercise;

public class Main {

	public static void main(String[] args) {

		Amphibians salamander = new Amphibians(); //Create first new object 
		System.out.println("Amphibians 1");
		salamander.setName();
		salamander.setColour();
		salamander.setSpecial();
		salamander.setQuantity();
		salamander.setWeight();
		salamander.setPrice();
		salamander.setTotal();

		System.out.println();
		
		Amphibians frog = new Amphibians(); //Create second new object
		System.out.println("Amphibians 2");
		frog.setName();
		frog.setColour();
		frog.setSpecial();
		frog.setQuantity();
		frog.setWeight();
		frog.setPrice();
		frog.setTotal();
	}
}
	
