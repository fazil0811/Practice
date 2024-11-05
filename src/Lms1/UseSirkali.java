package Lms1;
public class UseSirkali {
	public static void main(String[] args) {
		String[] a=args[0].split(",");
		Sirkali s1=new Sirkali();
		s1.name=a[0];
		s1.age=Integer.parseInt(a[1]);
		s1.weight=Float.parseFloat(a[2]);
		System.out.println(s1.name+s1.age+s1.weight);
	}

}
