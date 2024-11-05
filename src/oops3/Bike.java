package oops3;

public interface Bike {
	public String name(String a);

	public int price(int a);
}

interface Bike1 {
	public String cc(String a);

	public int speed(int a);
}

interface Bike2 {
	public int add(int a);
}

class Pulsar implements Bike, Bike1, Bike2 {
	public String name(String a) {
		return a;
	}

	public int price(int a) {
		return a;
	}

	public String cc(String a) {
		return a;
	}

	public int speed(int a) {
		return a;
	}

	@Override
	public int add(int a) {
		// TODO Auto-generated method stub
		return 0;
	}
}
