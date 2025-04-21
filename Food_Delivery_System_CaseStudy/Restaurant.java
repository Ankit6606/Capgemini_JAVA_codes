package Food_Delivery_System_CaseStudy;

import java.util.*;
public class Restaurant {
	private String name;
	private List<String> menu;
	public Restaurant(String name, List<String>menu) {
		this.name = name;
		this.menu = menu;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getMenu() {
		return menu;
	}
	public void setMenu(List<String> menu) {
		this.menu = menu;
	}
	public boolean hasItem(String item) {
		if(!menu.contains(item)) return false;
		return true;
	}
}
