
package ATMException;

public class ATM {
	private double money;
	private int pin;
	ATM(double money){
		this.money = money;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getPin() {
		return pin;
	}
	void withdraw(double money, int pin) {
		if(money<=0)
			throw new InvalidMoney();
		if(pin != getPin())
			throw new IncorrectPin();
	}
}


 