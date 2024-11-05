package basicsexceptional;
public class FindLoanEligibility {

	public static void main(String[] args)throws CibilScore {
		int score=432;
		if(score>700 && score<800) {
			System.out.println("First eligible");
		}
		else if(score>600 && score<700) {
			System.out.println("second eligible");
		}
		else {
			throw new CibilScore("not eligible");
		}
	}
}
		
		
		
		
		class CibilScore extends Exception {
			public CibilScore(String a) {
				System.out.println(a);
			}
		}