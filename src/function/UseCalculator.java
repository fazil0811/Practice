package function;
public class UseCalculator {
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.findtotal();
		c1.finddiv(487568755, 977778);
		System.out.println(c1.findmul());
		System.out.println(c1.findsum(65.47474, 34.47424));
		c1.cough(true, 111);
	}
}
