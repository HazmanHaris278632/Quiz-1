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
		
		
		System.out.println("Amphibians name : " + salamander.getName());
		System.out.println("Colour : " + salamander.getColour());
		System.out.println("Specialty : " + salamander.getSpecial());
		System.out.println("Quantity : " + salamander.getQuantity());
		System.out.printf("Weight : %.2fkg",salamander.getWeight());
		System.out.printf("\nPrice : RM%.2f",salamander.getPrice());
		System.out.printf("\nTotal price : RM%.2f",salamander.getTotal());

		System.out.println();
		
		Amphibians frog = new Amphibians(); //Create second new object
		
		System.out.println("\nAmphibians 2");
		frog.setName();
		frog.setColour();
		frog.setSpecial();
		frog.setQuantity();
		frog.setWeight();
		frog.setPrice();
		
		

		System.out.println("\nAmphibians name : " + frog.getName());
		System.out.println("Colour : " + frog.getColour());
		System.out.println("Specialty : " + frog.getSpecial());
		System.out.println("Quantity : " + frog.getQuantity());
		System.out.printf("Weight : %.2fkg",frog.getWeight());
		System.out.printf("\nPrice : RM%.2f",frog.getPrice());
		System.out.printf("\nTotal price : RM%.2f",frog.getTotal());
	}
}
	
