package testsauce;

import base.baseClass;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.loginPage;
import java.time.Duration;

public class loginTest extends baseClass {
    public loginPage lp;



    @DataProvider(name = "validLoginData")
    public Object[][] loginDetails() {

        return new Object[][]
                {
                        {"standard_user", "secret_sauce", true, ""},
                        {"locked_out_user", "secret_sauce", false, "Epic sadface: Sorry, this user has been locked out."},
                        {"problem_user", "secret_sauce", true, ""},
                        {"performance_glitch_user", "secret_sauce", true, ""},
                        {"error_user", "secret_sauce", true, ""},
                        {"visual_user", "secret_sauce", true, ""}
                };

    }

    @DataProvider(name = "invalidLoginData")
    public Object[][] inValidLoginDetails() {

        return new Object[][]
                {
                        {"standard_user", "secret_sauce1", false, ""},
                        {"locked_out_user", "secret_sauce1", false, "Epic sadface: Sorry, this user has been locked out."},
                        {"problem_user", "secret_sauce1", false, ""},
                        {"performance_glitch_user", "secret_sauce1", false, ""},
                        {"error_user", "secret_sauce1", false, ""},
                        {"visual_user", "secret_sauce1", false, ""}
                };

    }

    @BeforeMethod
    public void setup() {
        super.launchBrowser();
        lp = new loginPage(driver);
    }

    @Test(dataProvider = "validLoginData", description = "User with Valid set data Able to Login to Application", priority = 0)
    public void loginInToApplication(String uname, String password, boolean shouldLogin, String text) {
        lp.clickOnLoginButton(uname, password);
        if (shouldLogin) {
            Assert.assertTrue(lp.isInventoryUrlDisplayed(), "Not Landed Product Page");
            System.out.println("Valid User Logged with UserName " + uname + " ");
        }
        else {
            Assert.assertTrue(lp.getErrorMessage().contains(text), "Error message mismatch.");
            System.out.println("Valid User Contains error message" + uname);
        }

    }


    @Test(dataProvider = "invalidLoginData", description = "User with Invalid set data Able to Login to Application", priority = 1)
    public void loginInToApplicationInvalidData(String uname, String password, boolean shouldLogin, String text) {
        lp.clickOnLoginButton(uname, password);
        if (shouldLogin) {
            Assert.assertFalse(lp.isInventoryUrlDisplayed(), "Landed Product Page");
            System.out.println("Valid User Logged with invalid password " + uname + " ");
        }
        else{
            Assert.assertTrue(lp.getErrorMessage().contains(text), "Error message mismatch.");
            System.out.println("Invalid User Contains error message" + uname);
        }
    }

    @Test(priority = 3, description = "get Local Storage")
    public void testLocalStorageAfterLogin() {

        lp.clickOnLoginButton("standard_user", "secret_sauce");

        Assert.assertTrue(lp.isInventoryUrlDisplayed(), "User should be logged in.");

        String storageItem = lp.getLocalStorageItem("session-username");
        Assert.assertEquals(storageItem, "standard_user", "Local storage username is different.");
    }


    @Test(priority = 4,description = "fetch the Cookie value and compare")
    public void verifySessionUsernameCookie() throws InterruptedException {
        loginPage lp = new loginPage(driver);
        lp.clickOnLoginButton("standard_user", "secret_sauce");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Get cookie
        Cookie sessionCookie = driver.manage().getCookieNamed("session-username");
        System.out.println("Value of Cookie " +sessionCookie);

        // Assertion
        Assert.assertNotNull(sessionCookie, "Session cookie should exist after login.");
        Assert.assertEquals(sessionCookie.getValue(), "standard_user", "Session cookie has wrong value!");
    }
}
