package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage {
    public WebDriver driver;
    public CartPage(WebDriver rdriver){
        WebDriver ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
        //driver.get("baseurl");
    }

    @FindBy(xpath = "//*[@id=\"qty\"]")
    WebElement Quantity;

    @FindBy(css = ".product-item-link")
    List<WebElement> linkProduct;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[1]/div/div/div[3]/div/div[1]/form/button/span")
    WebElement AddToCartBtn;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[5]/div/a[1]/span")
    WebElement WishListBtn;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[5]/div/a[2]/span")
    WebElement CompareProductBtn;


    public void QuantitySelection(String text){
        Quantity.sendKeys(text);
    }


    public void AddToCartPage(){
        AddToCartBtn.click();
    }

    public void WishListPage(){
        WishListBtn.click();
    }


    public void CompareProductPage(){
        CompareProductBtn.click();
    }


}
