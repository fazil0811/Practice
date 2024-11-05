package basicsexceptional;
public class Practice {
	
		String brand;
		String model;
		int price;
		int noWarranty;
		
		
			public Practice(String b,String m,int p,int w) {
				brand=b;
				model=m;
				price=p;
				noWarranty=w;				
			}
}
			class NoException extends Exception {
				public NoException(String a) {
					System.out.println(a);
				}
			}
