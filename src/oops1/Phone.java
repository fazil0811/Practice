package oops1;

public class Phone {
	private String brand;
	private int price;
	private Battery battery;

	public void setBrand(String b) {
		brand = b;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(int p) {
		price = p;
	}

	public int getPrice() {
		return price;
	}

	public void setBattery(Battery b) {
		battery = b;
	}

	public Battery getBattery() {
		return battery;
	}
}