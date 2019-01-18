package FirefoxTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class FirefoxClass {
    WebDriver  Driver;
    @Given("^Test Firefox Driver$")
    public void test_Firefox_Driver() throws Throwable {
     System.out.println(" Test Firefox Driver");
    }

    @When("^I give path of the firefox available$")
    public void i_give_path_of_the_firefox_available() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\srini\\Downloads\\geckodriver-v0.23.0-win32\\geckodriver.exe");
        System.out.println(" I give path of the firefox available");
        Driver = new FirefoxDriver();

    }

    @Then("^I should be able to open any URL with firefox driver$")
    public void i_should_be_able_to_open_any_URL_with_firefox_driver() throws Throwable {
        Driver.get("https://facebook.com");
        System.out.println(Driver.getTitle());
        Driver.quit();

    }


}
