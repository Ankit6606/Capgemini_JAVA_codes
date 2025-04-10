
package CaseStudy;

public class VehicleTest {
	public static void main(String[] args) {
        Vehicle car = new Car("Fortuner", 60);
        Vehicle bike = new Bike("Scrambler", 40);
        Vehicle truck = new Truck("Cargo Truck", 30);

        Vehicle[] vehicles = {car, bike, truck};
        for (Vehicle v : vehicles) {
            v.start();
            v.accelerate(10);
            v.displayType();
            System.out.println("Current Speed: " + v.getCurrentSpeed());
            v.brake(5);
            System.out.println("Speed after braking: " + v.getCurrentSpeed());
            v.stop();
            System.out.println("----------------------");
        }
    }
}


 