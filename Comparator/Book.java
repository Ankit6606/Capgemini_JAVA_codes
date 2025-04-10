
package Comparator;
import java.lang.*;
public class Book implements Comparable<Book> {
	int id;
	String name;
	double price;
	public Book(int id, String name, double price) {
		this.id = id; 
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return id+"\t"+name+"\t"+price;
	}
	
	//Default Sorting
	@Override
	public int compareTo(Book b) {
		return this.id - b.id;
	}
}
 