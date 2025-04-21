package TreeSet_casestudy;

import java.util.TreeSet;

public class BookDriver {
	public static void main(String[] args) {
		SortBytitle s = new SortBytitle();
		SortByprice s1 = new SortByprice();
		TreeSet<Book> t = new TreeSet<Book>(s1);
		t.add(new Book(1, "ABC", 678.78));
		t.add(new Book(70, "jhbfhv", 456.89));
		t.add(new Book(4, "Harry potter", 245.90));
		for(Book i : t) {
			System.out.println(i);
		}
	}
}
