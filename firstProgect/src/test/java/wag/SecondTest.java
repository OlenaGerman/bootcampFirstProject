package wag;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SecondTest extends BaseTest  {

    @Test
    public void testSecond (){


        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        String accpectedTitle = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";

        Assert.assertEquals(actualTitle, accpectedTitle);

        WebElement walkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.bCMkWd"));
        walkFreeButton.click();

        List<WebElement>inputFields = driver.findElements(By.cssSelector("input"));
        inputFields.get(0).sendKeys("german.sha@gmail.com");
        inputFields.get(1).sendKeys("password");
        inputFields.get(2).sendKeys("firstName");
        inputFields.get(3).sendKeys("lastName");
        inputFields.get(4).sendKeys("123456778Y");



    }




}
