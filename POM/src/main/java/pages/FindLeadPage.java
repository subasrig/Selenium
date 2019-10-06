package pages;

import org.openqa.selenium.By;

import projectBase.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods{
	
	public FindLeadPage clickPhone() {
		driver.findElementByXPath("//span[text()='Phone']").click();
		return this;
		}
	
	public FindLeadPage enterPhnumNumber(String phnum) {
	
	driver.findElementByName("phoneCountryCode").clear();
	driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phnum);
	return this;
	}
	
	public FindLeadPage clickFindLeads() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		return this;
		}
	public ViewLeadPage clickFirstlead() {
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		return new ViewLeadPage();
		}
	
	public FindLeadPage enterLeadID(String LeadID) {
		driver.findElement(By.name("id")).sendKeys(LeadID);
		return this;
	}
	
	public FindLeadPage verifyNoValue() {
		String textval = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		System.out.println("screen O/P : "+textval);
		if(textval.equals("No records to display")) {
			System.out.println("Successful");
		}
		else {
			System.out.println("some issue");
		
		}
		return this;
	}
}
