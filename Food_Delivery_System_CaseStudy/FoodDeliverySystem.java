package Food_Delivery_System_CaseStudy;

import java.util.List;

public class FoodDeliverySystem {

    public List<String> placeOrder(Customer customer, Restaurant restaurant, List<String> items) {

        if (!customer.isLoggedIn()) {
            System.out.println("Customer must be logged in to make an order");
            return null;
        }

        if (items.size() > 5) {
            throw new OrderLimitExceedException("Order limit exceeded");
        }

        for (String item : items) {
            if (!restaurant.hasItem(item)) {
                throw new MenuItemNotFoundException(item + " is not present in the menu");
            }
        }

        System.out.println("Order placed successfully");
        return items;
    }
}
