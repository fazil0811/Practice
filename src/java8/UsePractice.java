package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

public class UsePractice {
	public static void main(String[] args) {

		HashMap<Integer, Integer> val = new HashMap<>();
		val.put(1, 43);
		val.put(2, 46);
		val.put(3, 65);
		val.put(4, 31);

		int b = 46;

		Practice p = new Practice();

		int temp = p.element(val, b).orElseThrow(() -> new RuntimeException("value"));
		System.out.println(temp);

	}

}

class Practice {

	public Optional<Integer> element(HashMap<Integer, Integer> a, int b) {

		for (Integer x : a.values()) {
			if (x == b) {
				return Optional.of(x);
			}
		}
		return Optional.empty();
	}
}
