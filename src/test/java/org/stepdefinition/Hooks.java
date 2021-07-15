package org.stepdefinition;

import java.io.IOException;
import org.utilities.BaseClass;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	public void beforeScenario() {
		launchBrowser();
	//	System.out.println("browser launched---------------");
	}
	
	@After
	public void afterScenario(Scenario s) throws IOException {
		 String name = s.getName();
		 System.out.println(name);
	takesnap(name);
	//CloseBrowser(); 
	//System.out.println("closed=======================");
	    
}

}
