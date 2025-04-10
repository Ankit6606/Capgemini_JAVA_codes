package LinkedList;

public class IndexOutOfBoundException extends RuntimeException{
	private static String message = "Index not found";
	public IndexOutOfBoundException() {
		super(message);
	}
	public IndexOutOfBoundException(String message) {
		super(message);
	}
}
