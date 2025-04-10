
package composition;


public class House {
	private String color;
	private Room room;
	House(String color, double area){
		this.color = color;
		room = new Room(area);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
}

 