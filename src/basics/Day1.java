package basics;

import java.util.Arrays;
public class Day1 {
	public static void main(String[]args) {
		String name1="Fantasy Program";
		char arr1[]=name1.toCharArray();
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1.length);
		System.out.println(arr1[name1.length()-1]);
//		System.out.println(arr1);
	}
	

}