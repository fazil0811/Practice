package basicsexceptional;
public class Ex1 {
	public static void main(String[] args) {
		System.out.println("hi");
		int a=24;
		int b=0;
		
		try {
		int c=a/b;
		System.out.println(c);
	}
		
		catch(ArithmeticException ar) {
			System.out.println("caught");
			System.out.println(ar.getMessage());
			ar.printStackTrace();
		}
		
		finally {
			System.out.println("finally block");
		}
	}
}