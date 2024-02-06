package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareProducts {
    public WebDriver driver;
    public CompareProducts(WebDriver rdriver){
        WebDriver ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
        //driver.get("baseurl");
    }
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div/a")
    WebElement ComparisonListBtn;

    @FindBy(xpath = "//*[@id=\"product-comparison\"]/tbody[1]/tr/td[1]/div[2]/div[1]/form/button/span")
    WebElement FirstCompareBtn;

    @FindBy(xpath = "//*[@id=\"product-comparison\"]/tbody[1]/tr/td[2]/div[3]/div[1]/form/button/span")
    WebElement SecondCompareBtn;

    @FindBy(xpath = "//*[@id=\"product-comparison\"]/tbody[1]/tr/td[3]/div[2]/div[1]/form/button/span")
    WebElement ThirdCompareBtn;

    public void CompareList(){
        ComparisonListBtn.click();
    }

    public void firstCompare(){
        FirstCompareBtn.click();
    }

    public void secondCompare(){
        SecondCompareBtn.click();
    }

    public void thirdCompare(){
        ThirdCompareBtn.click();
    }

}
