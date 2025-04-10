package Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
	private int[] data;
	private int pointer = -1;
	final private int initial_capacity = 10;
	
	Stack(){
		data = new int[initial_capacity];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return data[pointer];
	}
	
	public boolean push(int value) {
		if(isFull()) {
			data = Arrays.copyOf(data, data.length*2);
		}
		pointer++;
		data[pointer] = value;
		return true;
	}
	
	public int pop() { 
		if(isEmpty()) {
			throw new EmptyStackException();//throw a custom exception
		}
		int val = data[pointer];
		pointer--;
		return val;
	}
	
	public boolean isEmpty() {
		return pointer == -1;
	}
	public boolean isFull() {
		return pointer == data.length-1;
	}
	
	public void display() {
//		System.out.println(pointer);
		for(int i = 0; i<=pointer; i++) {
			System.out.print(data[i]+" ");
		}
	}
}
