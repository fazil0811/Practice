package polymorphism;
public class UseBank {
	public static void main(String[] args) {
		AxisBank ab1=new AxisBank();
//		Bank ab1=new AxisBank(); parent class access child class
		ab1.loan=10000;
		System.out.println(ab1.findintrest());
		
		Bank b1=new Bank();
		b1.loan=50000;
		System.out.println(b1.findintrest());
	}
}
