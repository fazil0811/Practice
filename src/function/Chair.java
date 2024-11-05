package function;
public class Chair {
	String brand;
	int price;
	int netPrice;
	int taxPrice;
	float weight;
	boolean isplastic;
	public void chair(Chair[] c) {
		for(int i=0;i<c.length;i++) {
			if(c[i].price>500) {
				//System.out.println("Price="+((c[i].price+c[i].taxPrice)*10/100+c[i].price));
			}
			else {
				System.out.println("Price="+c[i].price);
			}
			//System.out.println("Brand="+c[i].brand+"Price="+c[i].price+"isPlactic="+c[i].isplastic+"NetPrice="+(c[i].price+c[i].taxPrice));			
		}
		
		}
	public Chair findmax(Chair[] chairs) {
		Chair max=chairs[0];
		for(int i=0;i<chairs.length;i++) {
			if(chairs[i].price>max.price) {
				max=chairs[i];
//			return(max);
			}
		}
		return(max);
	}
}