package utility;
import java.io.File;
import java.io.IOException;
//import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersLogic implements ITestListener
{
        public static WebDriver driver;
        static String pathOfScannershot(String status)//this status shoud either br pass or fail
        {
                // Date d = new Date();
             //   String format = d.toString().replace(":", "-");

          String path="C:\\Users\\githi\\eclipse-workspace\\AmazonProject\\screenshots\\"+status+"\\";   
          
          return path;
                
        }
        
         @Override
            public void onTestSuccess(ITestResult result) {

               
                TakesScreenshot ts = (TakesScreenshot) driver;
                File source = ts.getScreenshotAs(OutputType.FILE);
                String path1= pathOfScannershot("Pass");
                File destination = new File(path1+result.getTestClass().getName()+".png");

                try {
                    FileHandler.copy(source, destination);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onTestFailure(ITestResult result) {

              

                TakesScreenshot ts = (TakesScreenshot) driver;
                File source = ts.getScreenshotAs(OutputType.FILE);

                String path1=pathOfScannershot("Fail");
                File destination = new File(path1+result.getTestClass().getName()+".png");


                try {
                    FileHandler.copy(source, destination);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
}