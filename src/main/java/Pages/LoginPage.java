package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver rdriver) {
        WebDriver ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    // Locators
    @FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
    WebElement SignInHomeButton;

    @FindBy(id = "email")
    WebElement validEmail;

    @FindBy(id = "pass")
    WebElement PasswordField;

    @FindBy(id = "send2")
    WebElement submitBtn;

    @FindBy(id = "email-error")
    WebElement EmptyEmailMsg;

    @FindBy(id = "pass-error")
    WebElement EmptypassMsg;

    @FindBy(id = "email")
    WebElement invalidEmailMsg;

    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
    WebElement dropDownBtn;

    public void GoToLogin() {
        SignInHomeButton.click();
    }

    public void SetEmailAddress(String text) {
        validEmail.sendKeys(text);
    }

    public void SetPassword(String text) {
        PasswordField.sendKeys(text);
    }

    public void SignIn() {
        submitBtn.click();
    }


    public String getEmailEmptyMsg() {
        return EmptyEmailMsg.getText();
    }

    public String getPassEmptyMsg() {
        return EmptypassMsg.getText();
    }

    public String getInvalidEmailMsg() {
        return invalidEmailMsg.getText();
    }

}