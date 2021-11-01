package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    public loginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //@FindBy(xpath = "//*[@id='stm-lms-login-modal']/div[2]/div[1]/input")
    @FindBy(how = How.XPATH, using = "//*[@id='stm-lms-login-modal']/div[2]/div[1]/input")
    private WebElement usernameField;

    @FindBy(how = How.XPATH, using = "//*[@id='stm-lms-login-modal']/div[2]/div[2]/input")
    private WebElement passwordField;

    @FindBy(how = How.XPATH, using = "//*[@id='stm-lms-login-modal']/div[2]/div[3]/a/span")
    private WebElement loginButton;

    public void enterUsernameField() {
        usernameField.sendKeys("MaryJones");
    }

    public void enterPasswordField() {
        passwordField.sendKeys("MaryJones123");
        }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void enterInvalidPassword(){
        passwordField.sendKeys("MaryJones12");
    }

    public void enterInvalidUsername(){
        usernameField.sendKeys("123456");
    }






}













