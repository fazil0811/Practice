package oops3;
public class UseBike {
	public static void main(String[] args) {
		Pulsar p=new Pulsar();
		System.out.println(p.name("zzz"));
		System.out.println(p.price(70000));
		System.out.println(p.cc("150cc"));
		System.out.println(p.speed(100));
		System.out.println(p.add(8));// we give 0 in return method		
	}
}
