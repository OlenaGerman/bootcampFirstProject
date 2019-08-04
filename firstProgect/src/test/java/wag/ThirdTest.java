package wag;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


    public class ThirdTest extends BaseTest {

        @Test
        public void testThird() {


            String actualTitle = driver.getTitle();
            System.out.println(actualTitle);

            String accpectedTitle = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";

            Assert.assertEquals(actualTitle, accpectedTitle);
            WebElement walkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.bCMkWd"));
            walkFreeButton.click();

            WebElement emailField = driver.findElement(By.cssSelector("input[name=\"email\"]"));
            emailField.click();
            WebElement passwordField = driver.findElement(By.cssSelector("input[name=\"password\"]"));
            passwordField.click();


            WebElement firstNameField = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));
            firstNameField.click();

            WebElement lastNameField = driver.findElement(By.cssSelector("input[name=\"lastName\"]"));
            lastNameField.click();

            WebElement phoneField = driver.findElement(By.cssSelector("input[name=\"phone\"]"));
            phoneField.click();

            WebElement emailField1 = driver.findElement(By.cssSelector("input[name=\"email\"]"));
            emailField.click();




            List<WebElement>requiredFields = driver.findElements(By.cssSelector(".sc-bdVaJa.sc-iwsKbI.kOShw"));

            String emailinfo = requiredFields.get(0).getText();
            System.out.println(emailinfo);
            Assert.assertEquals("required", emailinfo);
            String firstName = requiredFields.get(1).getText();
            System.out.println(firstName);
            Assert.assertEquals("required", firstName);
            String lastName = requiredFields.get(2).getText();
            System.out.println(lastName);
            Assert.assertEquals("required", lastName);
            String phone = requiredFields.get(3).getText();
            System.out.println(phone);
            Assert.assertEquals("required", phone);


















    }





}
