package linkedIn;

import LinkedIn.UserId;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;
    protected UserId userId;




    @Before
    public void Start(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\germa\\Downloads\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "LinkedIn: Log In or Sign Up";
        Assert.assertEquals(expectedTitle, actualTitle);
        userId = new UserId("german.sha@gmail.com", "9292769225", "Germashova2017");

    }

    @After

    public void finish(){

        driver.quit();
    }



}
