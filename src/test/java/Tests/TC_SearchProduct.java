package Tests;

import Pages.BasePage;
import Pages.SeachProduct;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TC_SearchProduct extends BasePage {

   /* @Test
    public void Test01_ValidSearch() throws InterruptedException {
        SeachProduct SearchObj=new SeachProduct(driver);
        SearchObj.setSearchBar(" Olivia 1/4 Zip Light Jacket");
        SearchObj.setSearchBtn();
        SearchObj.SelectProductName();
        SearchObj.SetSize();
        SearchObj.SetColor();
        SearchObj.setQuantity();
        SearchObj.AddToCart();
        String CartProductMsg = SearchObj.confirmProduct();
        assertTrue(CartProductMsg.contains("You added Juno Jacket to your shopping cart."), "Product is added successfully");
        Thread.sleep(2000);
    }*/
    @Test
    public void Test02_InvalidSizeAndColor() throws InterruptedException {
        SeachProduct SearchObj=new SeachProduct(driver);
        SearchObj.setSearchBar(" Olivia 1/4 Zip Light Jacket");
        SearchObj.setSearchBtn();
        SearchObj.SelectProductName();
        SearchObj.setQuantity();
        SearchObj.AddToCart();
        Thread.sleep(2000);
        String SizeMsg = SearchObj.SetSizeMsg();
        assertTrue(SizeMsg.contains("This is a required field."), "Please select size");
        String ColorMsg = SearchObj.SetSizeMsg();
        assertTrue(ColorMsg.contains("This is a required field."), "Please select color");
        Thread.sleep(2000);
    }
    }

