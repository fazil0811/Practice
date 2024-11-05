package oops2;

public class Human1 {
	private String name;
	private int age;

	public Human1(String n, int a) {
		name = n;
		age = a;
	}

	public String toString() {
		return name + age;
	}
	
}

class Employee extends Human1 {
	private int salary;
	private boolean isMale;

	public Employee(String n, int a, int s, boolean m) {
		super(n,a);
		salary = s;
		isMale = m;
	}

	public String toString() {
		return super.toString() + salary + isMale;
	}
}
