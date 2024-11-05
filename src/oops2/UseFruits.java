package oops2;
public class UseFruits {
	public static void main(String[] args) {
		Mango m=new Mango();
		m.name="xxx";
		m.price=65;
		m.isSweet=true;
		
		Grapes g=new Grapes();
		g.name="yyy";
		g.price=90;
		g.isGreen=true;
		
		System.out.println(g.name+g.price+g.isGreen+g.isExpensive());
	}

}
