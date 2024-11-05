package java8;

public class SportsCar {
	public static void main(String[] args) {

		Sports s1 = new Sports();
		System.out.println(s1.id(34));
		System.out.println(Car.name("audi"));
		System.out.println(s1.price(49343.43f));
	}
}

@FunctionalInterface // we create only one unimplemented method & if we don't use functional we will
						// create more than 2 unimplemented method but its not functional interface
interface Car {
	public int id(int a);

	public static String name(String a) {
		return a;
	}

	public default float price(float a) { // we will override default class but not override static class
		return a;
	}

}

class Sports implements Car {
	public int id(int a) {
		return a;
	}

	public float price(float a) {
		return a + 100;
	}
}