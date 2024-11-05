package for1;

public class Ex6 {
	public static void main(String[] args) {
		String name="communicate";
//		for(int i=name.length()-1;i>=0;i--) {
//			System.out.println(name.charAt(i));
//		}
		
		String temp ="";
		for(int i=name.length()-1;i>=0;i--) {
			temp = temp+name.charAt(i);
		}
		System.out.println(temp);
		
//		for(int i=name.length()-1;i>=0;i--) {
//			System.out.println(temp);
//		}
	}

	

}
