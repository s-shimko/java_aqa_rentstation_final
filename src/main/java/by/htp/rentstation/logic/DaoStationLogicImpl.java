package by.htp.rentstation.logic;

import java.io.FileNotFoundException;
import java.io.IOException;

import by.htp.rentstation.dao.CatalogData;
import by.htp.rentstation.dao.db.CatalogDataMysqlImpl;
import by.htp.rentstation.dao.parser.dom.CatalogDataDomImpl;
import by.htp.rentstation.dao.parser.sTax.CatalogDataStaxImpl;
import by.htp.rentstation.dao.parser.sax.CatalogDataSaxImpl;
import by.htp.rentstation.station.Catalog;
import by.htp.rentstation.station.Client;
import by.htp.rentstation.station.RentedCatalog;
import by.htp.rentstation.view.ConsoleMenu;

public class DaoStationLogicImpl implements StationLogic {

	private CatalogData logic;
	{
		System.out.println("Choose DAO operation:");
		System.out.println("1. Sax");
		System.out.println("2. Stax");
		System.out.println("3. Dom");
		System.out.println("4. DataBase");

		int input = 0;

		try {
			do {

				input = ConsoleMenu.readUserInput();

				switch (input) {
				case 1:
					logic = new CatalogDataSaxImpl();
					break;
				case 2:
					logic = new CatalogDataStaxImpl();
					break;
				case 3:
					logic = new CatalogDataDomImpl();
					break;
				case 4:
					logic = new CatalogDataMysqlImpl();
					break;
				default:
					System.out.println("Wrong input");
				}
			} while (input < 0 && input > 4);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Catalog readCatalog() throws FileNotFoundException {
		Catalog catalog = logic.readDaoCatalog();
		return catalog;
	}

	@Override
	public RentedCatalog readRentedCatalog() throws FileNotFoundException {
		return null;
	}

	@Override
	public Client takeItemInRent() throws FileNotFoundException {
		return null;
	}

	@Override
	public Client backItemFromRent() throws FileNotFoundException {
		return null;
	}

}
