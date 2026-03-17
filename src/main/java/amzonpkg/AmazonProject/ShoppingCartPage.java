package amzonpkg.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	WebDriver driver;

    public ShoppingCartPage(WebDriver driver)
    {
            PageFactory.initElements(driver, this);
    }
    
    
    @FindBy(xpath="//input[@name='proceedToRetailCheckout']")
    private WebElement proceedtoBuy;
    
  
   
    
    public void clickProceddToBuy(WebDriver driver)
    {
    	proceedtoBuy.click();	
          
    }

}
