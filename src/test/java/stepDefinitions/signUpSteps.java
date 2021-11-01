package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.signUpPage;

public class signUpSteps {

    public signUpPage signUpPage;
    public static WebDriver driver;

    public signUpSteps() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        signUpPage = new signUpPage(driver);
    }

    @Given("that user navigates to the PrepMajor website")
    public void thatUserNavigatesToThePrepMajorWebsite() {
        driver.get("https://develop1.prepmajor.com/");
        driver.manage().window().maximize();
    }

    @And("user clicks on the sign up button")
    public void userClicksOnTheSignUpButton() {
        driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[3]/div[2]/div[1]/div[2]/a/span")).click();
    }

    @And("user enters a valid {string} and {string} and {string}")
    public void userEntersAValidAndAnd(String arg0, String arg1, String arg2) throws InterruptedException {
        Thread.sleep(5000);
        signUpPage.enterSignUpUsername(arg0);
        signUpPage.enterSignUpEmail(arg1);
        signUpPage.enterSignUpPassword(arg2);

        //driver.findElement(By.xpath("//*[@id='stm-lms-register']/form/div[1]/div[1]/div/input")).sendKeys(arg0);
        //driver.findElement(By.xpath("//*[@id='stm-lms-register']/form/div[1]/div[2]/div/input")).sendKeys(arg1);
        //driver.findElement(By.xpath("//*[@id='stm-lms-register']/form/div[2]/div[1]/div/input")).sendKeys(arg2);
    }

    @And("user confirms {string}")
    public void userConfirms(String arg3) {
        //driver.findElement(By.xpath("//*[@id='stm-lms-register']/form/div[2]/div[2]/div/input")).sendKeys(arg3);
        signUpPage.enterSignUpPasswordConfirmation(arg3);
    }

    @And("user clicks on the agreement button")
    public void userClicksOnTheAgreementButton() {
        //driver.findElement(By.xpath("//*[@id='stm-lms-register']/form/div[3]/div/label/span/input")).click();
        signUpPage.clickSignUpAgreementButton();
    }

    @When("user clicks on Register button")
    public void userClicksOnRegisterButton() {
        //driver.findElement(By.xpath("//*[@id='stm-lms-register']/form/div[3]/div/div/button/span")).click();
        signUpPage.clickSignUpRegister();
    }

    @Then("user is logged into his account")
    public void userIsLoggedIntoHisAccount() {
    }
}
