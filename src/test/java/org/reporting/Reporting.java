package org.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	
	public static void genernateReport(String jsonFiles) {
		
		File file = new File(System.getProperty("user.dir")+"src/test/resources/Reports/output.json");
		
		Configuration configuration = new Configuration(file, "AdactinHotel");
		
		configuration.addClassifications("OS", "Windows 7");
		configuration.addClassifications("BrowserName", "Chrome");
		configuration.addClassifications("Test", "Team2");
		
		 List<String>JsonFile = new ArrayList<String>();
		 JsonFile.add(jsonFiles);
		 
		 
		 ReportBuilder builder = new ReportBuilder(JsonFile, configuration);
		 
		 builder.generateReports();
		 
	}			
			

}
