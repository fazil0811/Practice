package java8;
public class UseMin {
	public static void main(String[] args) {
		int[] arr= {10,43,45,97,87};
		Min val=(x)->{
			int ma=0;
			for(int k : arr) {
				if(k> ma) {
					ma=k;
				}
			}
			System.out.println(ma);
		};
		val.min(arr);
	}
}
	
	
	
	@FunctionalInterface
	interface Min {
		public void min(int[] a);
	}