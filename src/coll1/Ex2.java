package coll1;

import java.util.ArrayList;
public class Ex2 {
	public static void main(String[] args) {
		ArrayList<String>arr1 = new ArrayList<>();
		arr1.add("fal");
		arr1.add("udhaya");
		arr1.add("santhanam");
//		for(int i=0;i<arr1.size();i++) {
//			System.out.println(arr1.get(i));
//		}
//		for(String x : arr1) {
//			System.out.println(x);
//		}
//		arr1.forEach(x->System.out.print(x+" "));
		arr1.forEach(x->{
			if(x.length()>3) {
				System.out.println(x);			
			}
		});
		
		
//		String a="";
//		for(String x : arr1) {
//			a=a.concat(x);
//		}
//		System.out.println(a);
		
		
//		String z="";
//		for(int i=0;i<arr1.size();i++) {
//			if(arr1.get(i).length()>z.length()){
//				z=arr1.get(i);				
//			}
//		}
//		System.out.println(z);
		
		
		String s="";
		for(String x : arr1) {
			if(x.length()>s.length()) {
				s=x;
			}
		}
		System.out.println(s);
	}
}

