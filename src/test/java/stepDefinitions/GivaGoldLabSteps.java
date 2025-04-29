package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class GivaGoldLabSteps {
    WebDriver driver = CommonSteps.driver;

    @Then("Gold with Lab Diamond category page should be displayed")
    public void gold_with_lab_diamond_category_page_should_be_displayed() {
       WebElement x= driver.findElement(By.id("HeaderMenu-gold-with-lab-diamonds"));
       x.isDisplayed();
       x.click();
    }

    @When("user selects product type Gold Necklace")
    public void user_selects_product_type_Gold_Necklace() {
        WebElement x= driver.findElement(By.id("Details-1-template--16317651189922__product-grid"));
        x.isDisplayed();
        x.click();
        WebElement checkbox = driver.findElement(By.id("Filter-filter.p.product_type-4"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", checkbox);
        x.click();

    }


    @Then("filtered jewelry should be visible")
    public void filtered_jewelry_should_be_visible() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
     for(int i=0;i<3;i++){
         js.executeScript("window.scrollBy(0, 500);");
     }
        driver.findElement(By.className("card-information")).isDisplayed();
        Thread.sleep(5000);
        driver.quit();
    }
}
