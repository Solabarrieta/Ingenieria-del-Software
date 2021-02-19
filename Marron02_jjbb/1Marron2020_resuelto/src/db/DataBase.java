package db;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import domain.Offer;
import domain.RuralHouse;

public class DataBase {

	private EntityManager db;
	private EntityManagerFactory emf;
	String fileName0 = "CasaRural.odb";
	String fileName1 = "Ofertas.odb";

	public DataBase(boolean senal) {
		if (senal) {
			File a = new File (fileName0);
			a.delete();
			File b = new File(fileName1);
			b.delete();

			emf = Persistence.createEntityManagerFactory("objectdb:"+fileName0);
			db = emf.createEntityManager();
			System.out.println("Base de datos Abierta");
		}else {
			emf = Persistence.createEntityManagerFactory("objectdb:"+fileName0);
			db = emf.createEntityManager();
			System.out.println("Base de datos Abierta");
		}
	}

	public void close() {
		db.close();
		System.out.println("Base de Datos cerrada");
	}
	
	// 2) objetos de la DB:
	public void storeCasaRural(String city,String add) {
		db.getTransaction().begin();
		RuralHouse rh = new RuralHouse(city, add);
		db.persist(rh);
		db.getTransaction().commit();
		System.out.println("push a DB: " + rh.getRuralCode());
	}

	/**
	 * Crea una oferta
	 * @param date
	 * @param tripleNumber
	 * @param doubleNumber
	 * @param singleNumber
	 * @param rh
	 */
	public void storeOfferta(Date date, int tripleNumber, int doubleNumber, int singleNumber, RuralHouse rh) {
		db.getTransaction().begin();
		Offer off = new Offer(date, tripleNumber, doubleNumber, singleNumber, rh);
		db.persist(off);
		db.getTransaction().commit();
		System.err.println("Oferta creada: "+ off);
	}

	/**
	 * agrega la oferta a la base de datos
	 * @param off
	 */
	public void storeOffer(Offer off) {
		db.getTransaction().begin();
		db.persist(off);
		db.getTransaction().commit();
		System.out.println("Push a DB: "+ off.toString());
	}

	
	//buscar casa
	public List<RuralHouse> findRH(String city){
		String q ="SELECT rh FROM RuralHouse rh WHERE rh.city = ?0";
		TypedQuery<RuralHouse> query = db.createQuery(q, RuralHouse.class)
				.setParameter(0, city);
		List<RuralHouse> list = query.getResultList();
		System.out.println("contenido de la db:");
		for (RuralHouse ruralHouse : list) {
			System.out.println(ruralHouse.toString());
		}
		return list;
	}
	
	//busqueda de oferta
	public List<Offer> findOffer(Date d, RuralHouse rh){
		String q = "SELECT off FROM Offer off WHERE off.rh = ?0 AND off.date = ?1";
		TypedQuery<Offer> query = db.createQuery(q, Offer.class)
				.setParameter(0, rh)
				.setParameter(1, d);
		List<Offer> list = query.getResultList();
		System.out.println("contenido de la db:");
		for (Offer offer : list) {
			System.out.println(offer.toString());
		}
		return list;
	}

	//buscar cant de hbaitaciones por casa
	public int cantHab(Offer off, int hab){
		int r = 0; //revisar
		if (hab == 1) {
			r = off.getSingleNumber();
		}
		if(hab == 2){
			r = off.getDoubleNumber();
		}
		if(hab == 3){
			r = off.getTripleNumber();
		}
		return r;
	}
	
	//no se como identificar el tipo de habitaciones, hay que especificar los códigos....¿?
	public void aceptaOfferta(Offer off, int hab) {
		Offer eleccion = db.find(Offer.class, off);
		if (hab == 0) {
			eleccion.setSingleNumber(eleccion.getSingleNumber()-1);
		}
		if(hab == 1){
			eleccion.setDoubleNumber(eleccion.getDoubleNumber()-1);
		}
		if(hab == 2){
			eleccion.setTripleNumber(eleccion.getTripleNumber()-1);
		}
	}
	
}
