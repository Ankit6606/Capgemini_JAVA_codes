package Stack_LL;

public class StackLLDriver {
	public static void main(String[] args) {
		StackUsingLL sl = new StackUsingLL();
		sl.push(10);
		sl.push(20);
		sl.push(30);
		System.out.println(sl.peek());
		sl.push(50);
		sl.pop();
		sl.display();
	}
}
 