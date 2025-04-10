package dummy;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;

public class Listner implements ITestListener
{

    public void onTestStart(ITestResult result){

        System.out.println("Test Started"+result.getName());
    }

    public void onTestSuccess(ITestResult result)
    {

        System.out.println("Test Success "+result.getName());
    }
    public void onTestFailure(ITestResult result){

        TakesScreenshot ts = (TakesScreenshot)driverManager.getInstance().getWebdriver();
        File src =ts.getScreenshotAs(OutputType.FILE);
        File des = new File(System.getProperty("user.dir")+"src/test/images/"+ Date.from(Instant.now()));
        try {
            FileHandler.copy(src,des);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Test failed and Method name"+result.getName());
    }
}
