package LinkedIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

//    @FindBy(css = ".nav__logo.lazy-loaded")
//    private WebElement linkedIn;

    @FindBy(css = ".nav__button-secondary")
    private WebElement loginInButton;

    public LoginLinkedInPage clickLoginInButton()
    { wait.until(ExpectedConditions.elementToBeClickable(loginInButton));
    loginInButton.click();
    return  new LoginLinkedInPage(driver);

    }














}
