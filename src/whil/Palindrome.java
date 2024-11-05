package whil;

public class Palindrome {
	public static void main(String[] args) {
		int sum = 0;
		int a = -121;
		int temp = a;
		while (a != 0) {
			int value = a % 10;
			sum = (sum * 10) + value;
			a = a / 10;
		}

		if (temp == sum) {
			System.out.println("palindrome");
		} else {
			System.out.println("not");
		}
	}
}
