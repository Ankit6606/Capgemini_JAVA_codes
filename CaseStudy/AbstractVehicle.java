package CaseStudy;

abstract class AbstractVehicle implements Vehicle{
	protected String name;
	protected int speed;
	AbstractVehicle(String name, int speed){
		this.name = name;
		this.speed = speed;
	}
	void displaydetails() {
		System.out.println(this.name);
		System.out.println(this.speed);
	}
	public void accelerate(int increment) {
		this.speed += increment;
	}
	public void brake(int decrement) {
		this.speed -= decrement;
	}
	public int getCurrentSpeed() {
		return speed;
	}
}
 