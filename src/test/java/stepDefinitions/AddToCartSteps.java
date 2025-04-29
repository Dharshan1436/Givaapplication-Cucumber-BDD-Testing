package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import utils.configReader;

public class AddToCartSteps {

    WebDriver driver =CommonSteps.driver;

    @When("user searches for Ring")
    public void user_searches_for_Ring() {
      WebElement search =  driver.findElement(By.id("Search-In-Modal"));
      search.click();
      search.sendKeys(configReader.getProperty("product"));
      search.sendKeys(Keys.ENTER);
    }

    @Then("search results should be displayed")
    public void search_results_should_be_displayed() {
        driver.findElement(By.className("card-information")).isDisplayed();
    }
    @When("user clicks on the first product")
    public void user_clicks_on_the_first_product() {
        driver.findElement(By.id("CardLink--7937680212130")).click();
    }
    @Then("product detail page should be displayed")
    public void product_detail_page_should_be_displayed() {
       driver.findElement(By.name("add")).isDisplayed();
    }
    @When("user adds the product to the cart")
    public void user_adds_the_product_to_the_cart() throws InterruptedException {
        driver.findElement(By.name("add")).click();
        Thread.sleep(1000);
    }
    @When("user views the cart")
    public void user_views_the_cart() {
        driver.findElement(By.id("cart-icon-bubble")).click();
    }

    @Then("cart should display the added product")
    public void cart_should_display_the_added_product() throws InterruptedException {
        driver.findElement(By.id("CartItem-1")).isDisplayed();
        Thread.sleep(5000);
        driver.quit();
    }
}
