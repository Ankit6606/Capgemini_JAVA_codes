package HierarchicalInheritance;

public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	Vehicle(){
		System.out.println("Vehicle is loaded");
	}
	
	Vehicle(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable){
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
		this.model = model;
		this.rentalPricePerDay = rentalPricePerDay;
		this.isAvailable = isAvailable;	
	}
	void displayDetails() {
		System.out.println(this.vehicleNumber);
		System.out.println(this.brand);
		System.out.println(this.model);
		System.out.println(this.rentalPricePerDay);
//		System.out.println(this.isAvailable);
	}
	void rentVehicle() {
		if(this.isAvailable == false)
			System.out.println("Vehicle is not available");
		else
			System.out.println("Vehicle is available, you can rent it");
	}
}

