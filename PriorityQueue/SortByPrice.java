package PriorityQueue;

import java.util.Comparator;

public class SortByPrice implements Comparator<Mobile>{
	@Override
	public int compare(Mobile o1, Mobile o2) {
		return Double.compare(o1.getPrice(), o2.getPrice());
	}

}
