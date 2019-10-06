package pages;

import projectBase.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{

	public MyLeadsPage clickLeads() {
					driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
			return new MyLeadsPage();
		}
	}

