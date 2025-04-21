package Food_Delivery_System_CaseStudy;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Customer customer1 = new Customer("Ankit", true);
		Customer customer2 = new Customer("Jiya", true);
		Restaurant r1 = new Restaurant("KFC", Arrays.asList("Crispy Chicken", "Burger", "Chicken Popcorn", "Chicken Burger", "Pizza", "Choco Lava cake"));
		Restaurant r2 = new Restaurant("KFC", Arrays.asList("Crispy Chicken", "Burger", "Chicken Popcorn", "Chicken Burger", "Pizza", "Choco Lava cake"));
		FoodDeliverySystem f = new FoodDeliverySystem();
		List<String> order1 = f.placeOrder(customer1, r1, Arrays.asList("Burger", "Pizza"));
		System.out.println(order1);
	}
}
