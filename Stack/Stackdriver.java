package Stack;

public class Stackdriver {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.peek());
		s.display();
	}
	
}
