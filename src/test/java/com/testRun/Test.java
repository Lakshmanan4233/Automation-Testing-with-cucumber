package com.testRun;

import org.base.Baseclass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reporting.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},glue= {"com.stepDefn"},monochrome=true,
   plugin= {"pretty","json:src\\test\\resources\\Reports\\output.json"},dryRun=false
                               ,tags= {"@AdactinPage"})
public class Test extends Baseclass {
	
	@AfterClass
	public static void after() {
		
		
		 String path = System.getProperty("user.dir");
		 Reporting.genernateReport(path+"\\src\\test\\resources\\Reports\\output.json");
		close();

	}
	

}
