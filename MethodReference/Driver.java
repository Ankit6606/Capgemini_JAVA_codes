package MethodReference;

public class Driver {
	public static void main(String[] args) {
//		Operation o = (a, b)-> a+b;
		//Operation o = Calci::add;//Static Method Referencing
		Operation o = new Calci()::add;//Non static Method Referencing
		int res = o.operate(10, 20);
		System.out.println(res);
		Operation2 o2 = Calci2::new;//Constructor Referencing
		o2.operate(); 

	}
}
