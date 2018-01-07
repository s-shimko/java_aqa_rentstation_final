package by.htp.rentstation.command.impl;

import java.io.FileNotFoundException;

import by.htp.rentstation.command.StationAction;
import by.htp.rentstation.station.StationData;

public class FinishStationWorkImpl implements StationAction {

	@Override
	public void performAction() throws FileNotFoundException {
		System.out.println("Finish Rent station work. Common penalty: " + StationData.penaltyForItems);

	}

}
