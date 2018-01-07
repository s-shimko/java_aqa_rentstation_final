package by.htp.rentstation.logic;

import java.io.FileNotFoundException;

import by.htp.rentstation.station.Catalog;
import by.htp.rentstation.station.Client;
import by.htp.rentstation.station.RentedCatalog;

public interface StationLogic {
	
	Catalog readCatalog() throws FileNotFoundException;
	RentedCatalog readRentedCatalog() throws FileNotFoundException;
	Client takeItemInRent() throws FileNotFoundException;
	Client backItemFromRent() throws FileNotFoundException;
}
