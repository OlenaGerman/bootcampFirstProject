package wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PromotionWalkFreePage extends BasePage {

        public PromotionWalkFreePage(WebDriver driver){
            super(driver);
        }

        @FindBy(css = "input[name=\"email\"]")
        private WebElement emailFiels;

        public void inputEmail(String email) {
            emailFiels.sendKeys(email);
        }













    }

