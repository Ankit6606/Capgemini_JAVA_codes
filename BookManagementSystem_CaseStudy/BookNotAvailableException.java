package BookManagementSystem_CaseStudy;

public class BookNotAvailableException extends Exception {
	private static String message = "Book is currently not available";
	public BookNotAvailableException() {
		super(message);
	}
	public BookNotAvailableException(String message) {
		super(message);
	}
}
