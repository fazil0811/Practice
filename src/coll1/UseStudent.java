package coll1;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.id=234;
		s1.name="fazil";
		s1.fees=32434.4f;
		s1.weight=75.35f;
		s1.age=26;
		s1.no=8899886l;
		s1.isMale=true;
		
		Student s2=new Student();
		s2.id=235;
		s2.name="udhaya";
		s2.fees=39534.4f;
		s2.weight=55.35f;
		s2.age=27;
		s2.no=8857886l;
		s2.isMale=false;
		
		Student s3=new Student();
		s3.id=236;
		s3.name="santhanam";
		s3.fees=38434.4f;
		s3.weight=45.35f;
		s3.age=25;
		s3.no=8099886l;
		s3.isMale=false;
		
		Student s4=new Student();
		s4.id=237;
		s4.name="thanveer";
		s4.fees=32984.4f;
		s4.weight=65.35f;
		s4.age=29;
		s4.no=8899546l;
		s4.isMale=true;
		
		ArrayList<Student>arr1 = new ArrayList<>();
		arr1.add(s1);
		arr1.add(s2);
		arr1.add(s3);
		arr1.add(s4);
		
//		for(int i=0;i<arr1.size();i++) {
//			System.out.println(arr1.get(i)+" ");
//		}
//		for(Student x : arr1) {
//			System.out.println(x+" ");
//		}
//		arr1.forEach(x->System.out.println(x));
//		
//		
//		 float average=0f;
//		 int count=0;
//		 float find=0f;
//		 float sum=0;
//		for(int i=0;i<arr1.size();i++) {
//			average=arr1.get(i).fees+average;
//			count=count+1;
//			sum=sum+arr1.get(i).fees;
//		}
//		find=average/count;
//		System.out.println(sum);
//		
//		float z=0f;
//		for(int i=0;i<arr1.size();i++) {
//			z=arr1.get(i).fees/sum*100f;
//			System.out.println(z+"%");
//		}
		
		ArrayList<Student> femalestudent=new ArrayList<>();
		
//		for(int i=0;i<arr1.size();i++) {
//			if(arr1.get(i).isMale==false) {
//				femalestudent.add(arr1.get(i));
//			}
//		}	
		
		for(Student t : arr1) {
			if(t.isMale==false) {
				femalestudent.add(t);
			}
		}
		femalestudent.forEach(x->System.out.println(x+" "));
		
		for(Student s : femalestudent) {
			System.out.println(s);			
		}
		for(int i=0;i<femalestudent.size();i++) {
			System.out.println(femalestudent.get(i));
		}
		
		ArrayList<Integer>ages=new ArrayList<>();
		for(Student t : arr1) {
			ages.add(t.age);
		}
		for(int h : ages) {
			System.out.println(h);
		}
	}	
}
