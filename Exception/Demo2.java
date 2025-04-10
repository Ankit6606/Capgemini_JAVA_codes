package Exception;

public class Demo2 {
	public static int returnInteger() {
		try {
			return 1;
		}catch(Exception e){
			return 2;
		}finally {
			return 3;
		}
	}
	public static void main(String[] args) {
		System.out.println(returnInteger());
	}
}
