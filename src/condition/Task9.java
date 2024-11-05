package condition;
public class Task9 {
	public static void main(String[] args) {
		int temp=207;
		if(temp>=16&&temp<=20) {
			System.out.println("too cool");
		}
		else if(temp>20&&temp<=24) {
			System.out.println("normal");
		}
		else if(temp>24&&temp<=30) {
			System.out.println("not cool");
		}
		else {
			System.out.println("not valid");
		}
	}

}
