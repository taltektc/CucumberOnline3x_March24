package stepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class signup_steps extends config {
    @And("student enter their first name")
    public void studentEnterTheirFirstName() {
        driver.findElement(By.name("firstName")).sendKeys("Salman");
    }

    @And("student enter their last name")
    public void studentEnterTheirLastName() {
        driver.findElement(By.name("lastName")).sendKeys("Khan");
    }

    @And("student enter their email")
    public void studentEnterTheirEmail() {
        driver.findElement(By.name("email")).sendKeys("salman.khan6@gmail.com");
    }

    @And("student enter their password")
    public void studentEnterTheirPassword() {
        driver.findElement(By.name("password")).sendKeys("123456");
    }

    @And("student confirm their password")
    public void studentConfirmTheirPassword() {
        driver.findElement(By.name("confirmPassword")).sendKeys("123456");
    }

    @And("student enter their dob such month, date and year")
    public void studentEnterTheirDobSuchMonthDateAndYear() {
        // Month
        Select m = new Select (driver.findElement(By.name("month")));
        m.selectByVisibleText("Sep");
        // Day
        Select d = new Select (driver.findElement(By.name("day")));
        d.selectByVisibleText("19");
        // Year
        Select y = new Select (driver.findElement(By.name("year")));
        y.selectByVisibleText("1997");
    }

    @And("student enter their gender as male")
    public void studentEnterTheirGenderAsMale() {
        driver.findElement(By.xpath("//*[@id='signup-form']/label[3]")).click();
    }

    @And("student agrees with terms and conditions")
    public void studentAgreesWithTermsAndConditions() {
        driver.findElement(By.xpath("//*[@id='defaultCheck1']")).click();

    }

    @When("student click on Create My Account button")
    public void studentClickOnCreateMyAccountButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='signup-form']/button")).click();
        Thread.sleep(2000);
    }

    @Then("student should be able to get an student Id")
    public void studentShouldBeAbleToGetAnStudentId() {
        String expected = "Success!";
        String actualValue = driver.findElement(By.xpath("//div[@class='swal-title']")).getText();
        Assert.assertEquals(actualValue, expected);

        String fullTextOfStudentId = driver.findElement(By.xpath("//div[@class='swal-text']")).getText();
        System.out.println("FULL TEXT is === " + fullTextOfStudentId);

        String getMeOnlyStudentId = fullTextOfStudentId.substring(fullTextOfStudentId.indexOf(":") + 2);
        System.out.println("Student Random Id is === " + getMeOnlyStudentId);
    }

    @And("student enter their invalid email")
    public void studentEnterTheirInvalidEmail() {

    }

    @Then("student should get an error message about email is being incorrect")
    public void studentShouldGetAnErrorMessageAboutEmailIsBeingIncorrect() {
    }
}
