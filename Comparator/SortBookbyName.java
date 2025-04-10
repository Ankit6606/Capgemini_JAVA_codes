package Comparator;
import java.util.*;
public class SortBookbyName implements Comparator<Book> {
	//Custom Sorting by name
	@Override
	public int compare(Book o1, Book o2) {
		return o1.name.compareTo(o2.name);
	}
}
 