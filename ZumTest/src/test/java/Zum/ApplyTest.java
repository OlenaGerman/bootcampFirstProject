package Zum;

import org.junit.Test;
import org.openqa.selenium.By;

import java.io.CharArrayReader;

public class ApplyTest extends BaseTest {
    private ZumApplyPage zumApplyPage;
    private ZumApplyPage2 zumApplyPage2;
    private Careers careers;


    @Test
    public void testApplyButton(){
        zumApplyPage = new ZumApplyPage(driver);
        zumApplyPage2 = zumApplyPage.clickApplyButton();

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));
        zumApplyPage2.zumFirstName("Olena");
        zumApplyPage2.zumLastName("Germashova");
        zumApplyPage2.zumEmail("german.sha@gmail.com");
        zumApplyPage2.zumPhoneNumber("9292769225");
        zumApplyPage2.selectAria("California");
//        zumApplyPage2.selectAriaByIndex(2);
        zumApplyPage2.zumCodeField("3344");


//        zumApplyPage2.clickSubmitButton();

        driver.switchTo().defaultContent();
        zumApplyPage2.clickCareers();





    }



}
