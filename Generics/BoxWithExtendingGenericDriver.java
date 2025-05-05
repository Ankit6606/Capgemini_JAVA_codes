package Generics;

public class BoxWithExtendingGenericDriver {
	public static void main(String[] args) {
		BoxWithExtendingGeneric<Integer,Object> box1 = new BoxWithExtendingGeneric<>(1,"Mita");
		BoxWithExtendingGeneric<Double,String> box2 = new BoxWithExtendingGeneric<>(1.0,"Mita");
		BoxWithExtendingGeneric<Byte,String> box3 = new BoxWithExtendingGeneric<>((byte)2,"Mita");
		BoxWithExtendingGeneric<Long,String> box4 = new BoxWithExtendingGeneric<>(20L,"Mita");
		BoxWithExtendingGeneric<Number,String> box5 = new BoxWithExtendingGeneric<>(2.0,"Mita");
//		BoxWithExtendingGeneric<String,String> box = new BoxWithExtendingGeneric<>("Suchi","Mita");
		//will throw compile time error //K should be Number or child of Number only
	}

}
