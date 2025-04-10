
package aggregation;

public class Driver {
	public static void main(String[] args) {
		Room room = new Room(600);
		House house = new House("white", room);
		System.out.println(house.getColor()+"\n"+house.getRoom().getArea());
	}
}
 