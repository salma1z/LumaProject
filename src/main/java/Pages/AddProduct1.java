package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class AddProduct1 {
    public WebDriver driver;

    public AddProduct1(WebDriver rdriver) {
        WebDriver ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        //driver.get("baseurl");
    }

    Random random = new Random();

    @FindBy(xpath = "//*[@id=\"search\"]//*[@id=\"search\"]")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"search_mini_form\"]/div[2]/button")
    WebElement searchBtn;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/div[2]/ol/li[1]/div/div/strong/a")
    WebElement ProductName;

    @FindBy(id = "option-label-size-143-item-168")
    WebElement ProductSize;

    @FindBy(id = "option-label-color-93-item-52")
    WebElement ProductColor;

    @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]/span")
    WebElement AddCartProduct1;


    public void SearchBar() {
        search.sendKeys("Lando Gym Jacket");
    }

    public void selectSearch() {
        searchBtn.click();
        driver.get("https://magento.softwaretestingboard.com/lando-gym-jacket.html");
    }

    public void selectSize() {
        ProductSize.click();
    }

    public void selectColor() {
        ProductColor.click();
    }

    public void AddCart() {
        AddCartProduct1.click();
    }

}


   /* @FindBy(css = "input-text qty")
    List<WebElement> ProductQuantity;


    @FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[2]")
    WebElement DeleteProductBTn;

    @FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[1]")
    WebElement EditProductBtn;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/ul/li[1]/button")
    WebElement CheckOutBtn;

    public void Seachbar(){
        search.sendKeys("Lando Gym Jacket");
    }

    public void SelectSearch(){
        searchBtn.click();
    }

   public void RandomSize(){
        int randomProduct=random.nextInt(maxProducts);
        ProductSize.get(randomProduct).click();
    }

    public void ItemQuantity() {
        int randomQuantity = random.nextInt();
      ProductQuantity.get(randomQuantity).click();

    }

    public void DeletePtoduct(){
        DeleteProductBTn.click();
}

public void EditProduct(){
        EditProductBtn.click();
}
    public void CheckOutList(){
        CheckOutBtn.click();
    }

}*/
