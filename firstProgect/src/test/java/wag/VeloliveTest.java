package wag;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeloliveTest extends BaseTest {


    @Test
    public void testVelolive (){


        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        String accpectedTitle = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";

        Assert.assertEquals(actualTitle, accpectedTitle);

        WebElement walkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.bCMkWd"));
        walkFreeButton.click();
        WebElement emailField = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        emailField.sendKeys(user.getEmail());


        WebElement passwordField = driver.findElement(By.cssSelector("input[name=\"password\"]"));
        passwordField.sendKeys(user.getPassword());


        WebElement firstNameField = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));
        firstNameField.sendKeys(user.getFirstName());

        WebElement lastNameField = driver.findElement(By.cssSelector("input[name=\"lastName\"]"));
        lastNameField.sendKeys(user.getLastName());

        WebElement phoneField = driver.findElement(By.cssSelector("input[name=\"phone\"]"));
        phoneField.sendKeys(user.getPhone());




    }



}
