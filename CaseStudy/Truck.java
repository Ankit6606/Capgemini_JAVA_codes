
package CaseStudy;

public class Truck extends AbstractVehicle{
	  public Truck(String name, int speed) {
	        super(name, speed);
	    }

	    @Override
	    public void start() {
	        System.out.println(name + " is starting.");
	    }

	    @Override
	    public void stop() {
	        System.out.println(name + " is stopping.");
	    }

	    @Override
	    public void displayType() {
	        System.out.println("This is a Truck.");
	    }
} 

