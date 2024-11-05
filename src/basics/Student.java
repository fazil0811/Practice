package basics;

public class Student {

	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		s1.name = "fazil";
		s1.age = 26;
		s1.isMale = true;
		s1.weight = 70;
		
		Student1 s2 = new Student1();
		s2.name = "mohamed";
		s2.age = 36;
		s2.isMale = true;
		s2.weight = 90;
		
		System.out.println(s1.name + s1.age + s1.isMale + s1.weight);
		System.out.println(s2.name + s2.age + s2.isMale + s2.weight);

	}
}
