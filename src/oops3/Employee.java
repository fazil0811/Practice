package oops3;

abstract class Employee {
	public abstract int salary(int a);

	public String name(String a) {
		return "Hello" + a;
	}

	public abstract int id(int a);
}

class SoftwareEngineer extends Employee {
	public int salary(int a) {
		return a;
	}

	public int id(int a) {
		return a;
	}
}
