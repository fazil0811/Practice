package oops1;

public class UsePhone1 {
	public static void main(String[] args) {
		Battery1 b1 = new Battery1("Leon", 1000, 5000);
		Phone11 p1 = new Phone11("Nothing", 70000, b1);
		System.out.println(b1);		
		System.out.println(p1);
		p1.setPrice(100000);
		System.out.println(p1);
		System.out.println(p1.getPrice());
	}
}

class Battery1 {
	
	private String brand;
	private int price;
	private int capacity;

	public Battery1(String brand, int price, int cap) {
		this.brand = brand;
		this.price = price;
		capacity = cap;
	}

	public String toString() {
		return "Brand= " + brand + "Price= " + price + "Capacity= " + capacity;
	}

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

	public void setCapacity(int c) {
		capacity = c;
	}

	public int getCapacity() {
		return capacity;
	}
}

class Phone11 {
	private String name;
	private int price;
	private Battery1 battery;

	public Phone11(String name, int price, Battery1 b) {
		this.name = name;
		this.price = price;
		battery=b;
	}

	public String toString() {
		return "Name= " + name + "Price= " + price + battery;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int p) {
		price = p;
	}

	public int getPrice() {
		return price;
	}

	public void setBattery(Battery1 b) {
		battery=b;
	}

	public Battery1 getBattery() {
		return battery;
	}
}
