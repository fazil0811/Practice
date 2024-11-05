package basics;
public class Marks {
	public static void main(String[]args) {
		StudentMarks s1=new StudentMarks();
		s1.name="fazil";
		s1.mark1=93;
		s1.mark2=100;
		s1.mark3=99;
		s1.total=s1.mark1+s1.mark2+s1.mark3;
		
		StudentMarks s2=new StudentMarks();		
		s2.name="mohamed";
		s2.mark1=78;
		s2.mark2=80;
		s2.mark3=89;
		s2.total=s2.mark1+s2.mark2+s1.mark3;
		
		System.out.println(s1.name+" "+ s1.total);
		System.out.println("Average="+(s1.total)/3);
		System.out.println(s2.name+" "+ s2.total);
		System.out.println("Average="+(s2.total)/3);
		
	}
	
	}

