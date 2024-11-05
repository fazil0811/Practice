package java8;

import java.util.ArrayList;
import java.util.Optional;

public class UseTask {
	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>();
		num.add(43);
		num.add(64);
		num.add(76);

		int b = 43;

		Task t = new Task();
		int temp = t.element(num, b).orElseThrow(() -> new RuntimeException(" value not Found "));
		System.out.println(temp);
	}
}

class Task {
	public Optional<Integer> element(ArrayList<Integer> a, int b) {
		
		
		
		for(Integer g : a) {
			if(g==b) {
//		}
//		for (int i = 0; i < a.size(); i++) {
//			if (a.get(i) == b) {
//				return Optional.of(a.get(i));
				return Optional.of(g);
			}
		}
		return Optional.empty();
	}
}
