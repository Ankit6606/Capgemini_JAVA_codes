package Food_Delivery_System_CaseStudy;

public class OrderLimitExceedException extends RuntimeException {
	public OrderLimitExceedException(String message) {
		super(message); 
	}
}
