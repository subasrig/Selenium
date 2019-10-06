package projectBase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class ProjectSpecificMethods {
	public String excelFileName;
	public static ChromeDriver driver;
	public String LeadID;
	@Parameters({"url"})
	@BeforeMethod
	public void startApp(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@AfterMethod(alwaysRun=true)
	public void closeApp() {
		driver.close();

	}
	@DataProvider(name = "fetchData",indices= {0})
	public Object[][] getData() throws IOException {
		return ReadExcel.readExcelData(excelFileName);

	}


}





