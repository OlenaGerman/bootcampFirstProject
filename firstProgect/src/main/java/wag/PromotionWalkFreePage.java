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

        @FindBy(css = "input[name=\"password\"]")
        private WebElement passwordField;

        @FindBy(css = "input[name=\"firstName\"]")
        private WebElement firstNameField;

        @FindBy(css = "input[name=\"lastName\"]")
        private WebElement lastNameField;

        @FindBy(css = "input[name=\"phone\"]")
        private WebElement cellPhoneField;

        @FindBy(css = ".sc-gzVnrw.htpxiB")
        private WebElement nextButton;

        @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
        private WebElement phoneErrorMassage;


        public void inputEmail(String email) {
            emailFiels.sendKeys(email);
        }

        public void inputPassword(String password){
          passwordField.sendKeys(password);
        }

        public void inputFirstName(String firstName){
            firstNameField.sendKeys(firstName);
        }

        public void inputLastName(String lastName){
            lastNameField.sendKeys(lastName);
        }

        public void inputCellPhone(String cellPhone){
            cellPhoneField.sendKeys(cellPhone);
        }

        public void clickNextButton(){
            nextButton.click();
        }

        public String getPhoneErrorMassage(){
            return phoneErrorMassage.getText();

        }


















    }

