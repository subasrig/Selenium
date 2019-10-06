package pages;

import projectBase.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage enterCompanyName(String cname) {
	
	driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	return this;
	}
	
	public CreateLeadPage enterFirstName(String fname) {
	driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	return this;
	}
	public CreateLeadPage enterLastName(String lname) {
	driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	return this;
	}
	
	public ViewLeadPage clickCreateLead() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadPage();
	}
 
}
