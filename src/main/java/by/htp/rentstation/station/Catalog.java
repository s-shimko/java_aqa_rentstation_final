package by.htp.rentstation.station;

import java.util.ArrayList;
import java.util.List;

import by.htp.rentstation.entity.RentUnit;

public class Catalog {

	private List<RentUnit> units;

	public Catalog() {
		units = new ArrayList<RentUnit>();
	}

	public List<RentUnit> getUnits() {
		return units;
	}

	public void addRentUnit(RentUnit unit) {
		units.add(unit);
	}

	public void setUnits(List<RentUnit> units) {
		this.units = units;
	}
	
}
