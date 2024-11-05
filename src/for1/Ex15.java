package for1;
public class Ex15 {
	public static void main(String[] args) {
		String name1="Hello";
		String name2=name1.toLowerCase();
		boolean value=false;
		for(int i=0;i<name2.length();i++) {
			if(name1.charAt(i)=='a'||name1.charAt(i)=='e'||name1.charAt(i)=='i'||name1.charAt(i)=='o'||name1.charAt(i)=='u') {
			//if(name1.contains("a")||name1.contains("e")||name1.contains("i")||name1.contains("o")||name1.contains("u")) { //we are checking with string so that we are putting " ".	
				//System.out.println("Vowels present");
				value=true;
				//break;
			}
		}
				
			
		if(value==true) {
			System.out.println("vowels present");
		}
		else {
			System.out.println("not present ");
		}
		}
	} 