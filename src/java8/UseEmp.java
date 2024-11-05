package java8;
public class UseEmp {
	public static void main(String[] args) {
		
		Engineer e1=new Engineer();
		Emp emp1=e1:: price;
		System.out.println(emp1.salary(23000));
		
	}
}







@FunctionalInterface
interface Emp {
	public int salary(int a);
	}

 class Engineer {
		public int value(int k) {
			return k;
		}
		public int price(int a) {
			return a;
		}
	}
