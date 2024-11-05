package coll1;

import java.util.ArrayList;
public class Ex3 {
	public static void main(String[] args) {
		ArrayList<Character>arr1 =new ArrayList<>();
		arr1.add('a');
		arr1.add('f');
		arr1.add('g');
		for(int i=0;i<arr1.size();i++) {
			System.out.println(arr1.get(i));
		}
		for(Character a : arr1) {
			System.out.print(a+" ");
		}
		System.err.println();
		arr1.forEach(x->System.out.println(x+ " "));
	}
	

}
