package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.configReader;

public class CommonSteps {
    public static WebDriver driver;

    @Given("user launches the browser")
    public void user_launches_the_browser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @When("user navigates to home page")
    public void user_navigates_to_home_page() {
        driver.get(configReader.getProperty("url"));
    }

    @Then("GIVA homepage should be displayed")
    public void giva_homepage_should_be_displayed() {
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
    }
}
