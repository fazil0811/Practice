package Lms1;
public class UseEmployee {
	public static void main(String[]args) {
		
		String[] a=args[0].split(",");
		Employee e1=new Employee();
		e1.name=a[0];
		e1.age=Integer.parseInt(a[1]);
		e1.gender=Boolean.parseBoolean(a[2]);
		
		String[] c=args[1].split(",");
		Employee e2=new Employee();
		e2.name=c[0];
		e2.age=Integer.parseInt(c[1]);
		e2.gender=Boolean.parseBoolean(c[2]);
		
		String[] e=args[2].split(",");
		Employee e3=new Employee();
		e3.name=e[0];
		e3.age=Integer.parseInt(e[1]);
		e3.gender=Boolean.parseBoolean(e[2]);		
		
		System.out.println(e1.name+" "+e1.age+" "+e1.gender);
		System.out.println(e2.name+" "+e2.age+" "+e2.gender);
		System.out.println(e3.name+" "+e3.age+" "+e3.gender);
		
		
		
	}

}
