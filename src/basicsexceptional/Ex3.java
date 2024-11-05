package basicsexceptional;
public class Ex3 {
	public static void main(String[] args) {
		String a="fazil";
		try {
		int b=Integer.parseInt(a);
		System.out.println(b);
	}
		
		catch(NumberFormatException nf) {
			System.out.println("caught");
			System.out.println(nf.getMessage());
			nf.printStackTrace();
		}
		
		finally {
			System.out.println("finally");
		}
	}

}
