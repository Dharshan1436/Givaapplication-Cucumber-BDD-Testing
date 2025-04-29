package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static stepDefinitions.CommonSteps.driver;

public class ProductSearchSteps {
    @Then("user searches for {string}")
    public void user_searches_for(String product) {
        WebElement searchBox = driver.findElement(By.id("Search-In-Modal"));
        searchBox.click();
        searchBox.sendKeys(product);
        searchBox.sendKeys(Keys.ENTER);
    }

    @Then("search results for {string} should be displayed")
    public void search_results_for_should_be_displayed(String product) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement resultsSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("card-information")));
        assert resultsSection.isDisplayed();
        driver.quit();
    }
}
