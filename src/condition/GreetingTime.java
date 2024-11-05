package condition;
public class GreetingTime {
	public static void main(String[] args) {
		int time=23;
		if(time>=6&&time<=11) {
			System.out.println("good moring");
		}
		else if(time>=12&&time<=17) {
			System.out.println("good afternoon");
		}
		else if(time>=18&&time<=20) {
			System.out.println("good evening");
		}
		else if(time>=21&&time<=24) {
			System.out.println("good night");
		}
	}

}
