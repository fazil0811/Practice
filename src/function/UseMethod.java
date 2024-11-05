package function;
public class UseMethod {
	public static void main(String[] args) {
		Method m1=new Method();
		m1.findname1();
		m1.findname2("fazil");
		System.out.println(m1.findname3());
		System.out.println(m1.findname4("udhaya"));
	}
}
