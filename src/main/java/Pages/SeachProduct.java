package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class SeachProduct {

    private Object webdriver;
    private Object Duration;
    private WebDriver driver;

    public SeachProduct(WebDriver rdriver) {
        WebDriver ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement searchBar;


   @FindBy(xpath = "//*[@id=\"search_mini_form\"]/div[2]/button")
    WebElement SearchBtn;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/div[2]/ol/li[1]/div/a/span/span/img")
    WebElement ProductSelection;

   @FindBy(id="option-label-size-143-item-168")
   WebElement sizeProduct;



    @FindBy(xpath = "//*[@id=\"super_attribute[143]-error\"]")
    WebElement SizeErrorMsg;


    @FindBy(id="option-label-color-93-item-57")
    WebElement ColorBtn;

    @FindBy(xpath = "//*[@id=\"super_attribute[93]-error\"]")
    WebElement ColorErrorMsg;

    @FindBy(id = "qty")
    WebElement Quantity;


    @FindBy(id="product-addtocart-button")
    WebElement AddCartBtn;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div")
    WebElement ProductAddedMsg;

    public void setSearchBar(String text) {
        searchBar.sendKeys(text);
    }

   public void clickSearchButton() {

        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(15));
        WebElement SearchBtn = wait.until(elementToBeClickable(By.cssSelector("#search_mini_form>div.actions>button")));
        SearchBtn.click();
    }

    public void setSearchBtn() {
        SearchBtn.click();
    }

    public void SelectProductName(){
        ProductSelection.click();
    }

    public void SetSize() {
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(15));
        //WebElement SizeBtn=wait.until(elementToBeClickable(By.cssSelector("#option-label-size-143-item-168")));
        WebElement SizeBtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#option-label-size-143-item-168")));
        SizeBtn.click();
          //  return this;
        }
        public void SetSizeBtn(){
            sizeProduct.click();
        }



    public String SetSizeMsg(){  return SizeErrorMsg.getText();}

    public void SetColor() {
        ColorBtn.click();
    }

    public String SetColorMsg(){return ColorErrorMsg.getText();}

    public void setQuantity() {
        Quantity.clear();
        //random quantity values
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        Quantity.sendKeys(String.valueOf(randomInt));
    }

    public void AddToCart() {
        AddCartBtn.click();

    }

    public String confirmProduct() {
       return ProductAddedMsg.getText();
    }

        }




