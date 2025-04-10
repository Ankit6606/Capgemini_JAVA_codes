package LinkedList;

public class SinglyLL {
	private Node head;
	private Node tail;
	private int size;
	
	public boolean isEmpty() {
		return head == null && tail ==null;
	}
	private class Node{
		int value;
		Node next;
		Node(int value){
			this.value = value;
		}
	}
	
	public boolean append(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head = node;
			tail = node;
		}else {
			tail.next = node;
			tail = node;
		}
		size++;
		return true;
	}
	public boolean prepend(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head = node;
			tail = node;
		}else {
			node.next = head;
			head = node;
		}
		size++;
		return true;
	}
	
	public boolean insert(int value, int index) {
		if(index<=0)return prepend(value);
		else if(index>=size)return append(value);
		else {
			Node node = new Node(value);
			Node temp = head;
			while(--index>0) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
		}
		size++;
		return true;
	}
	public boolean checkDelete() {
		if(isEmpty()) {
			return false;
		}
		else if(size == 1) {
			head = null;
			tail = null;
			
		}
		return true;		
	}
	
	public boolean deleteFirst() {
		if(size == 0 || size == 1) return checkDelete();
		else {
			head = head.next;
		}
		size--;
		return true;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean deleteLast() {
		if(size == 0 || size == 1) return checkDelete();
		else {
			Node temp = head;
			while(temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
		}
		size--;
		return true;	
	}
	
	public boolean delete(int index) {
		if(size == 0 || size == 1)
			return checkDelete();
		else {
			if(index == 0) {
				return deleteFirst();
			}
			else if(index == size-1) {
				return deleteLast();
			}
			else {
				Node temp = head;
				while(--index>0) {
					temp = temp.next;
				}
				temp.next = temp.next.next;
			}
		}
		size--;
		return true;
	}
	
	public void reverse() {
		Node temp = head;
		Node prev = null;
		tail = head;
		while(temp!=null) {
			Node nexttemp = temp.next;
			temp.next = prev;
			prev = temp;
			temp = nexttemp;
		}
		head = prev;
	}
	
	public void display() {
		Node temp = head;
		StringBuffer sb = new StringBuffer();
		while(temp != null) {
			sb.append(temp == tail ? temp.value : temp.value+"->");
			temp = temp.next;
		}
		System.out.println(sb);
	}

}
