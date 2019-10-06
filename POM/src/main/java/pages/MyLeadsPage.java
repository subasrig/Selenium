package pages;

import projectBase.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public CreateLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
	
	public FindLeadPage clickFindleadsMain() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadPage();
	}

}
