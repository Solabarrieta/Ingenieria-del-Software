package businessLogic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import db.DataBase;
import domain.RuralHouse;
import domain.Offer;

public class MyOfferManager implements OfferManager{
	ArrayList<RuralHouse> ruralHouses;
	public boolean senalDB = true; //señal para BD
	DataBase db;
	
	public MyOfferManager () {

		//crear bd
		//DataBase db = new DataBase(senalDB);
		db = new DataBase(senalDB);
		if (senalDB) {//TRUE crea todo de nuevo
			//push de casas
			db.storeCasaRural("Donostia", "Avenida, 7");
			db.storeCasaRural("Donostia","San Martin, 13");
			db.storeCasaRural("Bilbo","Zabalburu, 6");
			
			RuralHouse rh1 = new RuralHouse("Donostia","Avenida, 7");
			//push de ofertas
			db.storeOfferta(newDate(2020,2,20),0,2,3,rh1);
			db.storeOfferta(newDate(2020,2,1),0,2,3,rh1);  
			db.storeOfferta(newDate(2020,2,2),3,3,0,rh1);
			db.storeOfferta(newDate(2020,2,3),3,3,0,rh1);
			db.storeOfferta(newDate(2020,2,4),3,3,0,rh1);
			db.storeOfferta(newDate(2020,2,5),3,3,0,rh1);
			db.storeOfferta(newDate(2020,2,6),3,3,0,rh1);
			db.storeOfferta(newDate(2020,2,7),3,3,0,rh1);
			db.storeOfferta(newDate(2020,2,8),0,0,3,rh1);
			db.storeOfferta(newDate(2020,2,9),0,0,3,rh1);
			db.storeOfferta(newDate(2020,2,10),0,0,3,rh1);
			db.storeOfferta(newDate(2020,2,11),0,0,3,rh1);
			db.storeOfferta(newDate(2020,2,12),0,1,3,rh1);
			db.storeOfferta(newDate(2020,2,13),1,1,1,rh1);
			/*
			rh1.addOffer(newDate(2020,2,20),0,2,3);
			rh1.addOffer(newDate(2020,2,1),0,2,3);  
			rh1.addOffer(newDate(2020,2,2),3,3,0);
			rh1.addOffer(newDate(2020,2,3),3,3,0);
			rh1.addOffer(newDate(2020,2,4),3,3,0);
			rh1.addOffer(newDate(2020,2,5),3,3,0);
			rh1.addOffer(newDate(2020,2,6),3,3,0);
			rh1.addOffer(newDate(2020,2,7),3,3,0);
			rh1.addOffer(newDate(2020,2,8),0,0,3);
			rh1.addOffer(newDate(2020,2,9),0,0,3);
			rh1.addOffer(newDate(2020,2,10),0,0,3);
			rh1.addOffer(newDate(2020,2,11),0,0,3);
			rh1.addOffer(newDate(2020,2,12),0,1,3);
			rh1.addOffer(newDate(2020,2,13),1,1,1);
			*/
			RuralHouse rh2 = new RuralHouse("Donostia","San Martin, 13");
			db.storeOfferta(newDate(2020,2,20),1,1,1,rh2);
			//rh2.addOffer(newDate(2020,2,20),1,1,1);

			RuralHouse rh3 = new RuralHouse("Bilbo","Zabalburu, 6");
			db.storeOfferta(newDate(2020,2,1),1,1,1,rh3);
			db.storeOfferta(newDate(2020,2,2),0,1,0,rh3);
			db.storeOfferta(newDate(2020,2,20),1,0,1,rh3);
			/*
			rh3.addOffer(newDate(2020,2,1),1,1,1);
			rh3.addOffer(newDate(2020,2,2),0,1,0);
			rh3.addOffer(newDate(2020,2,20),1,0,1);
			*/
			/*
			ruralHouses = new ArrayList<RuralHouse>();
			ruralHouses.add(rh1);	 
			ruralHouses.add(rh2);
			ruralHouses.add(rh3);*/
		}
		
		/*
		 Orgiginal
		 
		ruralHouses = new ArrayList<RuralHouse>();
		RuralHouse rh1 = new RuralHouse("Donostia","Avenida, 7");

		rh1.addOffer(newDate(2020,2,20),0,2,3);
		rh1.addOffer(newDate(2020,2,1),0,2,3);  
		rh1.addOffer(newDate(2020,2,2),3,3,0);
		rh1.addOffer(newDate(2020,2,3),3,3,0);
		rh1.addOffer(newDate(2020,2,4),3,3,0);
		rh1.addOffer(newDate(2020,2,5),3,3,0);
		rh1.addOffer(newDate(2020,2,6),3,3,0);
		rh1.addOffer(newDate(2020,2,7),3,3,0);
		rh1.addOffer(newDate(2020,2,8),0,0,3);
		rh1.addOffer(newDate(2020,2,9),0,0,3);
		rh1.addOffer(newDate(2020,2,10),0,0,3);
		rh1.addOffer(newDate(2020,2,11),0,0,3);
		rh1.addOffer(newDate(2020,2,12),0,1,3);
		rh1.addOffer(newDate(2020,2,13),1,1,1);

		RuralHouse rh2 = new RuralHouse("Donostia","San Martin, 13");
		rh2.addOffer(newDate(2020,2,20),1,1,1);

		RuralHouse rh3 = new RuralHouse("Bilbo","Zabalburu, 6");
		rh3.addOffer(newDate(2020,2,1),1,1,1);
		rh3.addOffer(newDate(2020,2,2),0,1,0);
		rh3.addOffer(newDate(2020,2,20),1,0,1);

		ruralHouses.add(rh1);	 
		ruralHouses.add(rh2);		
		ruralHouses.add(rh3);		
		*/

	}
	public Collection<Offer> getConcreteOffers(String city, Date date) {
		//DataBase db = new DataBase(false);
		ArrayList<Offer> res = new ArrayList<Offer>();
		
		List<RuralHouse> listRH = db.findRH(city);
		for (RuralHouse rh : listRH) {
			List<Offer> listOff = db.findOffer(date,rh);
			for (Offer off : listOff) {
				if ((off.getDate().compareTo(date)) == 0) {
					res.add(off);
				}
			}
		}
		return res;
		//origin
		/*
		ArrayList<Offer> res = new ArrayList<Offer>();
		for (RuralHouse rh : ruralHouses) 
			if ((rh.getCity().equals(city)))
				for (Offer off : rh.getOffers()) 
					if ((off.getDate().compareTo(date))==0) 
						res.add(off);
		return res;
		*/	
	}

	private Date newDate(int year,int month,int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day,0,0,0);
		calendar.set(Calendar.MILLISECOND, 0);

		return calendar.getTime();
	}
	
	public int cantdHabitaciones(Offer off, int hab) {
		return db.cantHab(off, hab);
	}
	
	public void storeOff (Offer off) {
		db.storeOffer(off);
	}
	
}