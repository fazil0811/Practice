package oops3;
public interface Cycle {
	public String name(String a);
	public int price(int a);
	}
interface Cycle1 extends Cycle{
	public boolean isGear(boolean a);
}
interface Cycle2 extends Cycle {
	
}

class Hero implements Cycle1,Cycle2 {
	public String name(String a) {
		return a;
	}
	public int price(int a) {
		return a;
	}
	public boolean isGear(boolean a) {
		return a;
	}	
}
	