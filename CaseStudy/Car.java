
package CaseStudy;

class Car extends AbstractVehicle {
    public Car(String name, int speed) {
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
        System.out.println("This is a Car.");
    }
}
 