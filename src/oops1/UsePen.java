package oops1;

import java.util.ArrayList;

public class UsePen {
	public static void main(String[] args) {
		Reefle r=new Reefle();
		r.brand="aaa";
		r.price=2;
		r.color="black";
		
		Reefle r1=new Reefle();
		r1.brand="bbb";
		r1.price=4;
		r1.color="red";
		
		Pen p1=new Pen();
		p1.brand="xxx";
		p1.price=20;
		p1.isExpensive=false;
		p1.reefle=r;
		
		Pen p2=new Pen();
		p2.brand="yyy";
		p2.price=30;
		p2.isExpensive=false;
		p2.reefle=r;
		
		Pen p3=new Pen();
		p3.brand="zzz";
		p3.price=50;
		p3.isExpensive=true;
		p3.reefle=r1;
		
//		System.out.println(p1.brand+p1.price+p1.isExpensive+p1.reefle.brand+p1.reefle.price+p1.reefle.color);
//		System.out.println(p2.brand+p2.price+p2.isExpensive+p2.reefle.brand+p2.reefle.price+p2.reefle.color);
//		System.out.println(p3.brand+p3.price+p3.isExpensive+p3.reefle.brand+p3.reefle.price+p3.reefle.color);
		
//		ArrayList<Pen> whole=new ArrayList<>();
//		whole.add(p1);
//		whole.add(p2);
//		whole.add(p3);
//		System.out.println(whole);
		
		
	}

}
