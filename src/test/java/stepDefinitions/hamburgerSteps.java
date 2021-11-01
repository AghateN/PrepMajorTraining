package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.hamburgerPage;

public class hamburgerSteps {
    public hamburgerPage hamburgerPage;
    public static WebDriver driver;

    public hamburgerSteps() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        hamburgerPage = new hamburgerPage(driver);
    }


    @Given("that user navigates to PrepMajor website")
    public void thatUserNavigatesToPrepMajorWebsite() {
    }

    @And("user signs into his account")
    public void userSignsIntoHisAccount() {
    }

    @When("user clicks on the hamburger button")
    public void userClicksOnTheHamburgerButton() {
    }

    @Then("user is able to navigate into his profile")
    public void userIsAbleToNavigateIntoHisProfile() {
    }

    @And("User sees the extended view of the Navigation panel which shows the Icon names on the left of the Panel and the Icon images to the Right of the names.")
    public void userSeesTheExtendedViewOfTheNavigationPanelWhichShowsTheIconNamesOnTheLeftOfThePanelAndTheIconImagesToTheRightOfTheNames() {
    }
}
