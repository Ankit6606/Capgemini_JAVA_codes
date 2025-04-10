package SinglyandCircularLinkedList;


public class CircularLL {
	private Node head;
	private Node tail;
	private int size;
	
	private class Node{
		int value;
		Node next;
		Node(int value){
			this.value = value;
		}
	}
	public boolean isEmpty() {
		return head == null && tail ==null;
	}
	public boolean createNode(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head = node;
			tail = node;
			node.next = head;
		}
		else {
			tail.next = node;
			tail = tail.next;
			tail.next = head;
		}
		size++;
		return true;
	}
	
	public boolean prepend(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			return createNode(value); 
		}else {
			node.next = head;
			tail.next = node;
			head = node;
		}
		size++;
		return true;
	}
	
	public boolean append(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			return createNode(value);
		}else {
			tail.next = node;
			tail = node;
			node.next = head;
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
			tail.next = head;
		}
		size--;
		return true;
	}
	
	public boolean deleteLast() {
		if(size == 0 || size == 1) return checkDelete();
		else {
			Node temp = head;
			while(temp.next.next != head) {
				temp = temp.next;
			}
			temp.next = head;
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
		Node temp1 = head;
		Node prev = tail;
		
		tail = head;
		do {
			Node nexttemp = temp.next;
			temp.next = prev;
			prev = temp;
			temp = nexttemp;
		}
		while(temp!=tail);
		tail.next = prev;
		head = prev;
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
	
	public int getSize() {
		return size;
	}
	
	public void display() {
		if(isEmpty())return;
		Node temp = head;
		StringBuffer sb = new StringBuffer();
		do {
			sb.append(temp!=tail ? temp.value+"->":temp.value);
			temp = temp.next;
		}while(temp!=head); 
		sb.append("->(head)"+head.value);
		System.out.println(sb);
		
		
	}
}
