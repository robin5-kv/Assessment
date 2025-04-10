package dummy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class driverManager
{

    private  static driverManager instance =null;
    private WebDriver driver= null;

    private driverManager(){
    if(driver == null)
    {

            driver = new ChromeDriver();
    }
}

    public  static driverManager getInstance(){
        if(instance== null){
            instance = new driverManager();

        }
        return instance;
    }

    public WebDriver getWebdriver(){

        return driver;
}

public void close(){
        if(driver!=null){
            driver.quit();
            driver=null;
            instance=null;

        }
}

    public static void main(String[] args) {
          driverManager.getInstance().getWebdriver().get("https://www.redbus.in");
         driverManager.getInstance().getWebdriver().get("https://www.flipkart.com");
        Scanner sc = new Scanner(System.in);

    }
}
