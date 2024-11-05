package oops3;
public class UseCycle {
	public static void main(String[] args) {
		Hero h=new Hero();
		System.out.println(h.name("xxx"));
		System.out.println(h.price(3000));
		System.out.println(h.isGear(false));
	}

}
