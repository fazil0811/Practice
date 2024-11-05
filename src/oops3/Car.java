package oops3;
public interface Car {
	public int price(int a);
	public String regNo(String a);
}
class SportsCar implements Car {
	public int price(int price) {
		return price;
	}
	public String regNo(String a) {
		return a;
	}
}