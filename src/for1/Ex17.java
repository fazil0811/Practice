package for1;
public class Ex17 {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
//		System.out.println(a+"\n"+b);
		for(int i=1;i<=10;i++) {
			System.out.println(a);
			c=a+b;
			
			a=b;
			b=c;
			
		}
	}
	
}
