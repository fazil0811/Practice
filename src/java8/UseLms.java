package java8;

public class UseLms {
	public static void main(String[] args) {

		Lms l = (x, y) -> System.out.println(x + " " + y);
		l.find(24, 8);
	}
}

interface Lms {
	public void find(int a, int b);
}
