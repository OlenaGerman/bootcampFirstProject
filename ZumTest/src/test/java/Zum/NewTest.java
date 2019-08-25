package Zum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class NewTest extends BaseTest{
    private ZumApplyPage zumApplyPage;
    private ZumApplyPage2 zumApplyPage2;
    private Careers careers;

    @Test
    public void TestNew(){
        zumApplyPage = new ZumApplyPage(driver);
        zumApplyPage2 = zumApplyPage.clickApplyButton();
        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        zumApplyPage2.zumFirstNameClick();
        zumApplyPage2.zumLastNameClick();
        zumApplyPage2.zumEmailClick();
        zumApplyPage2.zumPhoneNamberClick();
        zumApplyPage2.selectAriaClick();
        zumApplyPage2.zumCodeClick();
        zumApplyPage2.clickSubmitButton();

        String actualResult = zumApplyPage2.getErrorTextFields(0);
        Assert.assertEquals("Please enter a value", actualResult);
        System.out.println(actualResult);

        zumApplyPage2.zumFirstName("Olena");
        zumApplyPage2.zumLastName("Germashova");
        zumApplyPage2.zumEmail("german.sha@gmail.com");
        zumApplyPage2.zumPhoneNumber("9292769225");
        zumApplyPage2.selectAria("California");
        zumApplyPage2.zumCodeField("1122");

        driver.switchTo().defaultContent();
        zumApplyPage2.clickCareers();









    }


}
