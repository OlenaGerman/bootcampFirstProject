package Zum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ZumApplyPage extends BasePage {

    public ZumApplyPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".m-btn.front-banner__btn")
    private List<WebElement> applyButtonField;


    public ZumApplyPage2 clickApplyButton(){
        wait.until(ExpectedConditions.elementToBeClickable(applyButtonField.get(1)));
        applyButtonField.get(1).click();
        return new ZumApplyPage2(driver);
    }







}
