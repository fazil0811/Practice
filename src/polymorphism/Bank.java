package polymorphism;
public class Bank {
	int loan;
	public int findintrest() {
		int intrest=loan*10/100;
		return intrest;
	}
}
class AxisBank extends Bank {
	public int findintrest() {
		int intrest=loan*15/100;
		return intrest;
	}
}