package coll1;

import java.util.ArrayList;

public class UseTheatre {
	public static void main(String[] args) {
		
		Theatre t1=new Theatre();
		t1.MovieName="SitaRaman";
		t1.noOfScreen=4;
		t1.TicketPrice=250;
		t1.isParkingAvailable=true;
		t1.movieCertificate="u/a";
		
		Theatre t2=new Theatre();
		t2.MovieName="Goat";
		t2.noOfScreen=10;
		t2.TicketPrice=450;
		t2.isParkingAvailable=true;
		t2.movieCertificate="u/a";
		
		Theatre t3=new Theatre();
		t3.MovieName="Maharaja";
		t3.noOfScreen=2;
		t3.TicketPrice=150;
		t3.isParkingAvailable=false;
		t3.movieCertificate="a";
		
		Theatre t4=new Theatre();
		t4.MovieName="Valimai";
		t4.noOfScreen=1;
		t4.TicketPrice=350;
		t4.isParkingAvailable=false;
		t4.movieCertificate="u/a";
		
		ArrayList<Theatre>theatres = new ArrayList<>();
		theatres.add(t1);
		theatres.add(t2);
		theatres.add(t3);
		theatres.add(t4);
		
		int firstmax=0;
		int secondmax=0;
		
		for(Theatre x : theatres) {
			if(x.TicketPrice>firstmax) {
				firstmax=x.TicketPrice;
			}
			if(x.TicketPrice>secondmax && x.TicketPrice!=firstmax) {
				secondmax=x.TicketPrice;
			}
		}
//		for(int i=0;i<theatres.size();i++) {
//			if(theatres.get(i).TicketPrice>firstmax) {
//				secondmax=firstmax;
//				firstmax=theatres.get(i).TicketPrice;
//			}
//			if(theatres.get(i).TicketPrice>secondmax && theatres.get(i).TicketPrice!=firstmax) {
//				secondmax=theatres.get(i).TicketPrice;
//			}
//		}
		System.out.println(firstmax);
		System.out.println(secondmax);
		
		ArrayList<Theatre>newtheatres = new ArrayList<>();
		for(int i=0;i<theatres.size();i++) {
			if(theatres.get(i).isParkingAvailable==true) {
				newtheatres.add(theatres.get(i));
			}
		}
		for(Theatre x : newtheatres) {
			System.out.println(x+" ");
		}
	}
}
	