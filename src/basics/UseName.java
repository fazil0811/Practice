package basics;
public class UseName {
	public static void main(String[]args) {
		Name c1=new Name();
		c1.brand="bmw";
		c1.price=4000;
		c1.isPetrol=false;
		
		Name c2=new Name();
		c2.brand="shift";
		c2.price=2000;
		c2.isPetrol=true;
		
		int i=c1.price+c2.price;
		System.out.println(i);
		String name1=c1.brand.toUpperCase()+c2.brand.toUpperCase();
		System.out.println(name1);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		
		
	}

}