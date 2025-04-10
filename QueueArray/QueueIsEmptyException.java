package QueueArray;

public class QueueIsEmptyException extends RuntimeException {
	private static String message = "Queue is empty";
	public QueueIsEmptyException() {
		super(message);
	}
}
