package basicsexceptional;
public class Ex4 {
	public static void main(String[] args) {
		String[] a= {"udhaya","fazil","santhanam","ajay"};
		try {
			char b=a[1].toUpperCase().charAt(7);
			System.out.println(b);
			System.out.println("executed without exception");
		}
		catch(StringIndexOutOfBoundsException si) {
			System.out.println(si);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai.getMessage());
		}
		catch(NullPointerException nu) {
			System.out.println(nu.getMessage());
		}
		catch(IndexOutOfBoundsException io) {
			System.out.println(io.getMessage());
		}
		finally {
			System.out.println("finally");
		}
	}
}
