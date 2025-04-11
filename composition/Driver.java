package composition;

public class Driver {
	public static void main(String[] args) {
		House house = new House("white", 600);
		System.out.println(house.getColor()+"\n"+house.getRoom().getArea());
		house = null;
		 
	}
	
}
 