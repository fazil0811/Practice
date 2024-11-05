package coll2;

import java.util.HashMap;
import java.util.Iterator;

public class UseTshirt {
	public static void main(String[] args) {

		Tshirt t1 = new Tshirt();
		t1.id = 20;
		t1.price = 150.99f;
		t1.brand = "aaa";
		t1.isWashable = false;
		t1.weight = 1.10f;

		Tshirt t2 = new Tshirt();
		t2.id = 22;
		t2.price = 190.19f;
		t2.brand = "bbb";
		t2.isWashable = false;
		t2.weight = 1.90f;

		Tshirt t3 = new Tshirt();
		t3.id = 24;
		t3.price = 240.99f;
		t3.brand = "ccc";
		t3.isWashable = false;
		t3.weight = 2.10f;

		Tshirt t4 = new Tshirt();
		t4.id = 26;
		t4.price = 320.49f;
		t4.brand = "ddd";
		t4.isWashable = true;
		t4.weight = 2.50f;

		Tshirt t5 = new Tshirt();
		t5.id = 28;
		t5.price = 550.99f;
		t5.brand = "eee";
		t5.isWashable = true;
		t5.weight = 0.70f;

		HashMap<Integer, Tshirt> shirts = new HashMap<>();

		shirts.put(t1.id, t1);
		shirts.put(t2.id, t2);
		shirts.put(t3.id, t3);
		shirts.put(t4.id, t4);
		shirts.put(t5.id, t5);

		for (Integer x : shirts.keySet()) {
			System.out.println(x);
		}

		for (Tshirt x : shirts.values()) {
			System.out.println(x);
		}

		for (Integer x : shirts.keySet()) {
			System.out.println(x + " " + shirts.get(x));
		}

		shirts.keySet().forEach(x -> System.out.println(x));

		shirts.values().forEach(x -> System.out.println(x));

		shirts.forEach((x, y) -> System.out.println(x + " " + y));

		System.out.println();
		System.out.println("&&&&&&&&&&&&");

		Iterator<Tshirt> itr = shirts.values().iterator();
		while (itr.hasNext()) {
			if (itr.next().brand.equals("bbb")) {
				itr.remove();
			} 
		}

		shirts.forEach((x, y) -> System.out.println(x + " " + y));
		System.out.println("&&&777&&&&&&&&&");

		for (Tshirt x : shirts.values()) {
			System.out.println(x);
		}
		System.out.println("&&&&&&&&&&&&");

		Iterator<Integer> itr1 = shirts.keySet().iterator();
		while (itr1.hasNext()) {
			if (shirts.get(itr1.next()).brand.equals("aaa")) {
				itr1.remove();
			}
		}

		shirts.forEach((x, y) -> System.out.println(x + " " + y));
		System.out.println("&&&&&&&&&&&&");

		for (Tshirt x : shirts.values()) {
			System.out.println(x);
		}
		System.out.println("@@@@@@@");

		Iterator<Tshirt> phone = shirts.values().iterator();
		while (phone.hasNext()) {
			if (phone.next().brand.equals("eee")) {
				phone.remove();
			}
		}
		shirts.forEach((x, y) -> System.out.println(x + " " + y));
		System.out.println("@@@111@@@");
		
		Iterator<Integer>phone1=shirts.keySet().iterator();
		while(phone1.hasNext()) {
			if(shirts.get(phone1.next()).id==26) {
				phone1.remove();
			}
		}
		shirts.forEach((x,y)->System.out.println(x+" "+y));
	}

}
