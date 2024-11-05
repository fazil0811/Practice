package condition;
public class Task8 {
	public static void main(String[] args) {
		int mark=70;
		if(mark<=100&&mark>=90) {
			System.out.println("first class");
		}
		else if(mark<90&&mark>=70) {
			System.out.println("second class");
		}
		else if(mark<70&&mark>=40) {
			System.out.println("third class");
		}
		else if(mark<40&&mark>=0) {
			System.out.println("fail");
		}
		else {
			System.out.println("invalid mark");
		}
		
		}
	}

