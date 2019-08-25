package wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BecomeWalkerPage extends BasePage {

    public BecomeWalkerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#first_name")
    private WebElement firstNameField;

    @FindBy(css = "#last_name")
    private WebElement lastNameField;

    @FindBy(css = "#email")
    private WebElement emailField;

    @FindBy(css = "#phone")
    private WebElement phoneField;

    @FindBy(css = "#address__line-one")
    private WebElement adressField;

    @FindBy(css = "#city")
    private WebElement cityField;

    @FindBy(css = ".autocomplete-result ")
    private List<WebElement> autocompleteField;


    @FindBy(css = ".btn.common-dropdown.common-dropdown-item")
    private List<WebElement> stateFields;

    @FindBy(css = "#address_line_2")
    private WebElement appartmentField;

    @FindBy(css = "#zipcode")
    private WebElement zipcodeField;

    @FindBy(css = "button-text-wrapper")
    private WebElement applyButtonField;

    @FindBy(css = ".error-message")
    private List<WebElement> errors;



    public void inputFirstName(String firstname) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstname);
    }


    public void inputLastName(String lastname) {
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.sendKeys(lastname);
    }


    public void inputEmail(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }


    public void inputPhone(String phone) {
        wait.until(ExpectedConditions.elementToBeClickable(phoneField));
        phoneField.sendKeys(phone);

    }


    public void inputAdress(String adress) {
        wait.until(ExpectedConditions.elementToBeClickable(adressField));
        adressField.sendKeys(adress);

    }


    public void selectAdressOption(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElements(autocompleteField));
        autocompleteField.get(index).click();
    }


    public void inputAppartment(String app) {
        wait.until(ExpectedConditions.elementToBeClickable(adressField));
        appartmentField.sendKeys(app);
    }


    public void inputCity(String city) {
        wait.until(ExpectedConditions.elementToBeClickable(cityField));
        cityField.sendKeys(city);
    }



    public void selectStateOptions(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElements(stateFields));
        stateFields.get(index).click();
    }

    public void inputZipcode(String zip){
        wait.until(ExpectedConditions.elementToBeClickable(zipcodeField));
        zipcodeField.sendKeys(zip);
    }

    public  void clickApplyButton(){
        wait.until(ExpectedConditions.elementToBeClickable(applyButtonField));
        applyButtonField.click();

    }

    public String getErrorText(int index){
        wait.until(ExpectedConditions.visibilityOf(errors.get(index)));
        return errors.get(index).getText();

    }

}

//    public List<WebElement> getAutocompleteField() {
//        return autocompleteField;
//    }
//    public void inputState(){
//        wait.until(ExpectedConditions.elementToBeClickable(stateFields));






