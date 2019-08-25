package LinkedIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginLinkedInPage extends BasePage {

    public LoginLinkedInPage(WebDriver driver){
        super(driver);

    }

    @FindBy(css = ".form__label--floating")
    private WebElement userNameField;

    @FindBy(css = ".form__label--floating")
    private WebElement userPasswordField;

    @FindBy(css = ".btn__primary--large.from__button--floating'")
    private WebElement singInButton;

    public void inputUserName(String email){
        wait.until(ExpectedConditions.elementToBeClickable(userNameField));
        userNameField.sendKeys(email);
    }

    public void inputUserPassword(String password){
        wait.until(ExpectedConditions.elementToBeClickable(userPasswordField));
        userPasswordField.sendKeys(password);
    }

    public void clickSingInButton(){
        wait.until(ExpectedConditions.elementToBeClickable(singInButton));
        singInButton.click();
    }




}
