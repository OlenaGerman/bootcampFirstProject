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

    }

}
