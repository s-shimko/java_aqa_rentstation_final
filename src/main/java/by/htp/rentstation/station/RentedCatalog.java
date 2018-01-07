package by.htp.rentstation.station;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import by.htp.rentstation.entity.RentUnit;
import by.htp.rentstation.entity.RentedUnit;

public class RentedCatalog {

	private List<RentedUnit> rentedUnits;

	public RentedCatalog() {
		rentedUnits = new ArrayList<RentedUnit>();
	}

	public List<RentedUnit> getRentedUnits() {
		return rentedUnits;
	}

	public void addRentedUnit(RentedUnit unit) {
		rentedUnits.add(unit);
	}
	
}
