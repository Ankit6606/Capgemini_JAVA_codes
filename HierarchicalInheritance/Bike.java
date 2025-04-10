package HierarchicalInheritance;

public class Bike extends Vehicle{
	private boolean hasGear;
//	private String vehicleNumber;
//	private String brand;
//	private String model;
//	private double rentalPricePerDay;
//	private boolean isAvailable;
	Bike(){
		System.out.println("Bike is loaded");
	}
	Bike(boolean hasGear, String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable){
		super(vehicleNumber, brand, model, rentalPricePerDay, isAvailable);
		this.hasGear = hasGear;
	}
	void displayDetails() {
		if(hasGear)System.out.println("Gear is present");
		else System.out.println("Gear is not present");
		super.displayDetails();
		
	}
}
