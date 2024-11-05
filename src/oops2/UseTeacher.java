package oops2;
public class UseTeacher {
	public static void main(String[] args) {
		Teacher t=new Teacher();
		System.out.println(t.getGender(true)+t.getName("fazil")+t.salary(300000)+t.experience(4));
	}
}
