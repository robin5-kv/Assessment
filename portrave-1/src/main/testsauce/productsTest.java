package testsauce;

import base.baseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.loginPage;
import pageObjects.productPage;

public class productsTest  extends baseClass
{
   public productPage pp;


    @BeforeMethod
    public void setup(){
        super.launchBrowser();
      pp = new productPage(driver);

    }

    @Test(description = "Create a Positive flow add product to cart",priority = 0)
    public void testProductsIntoCart(){
        loginPage lp = new loginPage(driver);
        lp.clickOnLoginButton("standard_user","secret_sauce");
        Assert.assertEquals(pp.addProducts(),"Thank you for your order!");
        System.out.println("New Product is added");
    }

    @Test(description = "Add a product to the cart, then log out and log back into the application. Verify that the product remains in the cart.",priority = 1)
    public void testProductRemainsInCart(){
        loginPage lp = new loginPage(driver);
        lp.clickOnLoginButton("standard_user","secret_sauce");
        Assert.assertTrue(pp.ProductRemainsInCart());
        System.out.println("Products is remains in the cart");

    }
}
