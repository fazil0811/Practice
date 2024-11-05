package oops3;
public class UseCar {
	public static void main(String[] args) {
		SportsCar s=new SportsCar();
//		SportsCar s=new Car();// We cannot create object for interface. Car is interface.
//		Car s=new SportsCar(); Before = we can use the interface class Name.
//		Car s=new Car(); we cannot create object for interface.
		System.out.println(s.price(4850)+s.regNo("TN"));
		System.out.println(s.regNo("TN5044"));
	}
}
