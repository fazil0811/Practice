package function;
public class UseChair {
	public static void main(String[] args) {
		Chair c1=new Chair();
		c1.brand="light";
		c1.price=300;
		c1.taxPrice=50;
		c1.weight=300.5f;
		c1.isplastic=true;
		
		Chair c2=new Chair();
		c2.brand="fly";
		c2.price=200;
		c2.taxPrice=45;
		c2.weight=310.5f;
		c2.isplastic=true;
		
		Chair c3=new Chair();
		c3.brand="blue";
		c3.price=900;
		c3.taxPrice=90;
		c3.weight=900.5f;
		c3.isplastic=false;
		
		Chair c4=new Chair();
		c4.brand="star";
		c4.price=500;
		c4.taxPrice=60;
		c4.weight=600.5f;
		c4.isplastic=true;
		
		Chair[] chairs= {c1,c2,c3,c4};
		c1.chair(chairs);
		Chair max=c4.findmax(chairs);
		System.out.println(max.brand+max.price);
		//c2.chair(chairs);
	}

}
