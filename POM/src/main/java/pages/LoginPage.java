package pages;

import projectBase.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{

	public LoginPage enterUsername(String uName) {
		driver.findElementById("username").sendKeys(uName);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		/*HomePage hp = new HomePage();
		return hp;*/
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
}
