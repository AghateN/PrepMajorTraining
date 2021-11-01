package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.loginPage;


public class loginSteps {
        public loginPage loginPage;
        public static WebDriver driver;
        public loginSteps() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            loginPage = new loginPage(driver);
            //System.setProperty("WebDriver.chrome.driver", "C:\\Users\\acbio\\IdeaProjects\\prepmajor2\\src\\test\\resources\\drivers\\chromedriver.exe");
        }

        @Given("that user is on PrepMajor website")
    public void thatUserIsOnPrepMajorWebsite() {
        driver.get("https://develop1.prepmajor.com/");
        driver.manage().window().maximize();
    }
        @When("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
            driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[3]/div[2]/div[1]/div[3]/a/span")).click();
    }
        @And("user enters my Username")
    public void userEntersMyUsername() throws InterruptedException {
            Thread.sleep(5000);
            loginPage.enterUsernameField();

        //driver.findElement(By.xpath("//*[@id='stm-lms-login-modal']/div[2]/div[1]/input")).sendKeys("MaryJones");
    }
        @And("user enters my Password")
    public void userEntersMyPassword() {
            loginPage.enterPasswordField();
            //driver.findElement(By.xpath("//*[@id='stm-lms-login-modal']/div[2]/div[2]/input")).sendKeys("MaryJones123");
    }
        @And("user Clicks on Login")
    public void userClicksOnLogin() {
            loginPage.clickLoginButton();
            //driver.findElement(By.xpath("//*[@id='stm-lms-login-modal']/div[2]/div[3]/a/span")).click();
    }

    @Then("user is logged in his account")
    public void userIsLoggedInHisAccount() {
    }

    @And("user enters an invalid password")
    public void userEntersAnInvalidPassword() {
            loginPage.enterInvalidPassword();
    }

    @Then("user is not logged in his account")
    public void userIsNotLoggedInHisAccount() {
    }

    @And("user enters an invalid username")
    public void userEntersAnInvalidUsername() throws InterruptedException {
            Thread.sleep(5000);
        loginPage.enterInvalidUsername();
    }
}
