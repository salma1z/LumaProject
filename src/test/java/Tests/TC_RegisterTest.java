package Tests;

import Pages.BasePage;
import Pages.RegistrationPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TC_RegisterTest extends BasePage {


    //confirmation password mismatch password
    @Test(priority = 1)
    public void Test01_inValidPassword() throws InterruptedException {
        RegistrationPage RegisterObj=new RegistrationPage(driver);
        RegisterObj.CreateAccount();
        RegisterObj.fillFirstName("salma");
        RegisterObj.fillLastName("Elzeheiry");
        RegisterObj.fillEmail("salma.a.elzeheiry@gmail.com");
         RegisterObj.fillPassword("123*typee");
        RegisterObj.fillConfirmPassword("123*t");
        RegisterObj.submitForm();
        String MisConfirmPassword = RegisterObj.MismatchPass();
        assertTrue(MisConfirmPassword.contains("Please enter the same value again."), "Please try again with same Password");
        Thread.sleep(2000);
    }
    //Registration with minimium password
    @Test(priority = 2)
    public void Test02_inValidPassword() throws InterruptedException {
        RegistrationPage RegisterObj=new RegistrationPage(driver);
        RegisterObj.CreateAccount();
        RegisterObj.fillFirstName("salma");
        RegisterObj.fillLastName("Elzeheiry");
        RegisterObj.fillEmail("salma.a.elzeheiry@gmail.com");
        RegisterObj.fillPassword("123");
        RegisterObj.fillConfirmPassword("123");
        RegisterObj.submitForm();
        String MinimumLength = RegisterObj.MinimumPass();
        assertTrue(MinimumLength.contains("Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored."), "Please enter 8 letters");
        Thread.sleep(2000);

    }

}



