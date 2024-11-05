package coll2;

import java.util.HashMap;

public class Ex2 {
	public static void main(String[] args) {
		
		HashMap<Character,String>names=new HashMap<>();
		names.put('c', "cat");
		names.put('d', "dog");
		names.put('a', "apple");
		names.put('b', "ball");
		
		for(Character x : names.keySet()) {
			System.out.println(x);
		}
		
		for(String x : names.values()) {
			System.out.println(x);
		}
		
		for(Character x : names.keySet()) {
			System.out.println(names.get(x));
		}
		
		names.keySet().forEach(x->System.out.println(x));
		
		names.values().forEach(x->System.out.println(x));
		
		names.forEach((x,y)->System.out.println(x));
		
	}

}
