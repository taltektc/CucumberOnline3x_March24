package stepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;


public class homepage_steps extends config {
    @Given("student at TalentTEK Homepage")
    public void studentAtTalentTEKHomepage() {
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
