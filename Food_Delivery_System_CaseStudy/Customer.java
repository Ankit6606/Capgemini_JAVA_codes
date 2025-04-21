package Food_Delivery_System_CaseStudy;

public class Customer {
	private String name;
	private boolean loggedin;
	public Customer(String name, boolean loggedin) {
		this.name = name;
		this.loggedin = loggedin;
	}
	public boolean isLoggedIn() {
		return loggedin;
	}
}
