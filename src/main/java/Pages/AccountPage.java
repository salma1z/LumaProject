package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    public WebDriver driver;
    public AccountPage(WebDriver rdriver){
        WebDriver ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
        //driver.get("baseurl");
    }
    @FindBy(xpath = "//*[@id=\"block-collapsible-nav\"]/ul/li[1]/strong")
    WebElement MyAccountBtn;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/div[2]/div/div[2]/a[1]/span")
    WebElement EditBtn;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/div[2]/div/div[2]/a[2]")
    WebElement ChangePassBtn;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[5]/div[2]/div[1]/div[2]/a/span")
    WebElement EditBillBtn;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/a/span")
    WebElement EditShipBtn;

    public void MyAccountPage(){
        MyAccountBtn.click();
    }
    public void EditContact(){
        EditBtn.click();
    }

    public void ChangePassword(){
        ChangePassBtn.click();
    }

    public void EditBillingAddress(){
        EditBillBtn.click();
    }

    public void EditShippingAddress(){
        EditShipBtn.click();
    }


}
