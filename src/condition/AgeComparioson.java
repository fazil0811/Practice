package condition;
public class AgeComparioson {
	public static void main(String[] args) {
		int age=5;
		if(age>=0&&age<=10) {
			System.out.println("Kid");
		}
		else if(age>10&&age<=20) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Elder");
		}
	}

}
