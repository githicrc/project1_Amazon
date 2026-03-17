package amzonpkg.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

    public LoginPage(WebDriver driver)
    {
            PageFactory.initElements(driver, this);
    }
    
    
    @FindBy(name="email")
    private WebElement username;
    
    @FindBy(id="continue")
    private WebElement continuebutton;
    
    @FindBy(name="password")
    private WebElement password;
    
    @FindBy(id="signInSubmit")
    private WebElement signIn;
    
    public void enterUsername()
    {
            username.sendKeys("7025323569");
            }
    
    public void continueClick()
    {
            continuebutton.click();
    }
    
    public void enterPassword()
    {
            password.sendKeys("Cathi1025")        ;        
            }
    
    public void signinClick()
    {
            signIn.click();
    }
}
