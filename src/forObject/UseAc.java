package forObject;
public class UseAc {
	public static void main(String[] args) {
		Ac ac1=new Ac();
		ac1.brand="blueStar";
		ac1.price=50000;
		ac1.color="black";
		ac1.taxPercentage=5;
//		ac1.isExpensive=true;
		ac1.tax=(50000*5)/100;
//		ac1.netPrice=ac1.price+ac1.tax;
		
		Ac ac2=new Ac();
		ac2.brand="carrier";
		ac2.price=45000;
		ac2.color="red";
		ac2.taxPercentage=6;
//		ac2.isExpensive=false;
		ac2.tax=(45000*6)/100;
//		ac2.netPrice=ac2.price+ac2.tax;
		
		Ac ac3=new Ac();
		ac3.brand="samsung";
		ac3.price=40000;
		ac3.color="blue";
		ac3.taxPercentage=5;
//		ac3.isExpensive=true;
		ac3.tax=(40000*5)/100;
//		ac3.netPrice=ac3.price+ac3.tax;
		
		Ac ac4=new Ac();
		ac4.brand="onida";
		ac4.price=37000;
		ac4.color="green";
		ac4.taxPercentage=6;
//		ac4.isExpensive=false;
		ac4.tax=(37000*6)/100;
//		ac4.netPrice=ac4.price+ac4.tax;
		
		Ac[] acs= {ac1,ac2,ac3,ac4};
		for(int i=0;i<acs.length;i++) {
			acs[i].netPrice=acs[i].price+acs[i].tax;
			System.out.println(acs[i].netPrice);
		}
		for(int i=0;i<acs.length;i++) {
			if(acs[i].netPrice>40000) {
							
			acs[i].isExpensive=true;
			
			System.out.println(acs[i].brand +acs[i].isExpensive);	
			}
			else {
				acs[i].isExpensive=false;
				System.out.println(acs[i].brand +acs[i].isExpensive);
				
			}
		}
		for(int i=0;i<acs.length;i++) {
			if(acs[i].isExpensive==true) {
				System.out.println((acs[i].netPrice*10)/100+acs[i].netPrice);
			}
		}
		for(int i=0;i<acs.length;i++) {
			if(acs[i].isExpensive==true && acs[i].color.equals("black")) {
				System.out.println(acs[i].brand);
			}
		}
		
		
	}
}
		
