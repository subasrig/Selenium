package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import projectBase.ProjectSpecificMethods;

public class TC001_LoginLogout extends ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="login";

	}
	@Test(dataProvider="fetchData")
	public void loginTestcase(String userName, String pass) {
		new LoginPage()
		.enterUsername(userName)
		.enterPassword(pass)
		.clickLogin()
		.clickLogout();
		
		
		
		
		
		
		
		
		/*LoginPage lp = new LoginPage();
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLogin();
		
		HomePage hp = new HomePage();
		hp.clickLogout();*/
	}
	
	
	
	
	
	
	
	
	
}
