package Lms1;
public class StringMethods1 {
	public static void main(String[] args) {
		String a=args[0].toUpperCase();
		String b=a.toLowerCase();
		int c=b.length();
		char[] d=args[0].toCharArray();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d[0]);
		System.out.println(d[d.length-1]);
		
		
		
	}

}