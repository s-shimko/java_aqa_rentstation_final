package by.htp.rentstation.logic;

import java.io.FileNotFoundException;

import by.htp.rentstation.entity.Equipment;
import by.htp.rentstation.entity.RentUnit;
import by.htp.rentstation.station.Catalog;
import by.htp.rentstation.station.Client;
import by.htp.rentstation.station.RentedCatalog;

public class ConsoleStationLogicImpl implements StationLogic {

	@Override
	public Catalog readCatalog() {
		
		Equipment eq1 = new Equipment("Eq1");
		Equipment eq2 = new Equipment("Eq2");
		Equipment eq3 = new Equipment("Eq3");
		
		RentUnit re1 = new RentUnit(eq1, 2.5);
		RentUnit re2 = new RentUnit(eq2, 2.5);
		RentUnit re3 = new RentUnit(eq3, 2.5);
		
		Catalog catalog = new Catalog();

		return catalog;
	}

	@Override
	public RentedCatalog readRentedCatalog() {
		RentedCatalog rentedCatalog = new RentedCatalog();
		return rentedCatalog;
	}

	@Override
	public Client takeItemInRent() throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client backItemFromRent() throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
