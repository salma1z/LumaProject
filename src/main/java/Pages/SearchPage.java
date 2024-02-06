package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public WebDriver driver;
    public SearchPage(WebDriver rdriver){
        WebDriver ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
        //driver.get("baseurl");
    }
    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement SearchBar;

    @FindBy(xpath = "//*[@id=\"search_mini_form\"]/div[2]/button")
    WebElement SearchBtn;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[1]/div/div/div[3]/div/div[2]/a[2]")
     WebElement Compare_Item1;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[3]/div/div/div[4]/div/div[2]/a[2]")
    WebElement Compare_Item2;


    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[5]/div/div/div[4]/div/div[2]/a[1]")
    WebElement WishList_Item1;


    public void SearchItems() {
        SearchBar.sendKeys("jackets");
    }
    public void SubmitSearch(){
        SearchBtn.click();
    }

    public void Item1(){
        Compare_Item1.click();
    }

    public void Item2(){
        Compare_Item2.click();
    }

    public void Item3(){
        WishList_Item1.click();
    }



}
