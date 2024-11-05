package whil;
public class Aamstrong {
	public static void main(String[] args) {
		int sum=0;
		int a=153;
		int value1=a;
		while(a!=0) {
			int value=a%10;
			sum=sum+(value*value*value);
			a=a/10;
		}
		if(value1==sum) {
			System.out.println("amstrong");
		}
	}
}
