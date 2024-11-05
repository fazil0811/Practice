package java8;
public class UseEmpl {
	
public static void main(String[] args) {
		
		Enginer e1=new Enginer();
		Empl empl1=e1::value;
		System.out.println(empl1.salary(23000));
		
		
	}

}







@FunctionalInterface
interface Empl {
	public String salary(int a);
	}

 class Enginer {
		public String value(int k) {
			if(k>10000) {
				return "good";
			}
			else {
				return "bad";
			}
		}
		public int price(int a) {
			return a;
		}
	}
