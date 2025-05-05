package BookManagementSystem_CaseStudy;

import java.util.*;


public class Library {
	ArrayList<Book> books =new ArrayList<Book>();
	Map<Integer, Member> reg_members = new HashMap<Integer, Member>();
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println(book.getTitle()+" with book id - "+book.getId()+" is added to the Book list");
	}
	
	public void registerMember(Member member) {
		reg_members.put(member.id, member);
		System.out.println(member.name+" is added to the Member list");
	}
	
	public void borrowBook(int memberId, int bookId) throws BookNotAvailableException {
		Optional<Book> optionalBook = books.stream().filter(b->b.getId()==bookId).findFirst();
		if(optionalBook.isPresent()) {
			Book book = optionalBook.get();
			if(book.isAvailable()) {
				book.borrowBook();
				System.out.println("Book id: "+bookId+" is borrowed by "+ reg_members.get(memberId).name);
			}else {
				throw new BookNotAvailableException();
			}
		}else {
			throw new BookNotAvailableException("Incorrect Book id, Book not found");
		}
	}
	public void returnBook(int bookId) throws BookNotAvailableException {
		Book book = books.stream().filter(b->b.getId()==bookId).findFirst().get();
		if(book!=null) {
			if(!book.isAvailable()) {
				book.returnBook();
				System.out.println("Book id: "+bookId+" is returned");
			}
		}else {
			throw new BookNotAvailableException("Incorrect Book id, Book not found");
		}
	}
	public void showAvailableBooks() {
		List<Book> availableBooks = books.stream().filter(b->b.isAvailable()).toList();
		availableBooks.forEach(System.out::println);
	}
	public void showBooksByAuthor(String author) {
		List<String> author_books = books.stream().filter(b->b.getAuthor().toLowerCase().equals(author.toLowerCase())).map(Book::getTitle).toList();
		for (String string : author_books) {
			System.out.println(string);
		}
		
	}
	
}
