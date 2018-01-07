package by.htp.rentstation.dao.parser.sax;

import java.io.IOException;
import java.util.List;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import by.htp.rentstation.dao.CatalogData;
import by.htp.rentstation.entity.RentUnit;
import by.htp.rentstation.station.Catalog;


public class CatalogDataSaxImpl implements CatalogData {
	
	private static final String XML_FILE_PATH = "src/main/resources/rent_units.xml";

	@Override
	public Catalog readDaoCatalog() {

		Catalog catalog = new Catalog();
		
		try {
			CatalogDataHandler handler = new CatalogDataHandler();
			
			XMLReader reader = XMLReaderFactory.createXMLReader();
			reader.setContentHandler(handler);
			reader.parse(XML_FILE_PATH);
			
			List<RentUnit> units = handler.getRentUnits();
			catalog.setUnits(units);
			
		} catch (SAXException | IOException e) {
			e.printStackTrace();
		}
		
		return catalog;
	}

}
