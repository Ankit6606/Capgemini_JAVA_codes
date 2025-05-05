
package ATMException;

public class DriverATM {
	public static void main(String[] args) throws InvalidMoney {
		ATM a = new ATM(2000);
		a.setPin(1234);
		a.withdraw(-10, 234);
		//Using try catch block
//		try {
//			a.withdraw(-10, 234);//Invalid money
//		} catch (InvalidMoney e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
	}
}

 