package for1;
public class For2PrimitiveArray {
	public static void main(String[] args) {
		String name="fazil";
		String a="";
		for(int i=name.length()-1;i>=0;i--) {
			a=a+name.charAt(i);
		}
		System.out.println(a);
	}
}