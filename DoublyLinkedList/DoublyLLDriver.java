package DoublyLinkedList;

public class DoublyLLDriver {
	public static void main(String[] args) {
		DoublyLL dll = new DoublyLL();
		dll.createNode(10);
		dll.append(20);
		dll.append(30);
		dll.prepend(5);
		dll.append(60);
		dll.append(70);
		dll.display();
		dll.delete(1);
		dll.display();
		dll.displayReverse();
		dll.reverse();
		dll.display();
		dll.insert(34, 2);
		dll.display();
	}
}

 