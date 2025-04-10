package DoublyLinkedList;

public class DoublyLL {
	private Node head;
	private Node tail;
	private int size;
	private class Node{
		int value;
		Node next;
		Node prev;
		
		Node(int value){
			this.value = value;
		}
	}
	private boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public boolean createNode(int value) {
		Node node = new Node(value);
		if(isEmpty()) { 
			head = node;
			tail = node;
			node.next = null;
			node.prev = null;
		}
		else {
			node.prev = tail;
			tail.next = node;
			tail = tail.next;
			tail.next = null;
		}
		size++;
		return true;
	}
	
	public boolean append(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			return createNode(value);
		}else {
			node.prev = tail;
			tail.next = node;
			tail = node;
			tail.next = null;
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
			head.prev = node;
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
			node.prev = temp;
			temp.next = node;
		}
		size++;
		return true;
	}
	
	private boolean checkDelete() {
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
			head.prev = null;
		}
		size--;
		return true;
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
				temp.next.prev = temp;
			}
		}
		size--;
		return true;
	}
	
	public int search(int n) {
		Node temp = head;
		int cnt = 0;
		while(temp!=null) {
			if(temp.value == n) {
				return cnt;
			}
			cnt++;
			temp = temp.next;
		}
		return -1;
	}
	
	public boolean update(int index, int value) {
		if(size==0)return false;
		if(index<0 || index>size-1) return false;
		Node temp = head;
		while(index>0) {
			temp = temp.next;
			index--;
		}
		temp.value = value;
		return true;
	}
	
	public void reverse() {
		Node temp = head;
		Node previ = null;
		tail = head;
		while(temp!=null) {
			Node nexttemp = temp.next;
			temp.next = previ;
			temp.prev = nexttemp;
			previ = temp;
			temp = nexttemp;
		}
		head = previ;
	}
	
	public void display() {
		Node temp = head;
		StringBuffer sb = new StringBuffer();
		while(temp != null) {
			sb.append(temp == tail ? temp.value : temp.value+"->");
			temp = temp.next;
		}
		System.out.println(sb);
//		System.out.println(tail.prev.value);
	}
	
	public void displayReverse() {
		Node temp = tail;
		StringBuffer sb = new StringBuffer();
		while(temp != null) {
			sb.append(temp == head ? temp.value : temp.value+"->");
			temp = temp.prev;
		}
		System.out.println(sb);
	}
}

