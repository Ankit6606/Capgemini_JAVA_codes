
package MethodOverriding;

public class Son extends Parent{
	Parent createObject() {
		return new Son();//upcasted to Parent object
	}
}

