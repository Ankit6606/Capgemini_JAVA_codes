package HierarchicalInheritance;

public class Car extends Vehicle{
	private int numberOfDoors;
	Car(){
		System.out.println("Car is loaded");
	}
	Car(int numberOfDoors, String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable){
		super(vehicleNumber, brand, model, rentalPricePerDay, isAvailable);
		this.numberOfDoors = numberOfDoors;
	}
	void displayDetails() {
		System.out.println(this.numberOfDoors);
		super.displayDetails();
	}
}
