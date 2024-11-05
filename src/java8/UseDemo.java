package java8;

import java.util.Optional;

public class UseDemo {
	public static void main(String[] args) {
		String arr[]= {"hi","john","peter"};
		String value="hf";
		Demo d=new Demo();
		String temp=d.element(arr, value).orElseThrow(()->new RuntimeException("value not Found"));
		System.out.println(temp);		
	}
}


class Demo {
	public Optional<String>element(String[] a,String k) {
		
		for(String x : a) {
			if(x.equals(k)) {
				return Optional.of(x);
			}
		}
		return Optional.empty();
	}
}
//		for(int i=0;i<a.length;i++) {
//			if(a[i].equals(k)) {
//				return Optional.of(a[i]);
//			}
//		}
//		return Optional.empty();
//	}
//}
