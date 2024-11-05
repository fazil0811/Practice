package coll3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UseShirt {
	public static void main(String[] args) {
		
		Shirt s1=new Shirt("aaa",400,"s",true,false,"polyster");
		Shirt s2=new Shirt("bbb",310,"m",false,true,"cotton");
		Shirt s3=new Shirt("ccc",500,"s",false,false,"polyster");
		Shirt s4=new Shirt("ddd",530,"l",true,false,"cotton");
		Shirt s5=new Shirt("eee",590,"xl",true,false,"cotton");
		Shirt s6=new Shirt("fff",900,"xxl",true,true,"cotton");
		
		List<Shirt>shirts=Arrays.asList(s1,s2,s3,s4,s5,s6);
		
		Shirt obj=shirts.stream().sorted(Comparator.comparing(Shirt::getPrice).reversed()).skip(1).findFirst().get();
		System.out.println(obj);
		
		List<Shirt>shirts1=shirts.stream().collect(Collectors.toList());
		
		shirts1.forEach(x->System.out.println(x));
		System.out.println("*****111111*********");
		
		List<String>shirtsBrand=shirts.stream().map(x->x.getBrand()).collect(Collectors.toList());
		shirtsBrand.forEach(x->System.out.println(x));
		System.out.println("@@@@@222222@@@@@@@@");
		
		List<Shirt>cottonShirts=shirts.stream().filter(x->x.getMaterial().equals("cotton")).collect(Collectors.toList());
		cottonShirts.forEach(x->System.out.println(x));
		System.out.println("######3333########");
		
		Long noOfShirts=shirts.stream().filter(x->x.getSize().equals("s")).count();
		System.out.println(noOfShirts);
		System.out.println("#####44444#########");
		
		List<Shirt>firstTwo=shirts.stream().filter(x->x.getMaterial().equals("cotton")).limit(2).collect(Collectors.toList());
		firstTwo.forEach(x->System.out.println(x));
		System.out.println("##############");
		
		List<Shirt>exceptFirstTwo=shirts.stream().filter(x->x.getMaterial().equals("cotton")).skip(2).collect(Collectors.toList());
		exceptFirstTwo.forEach(x->System.out.println(x));
		System.out.println("##############");
		
		List<Integer>shirtPrice=shirts.stream().map(x->x.getPrice()).sorted().collect(Collectors.toList());
		shirtPrice.forEach(x->System.out.println(x));
		System.out.println("11##############");
		
		List<String>brandOrder=shirts.stream().map(x->x.getBrand()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		brandOrder.forEach(x->System.out.println(x));
		System.out.println("112233##############");
		
		int max=shirts.stream().map(x->x.getPrice()).max(Comparable::compareTo).get();
		System.out.println(max);
		System.out.println("#######QQQ#######");
		
		int min=shirts.stream().map(x->x.getPrice()).min(Comparable::compareTo).get();
		System.out.println(min);
		System.out.println("##@#$############");
		
		Shirt maxPrice=shirts.stream().max(Comparator.comparing(Shirt::getPrice)).get();
		System.out.println(maxPrice);
		System.out.println("##############");
		
		Shirt minPrice=shirts.stream().min(Comparator.comparing(Shirt::getPrice)).get();
		System.out.println(minPrice);
		System.out.println("?????##############");
		
		List<String>materials=shirts.stream().map(x->x.getMaterial()).distinct().collect(Collectors.toList());
		materials.forEach(x->System.out.println(x));
		System.out.println("##############");
		
		boolean anymat=shirts.stream().filter(x->x.getPrice()<500).anyMatch(x->x.getSize().equals("s"));
		System.out.println(anymat);
		System.out.println("##############");
		
		String minsize=shirts.stream().map(x->x.getSize()).sorted().findFirst().get();
		System.out.println(minsize);
		System.out.println("123##############");
		
		Map<String,Shirt>shirtmap=shirts.stream().collect(Collectors.toMap(x->x.getBrand(), y->y));
		shirtmap.forEach((x,y)->System.out.println(x+" "+y));
		System.out.println("###ATTTT###########");
		
		shirtmap.keySet().forEach(x->System.out.println(shirtmap.get(x)));
		System.out.println("1000##############");
		
		Set<String>zz=shirts.stream().map(x->x.getMaterial()).collect(Collectors.toSet());
		zz.forEach(x->System.out.println(x));
		System.out.println("##############");
		
		int total=shirts.stream().map(x->x.getPrice()).collect(Collectors.summingInt(x->x));
		System.out.println(total);
		System.out.println("##############");
		
		List<Shirt>taxShirt=shirts.stream().map(x-> {
			x.setPrice(x.getPrice()+100);
			return x;
		}).collect(Collectors.toList());
		taxShirt.forEach(x->System.out.println(x));
		System.out.println("##############");
		
		Map<String,Long>group=shirts.stream().collect(Collectors.groupingBy(x->x.getSize(),Collectors.counting()));
		group.forEach((x,y)->System.out.println(x+ " "+ y));	
		System.out.println("##############");
		
		List<Integer>smax=Arrays.asList(10,74,74,53,46,25,86,23,25);
		int secondmax=smax.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondmax);
		
		int secondmaxx=shirts.stream().map(x->x.getPrice()).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondmaxx);		
		
		List<Integer>r1=Arrays.asList(10,20,30,40);
		List<Integer>r2=Arrays.asList(50,60,70,80);
		
		List<List<Integer>>abc=Arrays.asList(r1,r2);
		List<Integer>lists=abc.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		lists.forEach(x->System.out.println(x));
		
		
	}
}

class Shirt {
	private String brand;
	private int price;
	private String size;
	private boolean isChecked;
	private boolean isQuality;
	private String material;
	
	public void setBrand(String b) {
		brand=b;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(int p) {
		price=p;
	}
	public int getPrice() {
		return price;
	}
	
	public void setSize(String s) {
		size=s;
	}
	public String getSize() {
		return size;
	}
	
	public void setIsChecked(boolean c) {
		isChecked=c;
	}
	public boolean getIsChecked() {
		return isChecked;
	}
	
	public void setIsQuality(boolean q) {
		isQuality=q;
	}
	public boolean getIsQuality() {
		return isQuality;
	}
	public void setMaterial(String m) { 
	material=m;
	}
	public String getMaterial() {
		return material;
	}

	

	public Shirt(String b, int p, String s, boolean c, boolean q, String m) {
		brand = b;
		price = p;
		size = s;
		isChecked = c;
		isQuality = q;
		material = m;
	}

	public String toString() {
		return brand + price + size + isChecked + isQuality + material;
	}

}
