package BookManagementSystem_CaseStudy;

public class LibrarySystem {
	public static void main(String[] args) throws BookNotAvailableException {
		Library library = new Library();
		library.addBook(new Book(100, "Utopia", "Sir Thomas Moor"));
		library.addBook(new Book(101, "Time Machine", "H.G Wells"));
		library.addBook(new Book(102, "Macbeth", "William Shakespeare"));
		library.addBook(new Book(103, "Hamlet", "William Shakespeare"));
		library.addBook(new Book(104, "Mein Kamph", "Adolf Hitler"));
		
		Person person1 = new Member(1, "Ankit Dey");
		Person person2 = new Member(2, "Sayan Ghosh");
		Person person3 = new Member(3, "Anita Das");
		
		library.registerMember((Member)person1);
		library.registerMember((Member)person2);
		library.registerMember((Member)person3);
		
		person1.showRole();
		person2.showRole();
		
		library.showAvailableBooks();
		
		library.borrowBook(1, 101);
//		library.borrowBook(2, 101);
		
		library.returnBook(101);
		
		library.showAvailableBooks();
		
		library.showBooksByAuthor("william shakespeare");
	}
}
