package Generics;

public class BoxWithExtendingGeneric<K extends Number,V> {
//public class BoxWithExtendingGeneric<K super Number,V> {   // we can't use super, its invalid

	private K key;
	private V value;
	
	BoxWithExtendingGeneric(K key, V value){
		this.key=key;
		this.value=value;
	}
	
	public K getKey() {
		return this.key;
	}
	public void setKey(K key) {
		this.key=key;
	}
	
	public V getValue() {
		return this.value;
	}
	public void setValue(V value) {
		this.value=value;
	}

}
