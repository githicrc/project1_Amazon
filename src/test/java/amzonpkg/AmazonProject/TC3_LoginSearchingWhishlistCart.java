package amzonpkg.AmazonProject;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utility.RetryLogic;
import utility.BaseClass;
import utility.ListnersLogic;
@Listeners(ListnersLogic.class)
public class TC3_LoginSearchingWhishlistCart extends BaseClass{
	@Test(retryAnalyzer=RetryLogic.class)
public void login_Searching_Whishlist_Cart() throws InterruptedException
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
	homepage.searchingItem();
	SearchResultPage searchResultPage=new SearchResultPage(driver);
	searchResultPage.clickFirstProduct_movingTheControl(driver);
	Reporter.log("Searching the product(shoe),clicking on the first result and moving the control to it is successful");
	Thread.sleep(6000);
	ProductPage productPage=new ProductPage(driver);
	productPage.addToWhislistTheItem(driver);
	Thread.sleep(6000);
	productPage.clickConitinue(driver);
	Thread.sleep(6000);
	productPage.clickAddToCartBtn(driver);
	Reporter.log("click on WishList,click on add to cart is successful");
	ShoppingCartPage shoppingCartPage=new ShoppingCartPage(driver);
	shoppingCartPage.clickProceddToBuy(driver);
	driver.navigate().back();
	homepage.hoverOverOnAccountandList(driver);
	homepage.signOutClick();
	Reporter.log("Hoverover on account and List and Click on signout is successful");
}
}
