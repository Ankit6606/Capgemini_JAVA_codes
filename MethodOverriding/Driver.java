
package MethodOverriding;

public class Driver {
	public static void main(String[] args) {
		Son s = (Son)new Son().createObject();
		System.out.println(s);
	}
}
