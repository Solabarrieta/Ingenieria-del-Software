package dataAccess;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import domain.Pilot;

public class F1_objectdbAccess {
	
	
	private EntityManager db;
	private EntityManagerFactory emf;
	String fileName = "formula1.odb";

	public F1_objectdbAccess() {
		emf = Persistence.createEntityManagerFactory("objectdb:"+fileName);
		db = emf.createEntityManager();
		System.out.println("Base de datos abierta");
	}

	public void close(){
		db.close();
		System.out.println("Base de datos cerrada");
	}

	public void storePilot(String name,String nac, int points) {
		db.getTransaction().begin();
		Pilot pilot = new Pilot(name, nac, points);
		db.persist(pilot);
		db.getTransaction().commit();
		System.out.println("Insertado: " + pilot);
	}
	
	public Pilot getPilotById(String name) {
		return db.find(Pilot.class,name);
		}
	
	
	public void getAllPilots() {
		TypedQuery<Pilot> query = db.createQuery("SELECT p FROM Pilot p",Pilot.class);
		List<Pilot> pilots = query.getResultList();
		System.out.println("Contenido de la base de datos:");
		for (Pilot p:pilots) System.out.println(p.toString());
		}
	
	public void getPilotByNationality(String nac) {
		TypedQuery<Pilot> query =
		 db.createQuery("SELECT p FROM Pilot p WHERE p.nationality='"+nac+"'",Pilot.class);
		List<Pilot> pilots = query.getResultList();
		System.out.println("Contenido de la base de datos");
		for (Pilot p:pilots) System.out.println(p.toString());
		}


}
