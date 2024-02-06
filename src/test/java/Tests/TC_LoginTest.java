package Tests;

import Pages.BasePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TC_LoginTest extends BasePage {


    @Test(priority = 3)
    public void Test02_EmptyEmail() throws InterruptedException {
        LoginPage LoginObj = new LoginPage(driver);
        LoginObj.GoToLogin();
        LoginObj.SetPassword("123*type");
        LoginObj.SignIn();
        String emailEmptyMassage = LoginObj.getEmailEmptyMsg();
        assertTrue(emailEmptyMassage.contains("This is a required field."), "Please try again,Login is not working correctly");
        Thread.sleep(2000);

    }

    @Test(priority = 2)
    public void Test03_EmptyPassword() throws InterruptedException {
        LoginPage LoginObj = new LoginPage(driver);
        LoginObj.GoToLogin();
        LoginObj.SetEmailAddress("salma.a.elzeheiry@gmail.com");
        LoginObj.SignIn();
        String PasswordEmptyMassage = LoginObj.getPassEmptyMsg();
        assertTrue(PasswordEmptyMassage.contains("This is a required field."), "Please try again,Login is not working correctly");
    }

    @Test(priority = 1)
    public void Test04_ErrorEmail() throws InterruptedException {
        LoginPage LoginObj = new LoginPage(driver);
        LoginObj.GoToLogin();
        LoginObj.SetEmailAddress("salma.a.elzeheiry.com");
        LoginObj.SetPassword("123*typee");
        LoginObj.SignIn();
        String emailEmptyMassage = LoginObj.getEmailEmptyMsg();
        assertTrue(emailEmptyMassage.contains("Please enter a valid email address (Ex: johndoe@domain.com)."), "Please try again,Login is not working correctly");
    }
    @Test(priority = 4)
    public void Test05_EmptyEmailAndPassword() throws InterruptedException {
        LoginPage LoginObj = new LoginPage(driver);
        LoginObj.GoToLogin();
        LoginObj.SignIn();
        String emailEmptyMassage = LoginObj.getEmailEmptyMsg();
        assertTrue(emailEmptyMassage.contains("This is a required field."), "Please try again,Login is not working correctly");
        String PasswordEmptyMassage = LoginObj.getPassEmptyMsg();
        assertTrue(PasswordEmptyMassage.contains("This is a required field."), "Login Feature is not working correctly");
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void Test01_ValidLogin() throws InterruptedException {
        LoginPage LoginObj = new LoginPage(driver);
        driver.get(baseurl);
        LoginObj.GoToLogin();
        LoginObj.SetEmailAddress("salma.a.elzeheiry@gmail.com");
        LoginObj.SetPassword("123*typee");
        LoginObj.SignIn();
        String actualUrl = "https://magento.softwaretestingboard.com/";
        String expectedUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);

    }
}