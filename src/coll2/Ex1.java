package coll2;

import java.util.HashMap;

public class Ex1 {
	public static void main(String[] args) {
		HashMap<Integer,String>names = new HashMap<>();
		names.put(10, "krish");
		names.put(12, "naveen");
		names.put(14, "henry");
		names.put(16, "peter");
		
		System.out.println(names.get(12));
		
		for(Integer x : names.keySet()) {
			System.out.println(x);
		}
		
		for(String x : names.values()) {
			System.out.println(x);
		}
		
		for(Integer x : names.keySet()) {
			System.out.println(names.get(x)); // input keyvalue and output is String
		}
		
		for(Integer x : names.keySet()) {
			System.out.println(x+ " "+ names.get(x));
		}
		
		names.keySet().forEach(x->System.out.println(x));
		
		names.values().forEach(x->System.out.println(x));
		
		names.forEach((x,y)->System.out.println(x+" "+y));
	}

}
