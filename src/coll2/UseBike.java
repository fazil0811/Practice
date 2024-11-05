package coll2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class UseBike {
	public static void main(String[] args) {

		Bike b1 = new Bike("aaa", 78443, "black", "120cc", "TN00", false);
		Bike b2 = new Bike("bbb", 88543, "white", "150cc", "TN82", true);
		Bike b3 = new Bike("ccc", 98143, "red", "180cc", "TN01", true);
		Bike b4 = new Bike("ddd", 67467, "blue", "120cc", "TN41", false);

		HashMap<Integer, Bike> bikes = new HashMap<>();

		bikes.put(b1.getPrice(), b1);
		bikes.put(b2.getPrice(), b2);
		bikes.put(b3.getPrice(), b3);
		bikes.put(b4.getPrice(), b4);

		for (Integer x : bikes.keySet()) {
			System.out.println(x);
		}

		for (Bike x : bikes.values()) {
			System.out.println(x);
		}

		for (Integer x : bikes.keySet()) {
			System.out.println(x + " " + bikes.get(x));
		}

		bikes.keySet().forEach(x -> System.out.println(x));

		bikes.values().forEach(x -> System.out.println(x));

		bikes.forEach((x, y) -> System.out.println(x + " " + y));
		System.out.println("@@@@@@@");

		HashMap<Integer, Bike> fz = new HashMap<>();
		for (Bike x : bikes.values()) {
			if (x.getBrand().equals("aaa")) {
				fz.put(x.getPrice(), x);
			}
		}
		fz.forEach((x, y) -> System.out.println(x + " " + y));

		HashMap<Integer, Bike> fz1 = new HashMap<>();
		for (Integer d : bikes.keySet()) {
			if (bikes.get(d).getBrand().equals("bbb")) {
				fz1.put(d, bikes.get(d));
			}
		}
		fz1.forEach((x, y) -> System.out.println(x + " " + y));

		HashMap<Integer, String> fz2 = new HashMap<>();
		for (Bike f : bikes.values()) {
			fz2.put(f.getPrice(), f.getColor());
		}
		for (String g : fz2.values()) {
			System.out.println(g);
		}

		ArrayList<Integer> pul = new ArrayList<>();
		for (Bike h : bikes.values()) {
			pul.add(h.getPrice());
		}
		for (Integer j : pul) {
			System.out.println(j);
		}
	}
}