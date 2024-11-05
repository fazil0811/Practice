package basicsexceptional;
public class Ex2 {
	public static void main(String[] args) {
		String a=null;
		try {
		String b=a.toUpperCase();
		System.out.println(b);
		}
//		catch(NullPointerException nu) {
//			System.out.println("caught");
//			System.out.println(nu.getMessage());
//			nu.printStackTrace();
//		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("thank you");
	}

}
