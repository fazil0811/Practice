package java8;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator add = (x, y) -> x + y;
		System.out.println(add.math(34, 21));

		Calculator sub = (x, y) -> x - y;
		System.out.println(sub.math(90, 30));

		Calculator mult = (x, y) -> x * y;
		System.out.println(mult.math(4, 5));

	}

	@FunctionalInterface
	interface Calculator {
		public int math(int a, int b);
	}
}
