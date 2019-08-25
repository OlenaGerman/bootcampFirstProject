package Zum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Careers extends BasePage {
    public Careers(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "main-menu__link.main-menu__link_active")
    private WebElement careers;







}


