package SinglyandCircularLinkedList;

public class CLLDriver {
	public static void main(String[] args) {
		CircularLL cll = new CircularLL();
		cll.createNode(10);
		cll.createNode(20);
		cll.prepend(30);
		cll.append(60);
		cll.insert(70, 2);
		cll.display();
		cll.deleteFirst();
		cll.deleteLast();
		cll.delete(0);
		cll.display();
		cll.append(89);
		cll.display();
		cll.reverse();
		cll.update(1, 90);
		cll.display();
		System.out.println(cll.search(90));
	}
}
