
package ATMException;

public class DriverATM {
	public static void main(String[] args) {
		ATM a = new ATM(2000);
		a.setPin(1234);
		a.withdraw(100, 234);
	}
}

 