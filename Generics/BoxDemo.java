package Generics;

public class BoxDemo {
//	private int value;
	private Object value;
	
//	BoxDemo(int value){
//		this.value=value;
//	}
	BoxDemo(Object value){
		this.value=value;
	}
	
//	public int getValue() {
//		return this.value;
//	}
	public Object getValue() {
		return this.value;
	}

}
