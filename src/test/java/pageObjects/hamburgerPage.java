package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class hamburgerPage {
    public hamburgerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
