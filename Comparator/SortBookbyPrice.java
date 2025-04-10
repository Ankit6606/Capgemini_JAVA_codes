package Comparator;
import java.util.*;
public class SortBookbyPrice implements Comparator<Book> {
	//Custom sorting by price
	@Override
	public int compare(Book o1, Book o2) {
		return Double.compare(o1.price, o2.price);
	}
}

  