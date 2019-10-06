package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import pages.ViewLeadPage;
import projectBase.ProjectSpecificMethods;

public class TC003_DeleteLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		excelFileName="deletelead";
	}
	
	@Test(dataProvider="fetchData")
	public void createLeadTestCase(String userName, String pass, String phnum) throws InterruptedException {
		new LoginPage()
		.enterUsername(userName)
		.enterPassword(pass)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindleadsMain()
		.clickPhone()
		.enterPhnumNumber(phnum)
		.clickFindLeads()
		.clickFirstlead()
		.readleadID();
		ViewLeadPage vl=new ViewLeadPage();
		String getleadID = vl.getleadID();
		vl.clickDelete()
		.clickFindleadsMain()
		.enterLeadID(getleadID)
		.clickFindLeads()
		.verifyNoValue();
		
		
		
		
	}
	

}
