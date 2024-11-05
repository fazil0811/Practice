package coll2;
public class Bike {
	
	private String brand;
	private int price;
	private String color;
	private String engineCc;
	private String regNo;
	private boolean isSuperBike;
	
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
	public void setColor(String c) {
		color=c;
	}
	public String getColor() {
		return color;
	}
	
	public void setEngineCc(String e) {
		engineCc=e;
	}
	
	public String getEngineCc() {
		return engineCc;
	}
	
	public void setRegNo(String r) {
		regNo=r;
	}
	
	public String getRegNo() {
		return regNo;
	}
	
	public void setIsSuperBike(boolean i) {
		isSuperBike=i;
	}
	
	public boolean getIsSuperBike() {
		return isSuperBike;
	}
	
	public Bike(String b,int p,String c,String e,String r,boolean i) {
		brand=b;
		price=p;
		color=c;
		engineCc=e;
		regNo=r;
		isSuperBike=i;
	}
	
	public String toString() {
		return brand+" "+price+" "+color+" "+engineCc+" "+regNo+" "+isSuperBike;
	}
}
