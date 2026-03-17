package utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass extends ListnersLogic {
	
       
        @Parameters({"browser","url"})
		@BeforeMethod
	public void launchBrowser(String whichBrowser,String url) throws InterruptedException
	{
		if(whichBrowser.equals("chrome"))
	    {
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--incognito");
			 driver = new ChromeDriver(options);
	    }
	    if(whichBrowser.equals("edge"))
	    {
	             driver=new EdgeDriver();
	    }
	    if(whichBrowser.equals("firefox"))
	    {
	             driver=new FirefoxDriver();
	    }
	    driver.get(url);
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    driver.manage().window().maximize();

	}
		@AfterMethod
		public void browserQuit() throws InterruptedException
		{ 
		Thread.sleep(2000);
	    driver.quit();
			
	}
}
