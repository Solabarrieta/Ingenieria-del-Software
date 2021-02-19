package dataAccess;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import domain.Offer;
import domain.RuralHouse;
import java.io.File;

public class DataAccess {
	private static EntityManager db;
	private EntityManagerFactory emf;
	String fileName= "RuralHouses.odb";
	
	
	public DataAccess(boolean initialazeMode) {
		open(initialazeMode);
	}
	
	public void open(boolean initialaze) {
		if (initialaze) {
			new File(fileName).delete();
			System.out.println("Borrando base de datos");
			emf= Persistence.createEntityManagerFactory("objectdb:"+fileName);
			db=emf.createEntityManager();
			initialize();
			System.out.println("Base de datos abierta");
		}else {
		
		emf= Persistence.createEntityManagerFactory("objectdb:"+fileName);
		db=emf.createEntityManager();
		System.out.println("Base de datos abierta");
		}
	}
	
	public void close() {
		db.close();
		System.out.println("Base de datos cerrada");
	}
	
	public void initialize(){
		
		db.getTransaction().begin();
		
		RuralHouse rh1 = new RuralHouse("Donostia","Avenida, 7");
		db.persist(rh1);
		
		RuralHouse rh2 = new RuralHouse("Donostia","San Martin, 13");
		db.persist(rh2);
		
		RuralHouse rh3 = new RuralHouse("Bilbo","Zabalburu, 6");
		db.persist(rh3);
		
		Offer o1 = new Offer(newDate(2020,2,20),0,2,3,rh1);
		Offer o2 = new Offer(newDate(2020,2,1),0,2,3,rh1);
		Offer o3 = new Offer(newDate(2020,2,2),3,3,0,rh1);
		Offer o4 = new Offer(newDate(2020,2,3),3,3,0,rh1);
		Offer o5 = new Offer(newDate(2020,2,4),3,3,0,rh1);
		Offer o6 = new Offer(newDate(2020,2,5),3,3,0,rh1);
		Offer o7 = new Offer(newDate(2020,2,6),3,3,0,rh1);
		Offer o8 = new Offer(newDate(2020,2,7),3,3,0,rh1);
		Offer o9 = new Offer(newDate(2020,2,8),0,0,3,rh1);
		Offer o10 = new Offer(newDate(2020,2,9),0,0,3,rh1);
		Offer o11 = new Offer(newDate(2020,2,10),0,0,3,rh1);
		Offer o12 = new Offer(newDate(2020,2,11),0,0,3,rh1);
		Offer o13 = new Offer(newDate(2020,2,12),0,1,3,rh1);
		Offer o14 = new Offer(newDate(2020,2,13),1,1,1,rh1);
		Offer o15 = new Offer(newDate(2020,2,20),1,1,1,rh2);
		Offer o16 = new Offer(newDate(2020,2,1),1,1,1,rh3);
		Offer o17 = new Offer(newDate(2020,2,2),0,1,0,rh3);
		Offer o18 = new Offer(newDate(2020,2,20),1,0,1,rh3);
		
		db.persist(o1);
		db.persist(o2);
		db.persist(o3);
		db.persist(o4);
		db.persist(o5);
		db.persist(o6);
		db.persist(o7);
		db.persist(o8);
		db.persist(o9);
		db.persist(o10);
		db.persist(o11);
		db.persist(o12);
		db.persist(o13);
		db.persist(o14);
		db.persist(o15);
		db.persist(o16);
		db.persist(o17);
		db.persist(o18);
		
		db.getTransaction().commit();
		
	}

	private Date newDate(int year, int month, int day) {
		 Calendar calendar = Calendar.getInstance();
	     calendar.set(year, month, day,0,0,0);
	     calendar.set(Calendar.MILLISECOND, 0);

	     return calendar.getTime();
	}
	
	public static Collection<Offer> getConcreteOffers1(String city, Date date) {
		
		TypedQuery<Offer> query1 = null;
		ArrayList<RuralHouse> aux = new ArrayList<RuralHouse>();
		TypedQuery<RuralHouse> query = db.createQuery("SELECT p FROM RuralHouse p WHERE p.city='"+city+"'", RuralHouse.class);
		aux=(ArrayList<RuralHouse>) query.getResultList();
		
		for (RuralHouse rh:aux) {
			query1 = db.createQuery("SELECT P FROM Offer p WHERE p.rh='"+rh+"'AND p.date='"+date+"'", Offer.class);
		}
		
		ArrayList<Offer> res = new ArrayList<Offer>();
		res =(ArrayList<Offer>) query1.getResultList();
		
//			ArrayList<Offer> res = new ArrayList<Offer>();
//			for (RuralHouse rh : ruralHouses) 
//				if ((rh.getCity().equals(city)))
//					for (Offer off : rh.getOffers()) 
//						if ((off.getDate().compareTo(date))==0) 
//							res.add(off);
			return res;	
	}
}
