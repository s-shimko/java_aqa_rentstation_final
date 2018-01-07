package by.htp.rentstation.command.impl;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import by.htp.rentstation.command.StationAction;
import by.htp.rentstation.entity.RentUnit;
import by.htp.rentstation.logic.DaoStationLogicImpl;
import by.htp.rentstation.logic.FileStationLogicImpl;
import by.htp.rentstation.logic.StationLogic;
import by.htp.rentstation.station.Catalog;

public class ViewCatalogActionImpl implements StationAction {

	private StationLogic logic;
	{
//		logic = new ConsoleStationLogicImpl();
		logic = new FileStationLogicImpl();
//		logic = new DaoStationLogicImpl();
		
	}

	@Override
	public void performAction() throws FileNotFoundException {

		Catalog catalog = logic.readCatalog();
		ArrayList<RentUnit> units = (ArrayList<RentUnit>) catalog.getUnits();

		for (RentUnit unit : units) {
			if (unit != null) {
				System.out.println(unit);
			}
		}

	}

}
