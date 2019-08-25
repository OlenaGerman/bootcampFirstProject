package wag;

import org.junit.Test;

public class PromotionWalkFreeTest extends BaseTest {
    private HomePage homePage;
    private PromotionWalkFreePage promotionWalkFreePage;


    @Test
    public void testPromotionWalkFreeTest(){

        homePage = new HomePage(driver);
        promotionWalkFreePage = homePage.clickWalkFreeButton();
        promotionWalkFreePage.inputEmail(user.getEmail());
        promotionWalkFreePage.inputPassword(user.getPassword());
        promotionWalkFreePage.inputFirstName(user.getFirstName());
        promotionWalkFreePage.inputLastName(user.getLastName());
        promotionWalkFreePage.inputCellPhone(user.getPhone());




    }

}
