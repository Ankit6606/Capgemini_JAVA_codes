package ATMException;

public class IncorrectPin extends RuntimeException {
	private static String message = "Pin is incorrect";
	IncorrectPin(){
		super(message);
	}
	IncorrectPin(String message){
		super(message);
	}
}

 