package QueueArray;

import java.util.Arrays;

public class Queue {
	int[] data;
	int pointer = -1;
	int initial_capacity = 10;
	Queue(){
		data = new int[initial_capacity];
	}
	Queue(int size) {
		data = new int[size];
	}
	public boolean isFull() {
		return pointer == data.length-1;
	}
	public boolean isEmpty() {
		return pointer == -1;
	}
	public boolean insert(int value) {
		if(isFull())data = Arrays.copyOf(data, data.length*2);
		pointer++;
		data[pointer] = value;
		return true;
	}
	public boolean delete() {
		if(isEmpty())throw new QueueIsEmptyException();
		for(int i = 1; i<pointer; i++) {
			data[i-1] = data[i];
		}
		pointer--;
		return true;
	}
	
	public int getSize() {
		return pointer+1;
	}
	
	public void display() {
		for(int i = 0; i<=pointer; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}