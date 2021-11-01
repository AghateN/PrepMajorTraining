package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class signUpPage {
    public signUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='stm-lms-register']/form/div[1]/div[1]/div/input")
    private WebElement signUpUsername;

    @FindBy(how = How.XPATH, using = "//*[@id='stm-lms-register']/form/div[1]/div[2]/div/input")
    private WebElement signUpEmail;


    @FindBy(how = How.XPATH,using = "//*[@id='stm-lms-register']/form/div[2]/div[1]/div/input")
    private WebElement signUpPassword;

    @FindBy(how = How.XPATH, using = "//*[@id='stm-lms-register']/form/div[2]/div[2]/div/input")
    private WebElement signUpPasswordConfirmation;

    @FindBy(how = How.XPATH, using = "//*[@id='stm-lms-register']/form/div[3]/div/label/span/input")
    private WebElement signUpAgreementButton;

    @FindBy(how = How.XPATH, using = "//*[@id='stm-lms-register']/form/div[3]/div/div/button/span")
    private WebElement signUpRegister;

    public void enterSignUpUsername(String arg0){
        signUpUsername.sendKeys(arg0);

    }

    public void enterSignUpEmail(String arg1){
        signUpEmail.sendKeys(arg1);
    }

    public void enterSignUpPassword(String arg2){
        signUpPassword.sendKeys(arg2);
    }

    public void clickSignUpAgreementButton(){
        signUpAgreementButton.click();
    }

    public void clickSignUpRegister(){
        signUpRegister.click();
    }

    public void enterSignUpPasswordConfirmation(String arg3){
        signUpPasswordConfirmation.sendKeys(arg3);
    }


















}



