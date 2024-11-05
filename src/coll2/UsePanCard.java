package coll2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UsePanCard {

	public static void main(String[] args) {
		PanCard a1 = new PanCard();
		a1.panNo = 9876543210l;
		a1.name = "fazil";
		a1.isMale = false;
		a1.state = "Tamilnadu";
		a1.age = 20;
		a1.fatherName = "abc";

		PanCard a2 = new PanCard();
		a2.panNo = 9876643210l;
		a2.name = "udhaya";
		a2.isMale = true;
		a2.state = "Tamilnadu";
		a2.age = 21;
		a2.fatherName = "def";

		PanCard a3 = new PanCard();
		a3.panNo = 9876549653l;
		a3.name = "santhanam";
		a3.isMale = false;
		a3.state = "Kerala";
		a3.age = 27;
		a3.fatherName = "ghi";

		PanCard a4 = new PanCard();
		a4.panNo = 9876479010l;
		a4.name = "java";
		a4.isMale = true;
		a4.state = "Karnataka";
		a4.age = 25;
		a4.fatherName = "jkl";

		HashMap<Integer, PanCard> cards = new HashMap<>();

		cards.put(1, a1);
		cards.put(2, a2);
		cards.put(3, a3);
		cards.put(4, a4);
		
		System.out.println(cards.get(a3));

//		String a="";
//		for(PanCard x : cards.values()) {
//			a=a.concat(x.fatherName);
//		}
//		System.out.println(a);
//		
//		int max=0;
//		for(PanCard y : cards.values()) {
//			if(y.age>max) {
//				max=y.age;
//			}
//		}
//		System.out.println(max);
//		
//		for(PanCard x : cards.values()) {
//			if(x.name.length()%2==0) {
//				System.out.println(x.name.substring(x.name.length()/2-1,x.name.length()/2+1));				
//			}
//			else {
//				System.out.println(x.name.substring(x.name.length()/2,x.name.length()/2+1));
//			}
//		}

		HashMap<Long, PanCard> pans = new HashMap<>();
		for (PanCard x : cards.values()) {
			if (x.isMale == true) {
				pans.put(x.panNo, x);
			}
		}
		for (PanCard x : pans.values()) {
			System.out.println(x);
		}

		HashMap<Integer, PanCard> pans1 = new HashMap<>();
		for (Integer x : cards.keySet()) {
			if (cards.get(x).isMale == true) {
				pans1.put(x, cards.get(x));
			}
		}
		for (PanCard x : pans1.values()) {
			System.out.println(x);
		}
		System.out.println("***********************************************");

		List<PanCard> pc = new ArrayList<>();
		for (PanCard x : cards.values()) {
			if (x.age > 20) {
				pc.add(x);
			}
		}
		for (PanCard x : pc) {
			System.out.println(x);
		}
		System.out.println("%%%%%%%%");
		
		ArrayList<String>pc1=new ArrayList<>();
//		for(Integer f : cards.keySet()) {
//			if(cards.get(f).age==20) {
//				pc1.add(cards.get(f));
//			}
//		}
		
		for(PanCard x : cards.values()) {
			pc1.add(x.name);
			
		}
		pc1.forEach(x->System.out.println(x));
	}
}