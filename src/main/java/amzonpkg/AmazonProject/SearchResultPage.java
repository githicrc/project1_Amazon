package amzonpkg.AmazonProject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	WebDriver driver;

	    public SearchResultPage(WebDriver driver)
	    {
	            PageFactory.initElements(driver, this);
	    }
	    
	    
	    @FindBy(xpath="//a[@class='a-link-normal s-no-outline']")
	    private List<WebElement> allproducts;
	    
	   
	    
	    public void clickFirstProduct_movingTheControl(WebDriver driver)
	    {
	    	allproducts.get(0).click();
	    	Set<String> ids=driver.getWindowHandles();
	          Iterator<String> i1=ids.iterator();
	          String parentid=i1.next();
	          String childId=i1.next();
	          driver.switchTo().window(childId);
	          
	    }
}
