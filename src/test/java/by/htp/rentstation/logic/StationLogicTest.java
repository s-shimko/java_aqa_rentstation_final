package by.htp.rentstation.logic;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

public class StationLogicTest {
	
	private StationLogic logic;

	@Before
	public void initSportLogic() {
		logic = new ConsoleStationLogicImpl();
	}

	@Test
	public void testReadCatalogNotNull() throws FileNotFoundException {
		assertNotNull(logic.readCatalog());
	}
	
	@Test
	public void testReadRentedCatalogNotNull() throws FileNotFoundException {
		assertNotNull(logic.readRentedCatalog());
	}

}
