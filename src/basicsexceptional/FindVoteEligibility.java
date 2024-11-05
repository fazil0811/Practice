package basicsexceptional;

public class FindVoteEligibility {
	public static void main(String[] args)throws AgeException {
		int age=11;
		if(age>=18) {
		System.out.println("eligible for vote");
	}
	else {
		throw new AgeException("not eligible");
	}
		System.out.println("rer");
	}
}
		
	
	
	 class AgeException extends Exception {
		public AgeException(String a) {
			System.out.println(a);
		}
	}