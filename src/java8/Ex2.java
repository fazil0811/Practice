package java8;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println(Ex2.num);
		System.out.println(Ex2.value("peter"));
	}

	static int num = 45;

	public static String value(String a) {
		return a;
	}

	static {
		System.out.println("i am static block");
	}
}
