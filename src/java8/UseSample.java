package java8;

public class UseSample {
	public static void main(String[] args) {
		System.out.println(Sample.value);
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();

		System.out.println(Sample.value);
		System.out.println(Sample.display("peter"));

	}
}

class Sample {
	static int value = 10;

	public Sample() {
		value++;
		System.out.println(value);
	}

	public static String display(String a) {
		return a;
	}

	static {
		System.out.println("static");
	}
}
