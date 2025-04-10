package SinglyandCircularLinkedList;

public class SLLDriver {
	public static void main(String[] args) {
		SinglyLL sll = new SinglyLL();
		sll.append(10);
		sll.append(20);
		sll.append(30);
		sll.prepend(50);
		sll.insert(40, 2);
		sll.insert(45, 1);
		sll.deleteLast();
//		sll.deleteLast();
		sll.display();
		sll.reverse();
		sll.display();
		sll.update(2, 100);
		sll.display();
		System.out.println(sll.search(56));
		System.out.println(sll.getSize());
		System.out.println(sll.get(2));
	}
}

 