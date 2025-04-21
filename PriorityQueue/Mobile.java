package PriorityQueue;

public class Mobile implements Comparable<Mobile> {
	private String brand;
	private double price;
	Mobile(String brand, double price){
		this.brand = brand;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Mobile[brand: "+this.brand+", price: "+this.price+"]";
	}
	
	@Override
	public int compareTo(Mobile o) {
		return this.brand.compareTo(o.brand);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
