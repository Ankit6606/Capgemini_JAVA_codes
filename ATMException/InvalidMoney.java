
package ATMException;

public class InvalidMoney extends RuntimeException{
	private static String message = "Can't withdraw money";
	InvalidMoney(){
		super(message);
	}
	InvalidMoney(String message){
		super(message);
	}
}
 