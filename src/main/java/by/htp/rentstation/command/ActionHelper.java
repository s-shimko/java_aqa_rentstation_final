package by.htp.rentstation.command;

import by.htp.rentstation.command.impl.BackCatalogItemFromRentActionImpl;
import by.htp.rentstation.command.impl.DefaultActionImpl;
import by.htp.rentstation.command.impl.FinishStationWorkImpl;
import by.htp.rentstation.command.impl.TakeCatalogItemInRentActionImpl;
import by.htp.rentstation.command.impl.ViewCatalogActionImpl;
import by.htp.rentstation.command.impl.ViewEquipmentOutOfTermImpl;
import by.htp.rentstation.command.impl.ViewRentedItemsActionImpl;

public class ActionHelper {

	public static StationAction defineAction(int input) {
		
		StationAction action = new DefaultActionImpl();
		
		switch (input) {
		case 1:
			action = new ViewCatalogActionImpl();
			break;
		case 2:
			action = new ViewRentedItemsActionImpl();
			break;
		case 3:
			action = new TakeCatalogItemInRentActionImpl();
			break;
		case 4:
			action = new BackCatalogItemFromRentActionImpl();
			break;
		case 5:
			action = new ViewEquipmentOutOfTermImpl();
			break;
		case 6:
			action = new FinishStationWorkImpl();
			break;
		default:
		}
		return action;
	}
}
