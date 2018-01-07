package by.htp.rentstation.command.impl;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import by.htp.rentstation.command.StationAction;
import by.htp.rentstation.entity.RentedUnit;
import by.htp.rentstation.logic.FileStationLogicImpl;
import by.htp.rentstation.logic.StationLogic;
import by.htp.rentstation.station.RentedCatalog;

public class ViewEquipmentOutOfTermImpl implements StationAction {

	private StationLogic logic;
	{
		logic = new FileStationLogicImpl();
	}

	@Override
	public void performAction() throws FileNotFoundException {
		System.out.println("Equipment out of rent term:");

		RentedCatalog rentedCatalog = logic.readRentedCatalog();
		ArrayList<RentedUnit> units = (ArrayList<RentedUnit>) rentedCatalog.getRentedUnits();

		for (RentedUnit unit : units) {
			
			double penalty = RentedUnit.calculatePenalty(unit.getTakenInRentDate(), RentedUnit.CHECK_DATE,
					unit.getHourRate());
			
			if (unit != null && penalty > 0) {
				System.out.println(unit);
			}
		}

	}

}
