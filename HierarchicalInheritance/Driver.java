package HierarchicalInheritance;

public class Driver {
	public static void main(String[] args) {
		Bike b = new Bike(true, "WB45C3456", "Triumph", "Scrambler 400x", 100, true );
		b.displayDetails();
		b.rentVehicle();
		Car c = new Car(4, "WB43B234", "Tata", "Harrier", 250.68, false);
		c.displayDetails();
		c.rentVehicle();
	}
}
