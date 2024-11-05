package java8;

public class UseBus {
	public static void main(String[] args) {

		Bus2 b1 = new Bus2();
		System.out.println(b1.name("fazil"));
		System.out.println(Bus1.num1(44));
		System.out.println(Bus1.num2(43.6f));
		System.out.println(Bus1.num3(4, 2));
		System.out.println(b1.num4(24, 8));
		System.out.println(b1.word1(""));
		System.out.println(b1.word2("hi"));

	}
}

interface Bus1 {
	public String name(String a);

	public static int num1(int a) {
		return a;
	}

	public static float num2(float price) {
		return price;
	}

	public static int num3(int a, int b) {
		return a * b;
	}

	public default int num4(int a, int b) {
		return a - b;
	}

	public default String word1(String a) {
		return "hello";
	}

	public default String word2(String a) {
		return "chennai";
	}
}

class Bus2 implements Bus1 {
	public String name(String a) {
		return a;
	}

	public String word1(String a) {
		return "hi";
	}
}