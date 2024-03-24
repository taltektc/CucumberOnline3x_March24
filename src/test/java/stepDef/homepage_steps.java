package stepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class homepage_steps extends config {
    @Given("student at TalentTEK Homepage")
    public void studentAtTalentTEKHomepage() {
        driver = new ChromeDriver();
        driver.get("https://qa.taltektc.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Verify page title
        String expectTitle = "Login";
        String actTitle = driver.getTitle();
        Assert.assertEquals(actTitle, expectTitle);

    }

    @And("student clicks on Create New Account button")
    public void studentClicksOnCreateNewAccountButton() {
        driver.findElement (By.xpath("//*[@id='wrap']/div/div/div/a")).click();
    }
}
