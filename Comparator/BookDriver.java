package Comparator;
import java.util.*;
public class BookDriver {
	public static void main(String[] args) {
		Book[] books= {
				new Book(1,"The Fault in our Stars", 700.23),
				new Book(4,"Harry Potter The Goblet of Fire", 1000.23),
				new Book(2,"Mein Kampf", 800.12),
				new Book(3,"Julius Caesar", 499.78)
		};
		System.out.println("Choose the order of sorting:\n1.Default\n2.Name\n3.Price");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order number: ");
		int n = sc.nextInt();
		switch (n) {
		case 1: {
			Arrays.sort(books);
			break;
		}
		case 2: {
			SortBookbyName byname = new SortBookbyName();
			Arrays.sort(books, byname);
			break;
		}
		case 3: {
			SortBookbyPrice byprice = new SortBookbyPrice();
			Arrays.sort(books, byprice);
			break;
		}
		default:{
			System.out.println("Invalid option");
			break;
		}	
		}
		System.out.println();
		for(Book book : books) {
			System.out.println(book);
		}
	}
}
 