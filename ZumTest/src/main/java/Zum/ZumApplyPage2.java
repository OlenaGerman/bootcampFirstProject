package Zum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ZumApplyPage2 extends BasePage {

    public ZumApplyPage2(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".form-control ")
    private List<WebElement>zumApplyForm;

    @FindBy(css = ".btn-apply.js-submit.app-apply-button.application-form__submit-button")
    private WebElement submitButton;

    @FindBy(css = ".main-menu__link")
    private List<WebElement> careers;

    @FindBy(css = ".help-block")
    private List<WebElement>errorTextFields;


    public void zumFirstName(String firstName){
        wait.until(ExpectedConditions.elementToBeClickable(zumApplyForm.get(0)));
        zumApplyForm.get(0).sendKeys(firstName);
    }

    public void zumFirstNameClick(){
        wait.until(ExpectedConditions.elementToBeClickable(zumApplyForm.get(0)));
        zumApplyForm.get(0).click();
    }


    public void zumLastName(String lastName){
        wait.until(ExpectedConditions.elementToBeClickable(zumApplyForm.get(1)));
        zumApplyForm.get(1).sendKeys(lastName);
    }

    public void zumLastNameClick(){
        wait.until(ExpectedConditions.elementToBeClickable(zumApplyForm.get(1)));
        zumApplyForm.get(1).click();
    }

    public void zumEmail(String email){
        wait.until(ExpectedConditions.elementToBeClickable(zumApplyForm.get(2)));
        zumApplyForm.get(2).sendKeys(email);
    }

    public void zumEmailClick(){
        wait.until(ExpectedConditions.elementToBeClickable(zumApplyForm.get(3)));
        zumApplyForm.get(2).click();
    }

    public void zumPhoneNumber(String phoneNumber){
        wait.until(ExpectedConditions.elementToBeClickable(zumApplyForm.get(3)));
        zumApplyForm.get(3).sendKeys(phoneNumber);
    }

    public void zumPhoneNamberClick(){
        wait.until(ExpectedConditions.elementToBeClickable(zumApplyForm.get(3)));
        zumApplyForm.get(3).click();
    }

    public void selectAriaByIndex(int index){
        wait.until(ExpectedConditions.elementToBeClickable(zumApplyForm.get(4)));
        Select select = new Select(zumApplyForm.get(4));
        select.selectByIndex(index);
    }

    public void selectAriaClick(){
        wait.until(ExpectedConditions.elementToBeClickable(zumApplyForm.get(4)));
        zumApplyForm.get(4).click();
    }

    public void selectAria(String str){
        wait.until(ExpectedConditions.elementToBeClickable(zumApplyForm.get(4)));
        Select select = new Select(zumApplyForm.get(4));
        select.selectByVisibleText(str);
    }


    public void zumCodeField(String code){
        wait.until(ExpectedConditions.elementToBeClickable(zumApplyForm.get(5)));
        zumApplyForm.get(5).sendKeys(code);

    }

    public void zumCodeClick(){
        wait.until(ExpectedConditions.elementToBeClickable(zumApplyForm.get(5)));
        zumApplyForm.get(5).click();
    }

    public void clickSubmitButton(){
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();

    }

    public void clickCareers(){
        wait.until(ExpectedConditions.elementToBeClickable(careers.get(4)));
        careers.get(4).click();

    }

    public String getErrorTextFields(int index){
        wait.until(ExpectedConditions.elementToBeClickable(errorTextFields.get(index)));
        return errorTextFields.get(index).getText();
    }











}
