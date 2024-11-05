package basicsexceptional;
public class UseTask {
	public static void main(String[] args) {
		Task t=new Task();
		t.finddiv(8, 0);
	}
}

class Task {
	public void finddiv(int a,int b) {
		try {
		System.out.println(a/b);
	}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		finally {
			System.out.println("finally");
		}
	}
}