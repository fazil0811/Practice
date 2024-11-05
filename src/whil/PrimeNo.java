package whil;
public class PrimeNo {
	public static void main(String[] args) {
		int start=12;
		int end=24;
		for(int i=start;i<end;i++) {
			boolean isValue=true;
			//System.out.println(i);
			for(int j=2;j<i;j++) {
				//System.out.println(j);
				if(i%j==0) {
					isValue=false;
					break;
				}
			}
			//System.out.println(isValue);

			if(isValue==false) {
				System.out.println("Not Prime"+i);
			}
			else {
				System.out.println("Prime"+i);
				}
		}
	}
}
