package by.htp.rentstation.command.impl;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import by.htp.rentstation.command.StationAction;
import by.htp.rentstation.entity.RentUnit;
import by.htp.rentstation.entity.RentedUnit;
import by.htp.rentstation.logic.FileStationLogicImpl;
import by.htp.rentstation.logic.StationLogic;
import by.htp.rentstation.station.RentedCatalog;
import by.htp.rentstation.station.StationData;

public class BackCatalogItemFromRentActionImpl implements StationAction {
	
	private StationLogic logic;
	{
		logic = new FileStationLogicImpl();
	}

	@Override
	public void performAction() throws FileNotFoundException {
		System.out.println("Choose which item you want to back:");
		
		RentedCatalog rentedCatalog = logic.readRentedCatalog();
		ArrayList<RentedUnit> units = (ArrayList<RentedUnit>) rentedCatalog.getRentedUnits();

		int n = 1;
		for (RentUnit unit : units) {
			if (unit != null) {
				System.out.println(n + ". " + unit);
				n++;
			}
		}
		
		logic.backItemFromRent();
	}

}
