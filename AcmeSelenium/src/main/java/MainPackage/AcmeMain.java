package MainPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AcmeMain {
	@Test
	public void getCountry() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://acme-test.uipath.com/account/login");
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("email").sendKeys(Keys.TAB);
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		String title = driver.getTitle();
		if(title.contains("ACME")){
		System.out.println("Loggedin Successfully");
		}
		WebElement vendorelement = driver.findElementByXPath("//div[@class='dropdown'][5]/button");
		Actions hover=new Actions(driver);
		hover.moveToElement(vendorelement).perform();
		driver.findElementByLinkText("Search for Vendor").click();
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		List<WebElement> table = driver.findElementsByTagName("table");
		int tablesize = table.size();
		System.out.println("table size:"+tablesize);
		WebElement table1 = table.get(0);
		List<WebElement> allrows = driver.findElementsByTagName("tr");
		int rowsize = allrows.size();
		System.out.println("rowsize" +rowsize);
		WebElement row1 = allrows.get(1);
		List<WebElement> allcol = row1.findElements(By.tagName("td"));
		WebElement lastdata = allcol.get(allcol.size()-1);
		String countryname = lastdata.getText();
		System.out.println("COuntryname of bluelagoon: "+countryname);
		
			
		
	}

}
