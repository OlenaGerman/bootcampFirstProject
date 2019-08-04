package wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }


    @FindBy(css = ".sc-ifAKCX.bCMkWd")
    private WebElement walkFreeButton;

    public PromotionWalkFreePage clickWalkFreeButton(){
        walkFreeButton.click();
       return new PromotionWalkFreePage(driver);
    }



}
