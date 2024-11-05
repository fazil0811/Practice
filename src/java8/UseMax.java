package java8;

public class UseMax {
	public static void main(String[] args) {

		int[] arr = { 10, 43, 45, 87 };
		Max val = (x) -> {
			int ma = 0;
			for (int k : arr) {
				if (k > ma) {
					ma = k;
				}
			}
			return ma;
		};
		System.out.println(val.max(arr));
	}
}

@FunctionalInterface
interface Max {
	public int max(int[] a);
}