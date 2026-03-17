package amzonpkg.AmazonProject;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.BaseClass;
import utility.RetryLogic;
import utility.ListnersLogic;
@Listeners(ListnersLogic.class)
public class TC1_LoginToAmazon extends BaseClass{
	@Test(retryAnalyzer=RetryLogic.class)
public void withValidCredentials() 
{
		Reporter.log("Browser and URL launched successfully");
	HomePage homepage=new HomePage(driver);
	homepage.hoverOverOnAccountandList(driver);
	homepage.signinClick();
	Reporter.log("Hoverover on account and List and Click on sigin is successful");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsername();
	loginpage.continueClick();
	loginpage.enterPassword();
	loginpage.signinClick();
	Reporter.log("UserName and Password has been entered successfully");

    SoftAssert s1=new SoftAssert();
    s1.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Assertion Failed for Test Case 1 since the title is not matching");
    s1.assertAll();
    Reporter.log("Test Case is Pass as Assertion is alos Pass");
	
	
}
}
