package wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }


    @FindBy(css = ".sc-ifAKCX.bCMkWd")
    private WebElement walkFreeButton;

    @FindBy(css = ".sc-ifAKCX.jlgKgQ")
    private WebElement becomeWalkerButton;


    public PromotionWalkFreePage clickWalkFreeButton(){

        wait.until(ExpectedConditions.elementToBeClickable(walkFreeButton));
        walkFreeButton.click();
       return new PromotionWalkFreePage(driver);

    }

    public BecomeWalkerPage clickBecomeWalkkerButton(){

        wait.until(ExpectedConditions.elementToBeClickable(becomeWalkerButton));
        becomeWalkerButton.click();
        return new BecomeWalkerPage(driver);

    }



}
