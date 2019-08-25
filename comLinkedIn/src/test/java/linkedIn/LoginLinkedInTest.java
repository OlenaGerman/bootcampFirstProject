package linkedIn;


import LinkedIn.HomePage;
import LinkedIn.LoginLinkedInPage;
import LinkedIn.UserId;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginLinkedInTest extends BaseTest {
    private HomePage homePage;
    private LoginLinkedInPage loginLinkedInPage;

    @Test
    public void testLoginLinkedIn(){
        homePage = new HomePage(driver);
        loginLinkedInPage = homePage.clickLoginInButton();
        loginLinkedInPage.inputUserName(userId.getEmail());
        loginLinkedInPage.inputUserPassword(userId.getPassword());
        loginLinkedInPage.clickSingInButton();


    }










}
