package coll2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class UseAadhar {
	public static void main(String[] args) {
		AadharCard a1 = new AadharCard();
		a1.AadharNo = 9876543210l;
		a1.name = "aaa";
		a1.isMale = false;
		a1.state = "Tamilnadu";
		a1.age = 20;

		AadharCard a2 = new AadharCard();
		a2.AadharNo = 9876643210l;
		a2.name = "bbb";
		a2.isMale = true;
		a2.state = "Tamilnadu";
		a2.age = 21;

		AadharCard a3 = new AadharCard();
		a3.AadharNo = 9876549653l;
		a3.name = "ccc";
		a3.isMale = false;
		a3.state = "Kerala";
		a3.age = 27;

		AadharCard a4 = new AadharCard();
		a4.AadharNo = 9876479010l;
		a4.name = "ddd";
		a4.isMale = true;
		a4.state = "Karnataka";
		a4.age = 25;

		HashMap<Integer, AadharCard> cards = new HashMap<>();

		cards.put(1, a1);
		cards.put(2, a2);
		cards.put(3, a3);
		cards.put(4, a4);

		System.out.println("**********");

		for (AadharCard x : cards.values()) {
			System.out.println(x);
		}

		for (Integer x : cards.keySet()) {
			System.out.println(x + " " + cards.get(x));
		}

		cards.keySet().forEach(x -> System.out.println(x));

		cards.values().forEach(x -> System.out.println(x));

		cards.forEach((x, y) -> System.out.println(x + " " + y));

		System.out.println("112222233333333");

		HashMap<Long, AadharCard> none = new HashMap<>();

		for (AadharCard x : cards.values()) {
			if (x.name.equals("ddd")) {
				none.put(x.AadharNo, x);
			}

			none.values().forEach(z -> System.out.println(z));

			for (AadharCard v : none.values()) {
				System.out.println(v);
			}

		}

		Iterator<AadharCard> itr = cards.values().iterator();
		while (itr.hasNext()) {
			if (itr.next().isMale == true) {
				itr.remove();
			}
		}
		cards.forEach((x, y) -> System.out.println(x + " " + y));

		System.out.println("122222222222");

		Iterator<Integer> itr1 = cards.keySet().iterator();
		while (itr1.hasNext()) {
			if (cards.get(itr1.next()).name.equals("ccc")) {
				itr1.remove();
			}
		}
		for (Integer c : cards.keySet()) {
			System.out.println(c + " " + cards.get(c));
		}
		
		ArrayList<AadharCard> fine=new ArrayList<>();
		
		for(AadharCard y : cards.values()) {
			fine.add(y);
		}
		
		fine.forEach(x->System.out.println(x));
	}

}
