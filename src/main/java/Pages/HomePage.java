package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
    WebElement Register;

    @FindBy(id = "ui-id-4")
    WebElement Women;

    @FindBy(id = "ui-id-5")
    WebElement men;

    @FindBy(id = "ui-id-6")
    WebElement Gear;

    @FindBy(id = "ui-id-7")
    WebElement training;

    public void openRegister(){
        Register.click();
    }

    public void WomenCat(){
        Women.click();
    }
    public void MenCat(){
        men.click();
    }
    public void GearOpen(){
        Gear.click();
    }

    public void trainingOpen(){
        training.click();
    }






}
