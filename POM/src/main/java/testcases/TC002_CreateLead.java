package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import projectBase.ProjectSpecificMethods;

public class TC002_CreateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		excelFileName="createlead";
	}
	
	@Test(dataProvider="fetchData")
	public void createLeadTestCase(String userName, String pass, String cname ,String fname, String lname) {
		new LoginPage()
		.enterUsername(userName)
		.enterPassword(pass)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickCreateLead()
		.getleadID();
		
	}
	

}
