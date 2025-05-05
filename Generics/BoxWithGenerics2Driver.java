package Generics;

//public class BoxWithGenerics2Driver extends BoxWithGenerics2{

//	@Override
//	public void sub(Object num1, Object num2) {  // for this, you should pass object type
//		BoxDemo b1 = (BoxDemo)num1;  // then, you have to convert them explicitly
//		BoxDemo b2 = (BoxDemo)num2;
//	} 



public class BoxWithGenerics2Driver extends BoxWithGenerics2<BoxDemo> {

	@Override
	public void sub(BoxDemo num1, BoxDemo num2) { // by mentioning generics,
	}	//you can pass whatever you want for this, you should pass object type

}
