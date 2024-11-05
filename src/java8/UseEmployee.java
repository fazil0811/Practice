package java8;

public class UseEmployee {
	public static void main(String[] args) {

		Worker w1 = new Worker();
		System.out.println(w1.name("fazil"));
		System.out.println(Employee.role("developer"));
		System.out.println(w1.experience(10.8f));
	}
}

interface Employee {
	public String name(String a);

	public static String role(String a) {
		return a;
	}

	public default String experience(float k) {
		return "developer";
	}
}

class Worker implements Employee {
	public String name(String a) {
		return a;
	}

	public String experience(float a) {
		if (a < 2) {
			return "junior developer";
		} else if (a > 2 && a <= 5) {
			return "senior";
		} else if (a > 5 && a <= 10) {
			return "team lead";
		} else if (a > 10) {
			return "manager";
		} else {
			return "";
		}
	}
}