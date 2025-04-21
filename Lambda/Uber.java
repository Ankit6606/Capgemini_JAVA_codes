package Lambda;

public class Uber {
	public static void main(String[] args) {
//		Vehicle car = new Vehicle() {
//			@Override
//			public void start() {
//				System.out.println("Car is starting");	
//			}
//		};
//		Vehicle bike  = ()-> {
//			System.out.println("Bike is starting");
//		};
//		Vehicle scooty = ()-> System.out.println("Scooty is starting");
//		Vehicle truck = a -> System.out.println("Truck is strating "+a);
//		Vehicle toto = (a, b)->{
//			return a+b;
//		};
		Vehicle toto = (a,b)-> a+b;
		int res = toto.start(10, 20);
		System.out.println(res);
		
		
	}
}
