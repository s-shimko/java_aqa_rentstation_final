package by.htp.rentstation.command.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import by.htp.rentstation.command.StationAction;
import by.htp.rentstation.entity.RentUnit;
import by.htp.rentstation.logic.FileStationLogicImpl;
import by.htp.rentstation.logic.StationLogic;
import by.htp.rentstation.station.Catalog;
import by.htp.rentstation.station.Client;
import by.htp.rentstation.view.ConsoleMenu;

public class TakeCatalogItemInRentActionImpl implements StationAction {

	private StationLogic logic;
	{
		logic = new FileStationLogicImpl();
	}

	@Override
	public void performAction() throws FileNotFoundException {
		System.out.println("Choose which item you want take in rent:");

		Catalog catalog = logic.readCatalog();
		ArrayList<RentUnit> units = (ArrayList<RentUnit>) catalog.getUnits();

		int index = 1;
		for (RentUnit unit : units) {
			if (unit != null) {
				System.out.println(index + ". " + unit);
				index++;
			}
		}
		
		logic.takeItemInRent();
	}

}
