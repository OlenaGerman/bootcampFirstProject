package wag;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;
    protected User user;


    @Before

    public void start(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\germa\\Downloads\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://wagwalking.com");
        System.out.println("Before");
        user = new User("german.sha@gmail.com", "12345678Y", "Olena", "Germashova", "4566544566");

    }


    @After

    public void finish(){
        System.out.println("finish");
        driver.quit();
        //driver.quit();

    }
}
