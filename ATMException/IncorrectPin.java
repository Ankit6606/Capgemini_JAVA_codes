package ATMException;

public class IncorrectPin extends RuntimeException {//Unchecked exception throwing
	private static String message = "Pin is incorrect";
	IncorrectPin(){
		super(message);
	}
	IncorrectPin(String message){
		super(message);
	}
}

 