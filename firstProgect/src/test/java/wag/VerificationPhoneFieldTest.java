package wag;

import org.junit.Assert;
import org.junit.Test;

public class VerificationPhoneFieldTest extends BaseTest{
    private HomePage homePage;
    private PromotionWalkFreePage promotionWalkFreePage;



    @Test
    public void testVerificationPhoneField(){

        homePage = new HomePage(driver);
        promotionWalkFreePage = homePage.clickWalkFreeButton();
        promotionWalkFreePage.inputEmail(user.getEmail());
        promotionWalkFreePage.inputPassword(user.getPassword());
        promotionWalkFreePage.inputFirstName(user.getFirstName());
        promotionWalkFreePage.inputLastName(user.getLastName());
        promotionWalkFreePage.inputCellPhone("92927692");
        promotionWalkFreePage.clickNextButton();

        String errorPhoneMassage = promotionWalkFreePage.getPhoneErrorMassage();
        Assert.assertEquals("please enter a valid phone number", errorPhoneMassage);
        System.out.println(errorPhoneMassage);








    }


}
