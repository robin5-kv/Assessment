package pageObjects;

import base.baseClass;
import dummy.Listner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import java.time.Duration;
@Listeners(Listner.class)
public class productPage extends baseClass {

    private final WebDriver driver;

    private final By addCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private final By listProductsCart = By.xpath("//div[@id='shopping_cart_container']/a");
    private final By checkOutButton = By.xpath("//button[@id='checkout']");
    private final By inputName = By.xpath("//input[@id='first-name']");
    private final By lastName = By.xpath("//input[@id='last-name']");
    private final By zipCode = By.xpath("//input[@id='postal-code']");
    private final By continueButton = By.id("continue");
    private final By finishButton = By.xpath("//button[@id='finish']");
    private final By successMessage = By.xpath("//h2[contains(text(),'Thank you for your order!')]");
    private final By hamburgerMenu = By.id("react-burger-menu-btn");
    private final By logoutSidebarLink = By.id("logout_sidebar_link");
    private final By removeButton = By.id("remove-sauce-labs-backpack");//


    public productPage(WebDriver driver) {
        this.driver = driver;
    }

    // actions

    public String addProducts() {
        driver.findElement(addCartButton).click();
        driver.findElement(listProductsCart).click();
        driver.findElement(checkOutButton).click();
        driver.findElement(inputName).sendKeys("portrave");
        driver.findElement(lastName).sendKeys("Solutions");
        driver.findElement(zipCode).sendKeys("680509");
        driver.findElement(continueButton).click();
        driver.findElement(finishButton).click();
        return driver.findElement(successMessage).getText();


    }

    public boolean ProductRemainsInCart() {
        driver.findElement(addCartButton).click();
        driver.findElement(hamburgerMenu).click();
        driver.findElement(logoutSidebarLink).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage lp = new loginPage(driver);
        lp.clickOnLoginButton("standard_user", "secret_sauce");
        return driver.findElement(removeButton).isDisplayed();
    }
}
