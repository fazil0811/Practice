package forObject;
public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.brand="swift";
		c1.price=600000;
		c1.taxpercentage=5f;
		c1.model="XDI";
		c1.taxamount=(5*600000)/100;
		c1.isPetrol=true;
		c1.color="black";
		
		Car c2=new Car();
		c2.brand="BMW";
		c2.price=700000;
		c2.taxpercentage=6f;
		c2.model="XDI";
		c2.taxamount=(6*700000)/100;
		c2.isPetrol=false;
		c2.color="red";
		
		Car c3=new Car();
		c3.brand="Audi";
		c3.price=800000;
		c3.taxpercentage=7f;
		c3.model="XDI";
		c3.taxamount=(7*800000)/100;
		c3.isPetrol=true;
		c3.color="blue";
		
		Car[] cars= {c1,c2,c3};
		for(int i=0;i<cars.length;i++) {
			cars[i].netPrice=cars[i].price+cars[i].taxamount;
			System.out.println(cars[i].netPrice);
		}
			
			for(int i=0;i<cars.length;i++) {
				if(cars[i].brand.startsWith("B")) {
					System.out.println(cars[i].brand+cars[i].price);
				}}
		
		for(int i=0;i<cars.length;i++) {
			if(cars[i].brand.startsWith("B")) {
				System.out.println(cars[i].brand+((cars[i].netPrice*10/100)+cars[i].netPrice));
			}
		}
		
		for(int i=0;i<cars.length;i++) {
			if(cars[i].isPetrol==true) {
				System.out.println(cars[i].brand);

		
		
				}
			}
	}
}
	