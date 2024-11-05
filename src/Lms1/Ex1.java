package Lms1;
public class Ex1 {
	public static void main(String[] args) {
		String a=args[0].toUpperCase();
		String b=a.toLowerCase();
		int c=a.length();
		boolean d=a.contains("AtchayaFazil");
		boolean e=a.equals("MohamedFazil");
		char[] f=a.toCharArray();
		char g=a.charAt(a.length()-2);
		String[] h=a.split("T");
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f[a.length()-1]);
		System.out.println(g);
		System.out.println(h[1]);
	}

}
