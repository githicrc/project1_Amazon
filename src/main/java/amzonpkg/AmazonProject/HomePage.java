package amzonpkg.AmazonProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	@FindBy(xpath="//span[@class='nav-line-2 ']")
    private WebElement accountAndList;
    
    @FindBy(xpath="//a[@class='nav-action-signin-button']")
    private WebElement signIn;
    
    @FindBy(id="nav-item-signout")
    private WebElement logout;
    
    @FindBy(id="twotabsearchtextbox")
    private WebElement search;
    
    public void hoverOverOnAccountandList(WebDriver driver)
    {
            Actions a1=new Actions(driver);
            a1.moveToElement(accountAndList).perform();
    }
    public void signinClick()
    {
            signIn.click();
    }
    public void searchingItem()
    {
    	search.sendKeys("shoe"+Keys.ENTER);
    }
    public void signOutClick()
    {
            logout.click();
    }
    WebDriver driver;

    public HomePage(WebDriver driver)
    {
            PageFactory.initElements(driver, this);
    }
}
