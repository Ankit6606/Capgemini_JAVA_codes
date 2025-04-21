package PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		SortByPrice s = new SortByPrice();
		PriorityQueue<Mobile> p = new PriorityQueue<Mobile>();
		p.add(new Mobile("Apple", 83000));
		p.add(new Mobile("Oppo", 40000));
		p.add(new Mobile("Vivo", 45000));
		p.add(new Mobile("Samsung", 50000));
		System.out.println(p);
		while(!p.isEmpty()) {
			System.out.println(p.poll());
		}
	}
}
