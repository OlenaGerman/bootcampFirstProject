package wag;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BecomeWalkerTests extends BaseTest{

    private HomePage homePage;
    private BecomeWalkerPage becomeWalkerPage;


    @Test
    public void testBecomeWalker(){
        homePage = new HomePage(driver);
        becomeWalkerPage = homePage.clickBecomeWalkkerButton();
        becomeWalkerPage.inputFirstName("Alex");
        becomeWalkerPage.inputLastName(user.getLastName());
        becomeWalkerPage.inputEmail("alex@gmail.com");
        becomeWalkerPage.inputPhone("4044545");
        becomeWalkerPage.inputAdress("123");
        becomeWalkerPage.selectAdressOption(0);
        becomeWalkerPage.inputAppartment("B");
        becomeWalkerPage.inputCity("Brooklyn");
        becomeWalkerPage.inputZipcode("");
        becomeWalkerPage.clickApplyButton();


        String actualResult = becomeWalkerPage.getErrorText(3);
        Assert.assertEquals("Enter valid phone number", actualResult);








    }




}
