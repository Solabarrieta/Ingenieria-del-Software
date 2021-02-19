package bussiness;

import javax.persistence.TypedQuery;

import dataAccess.F1_objectdbAccess;
import domain.Pilot;
public class Races {
	
	public static void main(String[] args) {
		
		F1_objectdbAccess f1_dataMng=new F1_objectdbAccess();
		//f1_dataMng.storePilot("Daniel Ricciardo", "Australia", 1159);
		//f1_dataMng.storePilot("Lando Norris", "United Kingdom", 1);
		//f1_dataMng.getAllPilots();
		f1_dataMng.getPilotByNationality("Mexican");

		f1_dataMng.close();
	                                                                                                                          }
}