package oops1;
public class UseSum {
	public static void main(String[] args) {
	Sum s1=new Sum();
	s1.brand="volvo";
	s1.price=1200;
	s1.isPetrol=true;
	
	Car c1=new Car();
	c1.brand="BMW";
	c1.price=10000;
	c1.color="black";
	c1.sum=s1;
	
	System.out.println(c1.brand+c1.price+c1.color+c1.sum.brand+c1.sum.price+c1.sum.isPetrol);
	}
}
