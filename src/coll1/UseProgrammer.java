package coll1;

import java.util.ArrayList;

public class UseProgrammer {

	public static void main(String[] args) {
		Programmer p1 = new Programmer();
		p1.name = "fazil";
		p1.age = 26;
		p1.codingLanguage = "java";
		p1.isMale = true;

		Programmer p2 = new Programmer();
		p2.name = "udhaya";
		p2.age = 27;
		p2.codingLanguage = "angular";
		p2.isMale = true;

		Programmer p3 = new Programmer();
		p3.name = "santhanam";
		p3.age = 28;
		p3.codingLanguage = "java";
		p3.isMale = true;

		ArrayList<Programmer> programmers = new ArrayList<>();
		programmers.add(p1);
		programmers.add(p2);
		programmers.add(p3);

		String a = "";
		for (Programmer z : programmers) {
			a = a.concat(z.codingLanguage);
		}
		System.out.println(a);
		System.out.println("*************");

		ArrayList<Programmer> lists = new ArrayList<>();
		for (int i = 0; i < programmers.size(); i++) {
			if (programmers.get(i).codingLanguage.equals("java")) {
				lists.add(programmers.get(i));
			}
		}
		// lists.forEach(x->System.out.println(x));
		for (Programmer x : lists) {
			System.out.println(x);
		}
	}
}
