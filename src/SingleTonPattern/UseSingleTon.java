package SingleTonPattern;

public class UseSingleTon {

	public static void main(String[] args) {
		// Get the only instance of SimpleSingleton
		SingleTon singleton1 = SingleTon.getInstance();
		singleton1.displayMessage(); // Output: Hello from SingleTon!
		System.out.println(singleton1.hashCode());
		System.out.println(singleton1.getA());

		// Get another reference to the same instance
		SingleTon singleton2 = SingleTon.getInstance();
		System.out.println(singleton2.hashCode());
		singleton2.setA("fazil");
		System.out.println(singleton2.getA());

		// Check if both references point to the same instance
		System.out.println(singleton1 == singleton2); // Output: true
		
		SingleTon singleton3 = SingleTon.getInstance();
		System.out.println(singleton3.getA());
	}
}