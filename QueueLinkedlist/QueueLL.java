package QueueLinkedlist;
import SinglyandCircularLinkedList.SinglyLL;
public class QueueLL {
	private SinglyLL data;
	private int pointer = -1;
	public QueueLL() {
		data = new SinglyLL();
	}
	public boolean insert(int value) {
		data.append(value); 
		pointer++;
		return true;
	}
	public boolean delete() {
		if(isEmpty())return false;
		data.deleteFirst();
		pointer--;
		return true;
	}
	public boolean isEmpty() {
		return data.isEmpty();
	}
}
