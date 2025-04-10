package Practice;

public class WrapperClass {
	public static void main(String[] args) {
		double d = 34.890;
		Double d1 = Double.valueOf(d);
		double d2 = d1.doubleValue();
		System.out.println(d+" "+d1+" "+d2);
		long l = 7894356943l;
		Long l1 = Long.valueOf(l);
		long l2 = l1.longValue();
		System.out.println(l+" "+l1+" "+l2);
		float f = 3.14f;
		Float f1 = Float.valueOf(f);
		float f2 = f1.floatValue();
		System.out.println(f+" "+f1+" "+f2);
		byte b = 34;
		Byte b1 = Byte.valueOf(b);
		byte b2 = b1.byteValue();
		System.out.println(b+" "+b1+" "+b2);
		double d4 = Double.parseDouble("123.45");
	}
}

