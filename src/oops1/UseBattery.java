package oops1;
public class UseBattery {
	public static void main(String[] args) {
		Battery b1=new Battery();
		b1.setBrand("neon");
		b1.setPrice(1000);
		b1.setCapacity(5000);
		
		System.out.println(b1.getBrand()+b1.getPrice()+b1.getCapacity());
		
		Phone p1=new Phone();
		p1.setBrand("iphone");
		p1.setPrice(40000);
		p1.setBattery(b1);
		System.out.println(p1.getBrand()+p1.getPrice()+p1.getBattery().getBrand()+p1.getBattery().getPrice()+p1.getBattery().getCapacity());
		
		Phone p2=new Phone();
		p2.setBrand("samsung");
		p2.setPrice(30000);
		p2.setBattery(b1);
		
		Phone p3=new Phone();
		p3.setBrand("oppo");
		p3.setPrice(20000);
		p3.setBattery(b1);
		
		Phone[] phones= {p1,p2,p3};
		int total=0;
		for(int i=0;i<phones.length;i++) {
		//System.out.println(phones[i].getBrand());
		total=total+phones[i].getPrice();
		//System.out.println(phones[i].getPrice());
		
		}
		System.out.println(total);
	}
}


