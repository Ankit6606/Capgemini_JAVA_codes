package Exception;

public class Demo {
	public static void printNumber() throws InterruptedException{
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
			Thread.sleep(2000);
		}
	}
	public static void demo() throws InterruptedException {
		printNumber();
	}
	public static void main(String[] args) {
		try {
			demo();
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
}

