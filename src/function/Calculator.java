package function;

public class Calculator {
	public void findtotal() {
		System.out.println(4 + 4);
	}

	public void finddiv(long b, int c) {
		System.out.println(b / c);
	}

	public float findmul() {
		return 3.32f * 4.39f;
	}

	public double findsum(double b, double c) {
		return b - c;
	}

	public void cough(boolean isBody, float temp) {
		if (isBody == true && temp > 100) {
			System.out.println("covid");
		} else {
			System.out.println("not");
		}
	}
}
