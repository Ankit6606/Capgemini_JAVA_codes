package Generics;
//generic class
public class BoxWithGenerics<T> { //generics must be non-primitive, not primitive
	private T value;
	
	BoxWithGenerics(T value){
		this.value = value;
	}
	
	public T getValue() {
		return this.value;
	}
}
