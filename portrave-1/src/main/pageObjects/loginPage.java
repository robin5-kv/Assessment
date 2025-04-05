package pageObjects;


import base.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginPage extends baseClass {
    private final WebDriver driver;
    private final By usernameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage = By.cssSelector("[data-test='error']");


    //Initialize the objects
    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void clickOnLoginButton(String uname, String pword) {
        driver.findElement(usernameInput).sendKeys(uname);
        driver.findElement(passwordInput).sendKeys(pword);
        driver.findElement(loginButton).click();
    }

    public boolean isInventoryUrlDisplayed() {
        return driver.getCurrentUrl().contains("inventory");
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public String getLocalStorageItem(String key) {
        return (String) ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript("return window.localStorage.getItem(arguments[0]);", key);
    }

}
