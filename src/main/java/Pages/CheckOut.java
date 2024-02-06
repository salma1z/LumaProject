package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOut {
    public WebDriver driver;

    public CheckOut(WebDriver rdriver) {
        WebDriver ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        //driver.get("baseurl");
    }

    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div[1]/a")
    WebElement cartBtn;

    @FindBy(id = "top-cart-btn-checkout")
    WebElement CheckOutBtn;

    @FindBy(xpath = "//*[@id=\"VISRF7D\"]")
    WebElement StreetAddress;


    @FindBy(xpath = "//*[@id=\"ELWFX68\"]")
    WebElement City;


    @FindBy(id = "uid")
    WebElement State;

    @FindBy(id="UQK4MOD")
    WebElement Zipcode;

    @FindBy(id = "uid")
    WebElement country;

    @FindBy(id="C1800QL")
    WebElement Phone;

    @FindBy(id = "//*[@id=\"error-O0YW7BC\"]/span")
    WebElement PhoneRequired;

    @FindBy(xpath ="//label[text()='Table Rate'" )
    WebElement check;

    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/div/button/span")
    WebElement shippingBtn;


    public void OpenCheckOut() {
        cartBtn.click();
    }

    public void FinalCheckOut() {
        CheckOutBtn.click();
    }

    public void Address(String text) {
        StreetAddress.sendKeys("text");
    }

    public void City(String text) {
        City.sendKeys("text");
    }
    public void State(String text) {
        State.sendKeys("text");
    }
    public void StateByIndex(int index) {
        Select select = new Select(State);
        select.selectByIndex(index);
    }

    public void setzipcode(String text) {
        State.sendKeys(text);
    }

    public void Countryfield(int index) {
        Select select = new Select(country);
        select.selectByIndex(index);
    }

    public void Phonefield(String text) {
        Phone.sendKeys(text);
    }
    public String InvalidPhoneMsg(){ return PhoneRequired.getText();}
    public void payingfield() {
        check.click();
    }
    public void Shipping() {
        shippingBtn.click();
    }


}