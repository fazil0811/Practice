package SingleTonPattern;

public class SingleTon {

	// Private static variable to hold the single instance
	private static SingleTon instance=null;

	// Private constructor to prevent instantiation
//	private SingleTon() {
//        // Initialization code here
//    }

	// Public method to provide access to the instance
	public static SingleTon getInstance() {
		if (instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}

	// Example method
	public void displayMessage() {
		System.out.println("Hello from SingleTon!");
	}
	
	private String a="wasim";

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
	
	
}