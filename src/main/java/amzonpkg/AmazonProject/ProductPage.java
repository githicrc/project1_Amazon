package amzonpkg.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;

	    public ProductPage(WebDriver driver)
	    {
	            PageFactory.initElements(driver, this);
	    }
	    
	    
	    @FindBy(xpath="//input[@id='add-to-wishlist-button-submit']")
	    private WebElement addToWhislist;
	    @FindBy(xpath="//input[@aria-label='Continue shopping']")
	    private WebElement continueShopping;
	    @FindBy(xpath="//input[@id='add-to-cart-button']")
	    private WebElement addToCart;
	  
	   
	    
	    public void addToWhislistTheItem(WebDriver driver)
	    {
	    	addToWhislist.click();	
	          
	    }
	    
	    public void clickConitinue(WebDriver driver)
	    {
	    	continueShopping.click();	
	          
	    }
	    public void clickAddToCartBtn(WebDriver driver)
	    {
	    	addToCart.click();	
	          
	    }
	
	//a[@class='a-link-normal s-no-outline']
}
