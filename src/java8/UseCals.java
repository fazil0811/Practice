package java8;
public class UseCals {
	public static void main(String[] args) {
		Cals value1=(x,y)-> {
			if(x.length()>y.length()) {
				return x;
			}
			else {
				return y;
			}
		};
		System.out.println(value1.max("Hi", "Hello"));
	}
}
		
	
	
	
	@FunctionalInterface
	interface Cals {
		public String max(String a,String b);
		}
