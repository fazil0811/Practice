package for1;
public class Ex16 {
	public static void main(String[] args) {
		int num=8;
		boolean value=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				value=true;
			}
		}
			if(value==true) {
				System.out.println("not prime");
			}
			else {
				System.out.println("prime");
			
			}
	}

}