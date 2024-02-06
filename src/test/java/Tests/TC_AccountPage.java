package Tests;

import Pages.AccountPage;
import Pages.BasePage;
import org.junit.Test;

public class TC_AccountPage extends BasePage {

    @Test
    public void Test01_validInfo(){
        AccountPage AccountObj=new AccountPage(driver);
        driver.get(baseurl);
    }
}
