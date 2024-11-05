package for1;
public class Ex14 {
	public static void main(String[] args) {
		String name1="Hello";
		String name2="Madam";
		String value1="";
		for(int i=name1.length()-1;i>=0;i--) {
			value1=value1+name1.charAt(i);
			System.out.println(value1);
		}
		if(name1.equalsIgnoreCase(value1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
