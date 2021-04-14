package Exercise;
import java.util.Scanner;

public class Amphibians {
	String name;
	String colour;
	String special;
	int quantity;
	double weight;
	double price;
	double total;
	
	Scanner a = new Scanner(System.in);
	//Create setter method
	
	public void setName() {
		System.out.println("Enter amphibians name : ");
		this.name = a.nextLine();
	}
	public void setColour() {
		System.out.println("Enter colour : ");
		this.colour = a.nextLine();
	}
	public void setSpecial() {
		System.out.println("Amphibians specialty : ");
		this.special = a.nextLine();
	}
public void setWeight() {
		System.out.print("It's weight : ");
		this.weight = a.nextDouble();
		
	}
public void setQuantity() {
	System.out.println("How many quantity to buy : ");
	this.quantity = a.nextInt();
	}
	public void setPrice() {
		System.out.println("Price is : RM");
		this.price = a.nextDouble();

	}
	
	//Create getter method
	
	public String getName() {
		return this.name;
	}
	public String getColour() {
		return this.colour;
	}
	public String getSpecial() {
		return this.special;
		
	}
	public Integer getQuantity() {
		return this.quantity;
	}
	public double getWeight() {
		return this.weight;
	}
	public double getPrice() {
		return this.price;
	}
	public double getTotal() {
		this.total = this.quantity*this.price;
		return this.total;
	}
	


}
