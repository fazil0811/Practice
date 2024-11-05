package oops2;
public class Fruits {
	String name;
	int price;
}
class Mango extends Fruits {
	boolean isSweet;
}
class Grapes extends Fruits {
	boolean isGreen;
	public String isExpensive() {
		if(price>100) {
			return "expensive";
		}
		else {
			return "affordable";
			}
	}
}