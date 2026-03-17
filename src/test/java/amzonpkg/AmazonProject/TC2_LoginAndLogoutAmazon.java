		package amzonpkg.AmazonProject;
		
		import org.testng.Assert;
		import org.testng.Reporter;
		import org.testng.annotations.Listeners;
		import org.testng.annotations.Test;
		import utility.RetryLogic;
		import utility.BaseClass;
		import utility.ListnersLogic;
		@Listeners(ListnersLogic.class)
		public class TC2_LoginAndLogoutAmazon extends BaseClass {
			@Test(retryAnalyzer=RetryLogic.class)
			public void withValidCredentialsLoginLogout() throws InterruptedException
			{
				Reporter.log("Browser and URL launched successfully");
				HomePage homepage=new HomePage(driver);
		        homepage.hoverOverOnAccountandList(driver);
		        homepage.signinClick();
		        Reporter.log("Hoverover on account and List and Click on sigin is successful");
		        
				LoginPage loginpage=new LoginPage(driver);
				loginpage.enterUsername();
				loginpage.continueClick();
				Thread.sleep(2000);
				loginpage.enterPassword();
				loginpage.signinClick();
				Thread.sleep(3000);
				
				homepage.hoverOverOnAccountandList(driver);
				homepage.signOutClick();
				Reporter.log("Hoverover on account and List and Click on signout is successful");
		        
		        Assert.assertEquals(driver.getTitle(), "Amazon Sign-In");
		        
		        Reporter.log("Test Case is Pass as Assertion is alos Pass");
		
		}
			}
			
		
