package oops3;
public interface Human {
	public int age(int a);
	public String name(String a);
}
abstract class Engineer implements Human {
	public int age(int a) {
		return a;
	}
	public String name(String a) {
		return a;
	}
	public float salary(float a) {
		return a;
	}
	public abstract String role(String a);
}
class Software extends Engineer {
	public String role(String a) {
		return a;
	}
}
