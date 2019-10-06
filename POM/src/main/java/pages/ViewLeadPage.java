package pages;

import projectBase.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {

	
	public ViewLeadPage readleadID() {
		String LeadIDName = driver.findElementById("viewLead_companyName_sp").getText();
		String LeadID= LeadIDName.replaceAll("[^0-9]", "");
		System.out.println(LeadID);
		return this;
		
	}
	
	public String getleadID() {
		String LeadIDName = driver.findElementById("viewLead_companyName_sp").getText();
		String LeadID= LeadIDName.replaceAll("[^0-9]", "");
			
		return LeadID;
	}
	
	public MyLeadsPage clickDelete() {
		driver.findElementByLinkText("Delete").click();
		return new MyLeadsPage();
		}
}
