package coll1;

import java.util.ArrayList;

public class Ex4 {
	public static void main(String[] args) {
		ArrayList<String>name=new ArrayList<>();
		name.add("fazil");
		name.add("udhaya");
		name.add("santhanam");
		name.add("thanveer");
		name.remove(1);
		System.out.println(name.get(1));
		name.set(1, "john");
		System.out.println(name.get(1));
	}
}

