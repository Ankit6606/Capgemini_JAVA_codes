package Stack_LL;
import java.util.EmptyStackException;

import SinglyandCircularLinkedList.SinglyLL;

public class StackUsingLL {
	private SinglyLL list;
	private int pointer = -1;
	public StackUsingLL() {
		list = new SinglyLL();
	}
	
	public boolean push(int value) {
		pointer++;
		return list.prepend(value);//Adds element , and the new element's index value is 0
	}
	
	private boolean isEmpty() {
		return list.isEmpty();
	}
	
	public int pop() {
		if(isEmpty())throw new EmptyStackException();
		int data = list.get(0);//after push, list.get(0), returns the the last added element which is at index 0 position
		list.deleteFirst();//So in order to pop, i.e remove the last added element, we need to delete the first element here
		pointer--;
		return data;
	}
	
	public int peek() {
		if(isEmpty())throw new EmptyStackException();
		return list.get(pointer);
	}
	
	public void display() {
		list.display();
	}
	
}
 