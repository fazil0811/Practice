package for1;
public class Ex9 {
	public static void main(String[] args) {
		int total=0;
		int count=0;
		for(int i=647;i<1084;i++) {
			total=total+i;	
			count=count+1;
			System.out.println("total is "+total);
			System.out.println("count is "+count);
		}
		System.out.println("Average value is " +total/count);
	}

}


