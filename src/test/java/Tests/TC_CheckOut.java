package Tests;

import Pages.BasePage;
import Pages.CheckOut;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TC_CheckOut extends BasePage {
    @Test
    public void TC01_InvalidPhoneNum() throws InterruptedException {
        CheckOut CheckObj=new CheckOut(driver);
        CheckObj.OpenCheckOut();
        CheckObj.FinalCheckOut();
        CheckObj.Address("street");
        CheckObj.City("cairo");
        CheckObj.State("Egypt");
        CheckObj.payingfield();
        CheckObj.setzipcode("");
        CheckObj.InvalidPhoneMsg();
        CheckObj.payingfield();
        CheckObj.Shipping();
        String CheckErrorMsg = CheckObj.InvalidPhoneMsg();
        assertTrue(CheckErrorMsg.contains("This is a required field."), "Complete your Data");
        Thread.sleep(2000);

    }
}
