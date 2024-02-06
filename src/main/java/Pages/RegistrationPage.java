package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    public WebDriver driver;

    public RegistrationPage(WebDriver rdriver) throws InterruptedException {
        WebDriver ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

        //  driver.get("baseurl");
    }

    @FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Create an Account')]")
    WebElement CreateAccountButton;

    @FindBy(id = "firstname")
    WebElement fnameField;

    @FindBy(id = "lastname")
    WebElement lnameField;

    @FindBy(id = "email_address")
    WebElement emailField;

    @FindBy(id = "password")
    WebElement passField;

    @FindBy(id = "password-confirmation")
    WebElement confPassField;

    @FindBy(className = "submit")
    WebElement AccountBtn;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")
    WebElement registeredMsg;

    @FindBy(id="password-error")
    WebElement minimumLengthMsg;

    @FindBy(id="password-confirmation-error")
    WebElement misConfirm;


    public void CreateAccount() {
        CreateAccountButton.click();
    }


    public void fillFirstName(String text) {
        fnameField.sendKeys(text);
    }

    public void fillLastName(String text) {
        lnameField.sendKeys(text);
    }

    public void fillEmail(String text) {
        emailField.sendKeys(text);
    }

    public void fillPassword(String text) {
        passField.sendKeys(text);
    }

    public void fillConfirmPassword(String text) {
        confPassField.sendKeys(text);
    }

    public void submitForm() {
        AccountBtn.click();
    }

    public String registeredBefore() {
        return registeredMsg.getText();
    }

    public String MinimumPass() {
       return minimumLengthMsg.getText();
    }

public String MismatchPass(){
        return misConfirm.getText();
}

}

