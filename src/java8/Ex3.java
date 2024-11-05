package java8;

import java.util.Optional;

public class Ex3 {
	public static void main(String[] args) {
		String name1 = "hello";
		String name2 = null;
		Optional<String> value1 = Optional.of(name1);
		Optional<String> value2 = Optional.ofNullable(name2);

		System.out.println(value1);
		System.out.println(value2);
		System.out.println("##########");

		System.out.println(value1.isPresent());
		System.out.println(value1.isEmpty());
		System.out.println(value2.isPresent());
		System.out.println(value2.isEmpty());
		// System.out.println(Optional.empty());

		Optional<String> a = Optional.empty();

		System.out.println(value1.empty());

		System.out.println(value2.orElse("hiiiiiiiiii"));
		System.out.println(value1.orElse("hiiiiiiiiii"));// not replace only null value will replace
		System.out.println("##########");

		Optional<String> value3 = Optional.ofNullable(null);
		System.out.println(value3.orElseThrow());

	}
}
