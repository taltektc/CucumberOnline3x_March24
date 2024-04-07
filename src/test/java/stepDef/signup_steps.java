package stepDef;

import base.config;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class signup_steps extends config {
    Faker faker = new Faker();
    @And("student enter their first name")
    public void studentEnterTheirFirstName() {
        String randomFirstName = faker.name().firstName();
        driver.findElement(By.name("firstName")).sendKeys(randomFirstName);
    }

    @And("student enter their last name")
    public void studentEnterTheirLastName() {
        String randomLastName = faker.name().lastName(); // Barton
        driver.findElement(By.name("lastName")).sendKeys(randomLastName);
    }

    @And("student enter their email")
    public void studentEnterTheirEmail() {
        String randomEmail = faker.internet().emailAddress();
        driver.findElement(By.name("email")).sendKeys(randomEmail);
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

    @And("student enter their month as {string}, day as {string} and year as {string}")
    public void studentEnterTheirMonthAsDayAsAndYearAs(String month, String day, String year) {
        // Month
        Select m = new Select (driver.findElement(By.name("month")));
        m.selectByVisibleText(month);
        // Day
        Select d = new Select (driver.findElement(By.name("day")));
        d.selectByVisibleText(day);
        // Year
        Select y = new Select (driver.findElement(By.name("year")));
        y.selectByVisibleText(year);
    }

    @And("student validate if they can select different months as {string}")
    public void studentValidateIfTheyCanSelectDifferentMonthsAs(String month) {
        // Month
        Select m = new Select (driver.findElement(By.name("month")));
        m.selectByVisibleText(month);
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
        // Your student id is: TTC0022222

        STUDENT_RANDOM_ID = fullTextOfStudentId.substring(fullTextOfStudentId.indexOf(":") + 2);
        System.out.println("ONLY PRINT ==> Student Random Id  ===> " + STUDENT_RANDOM_ID);
        // TTC0022222

        // click on OK button from the popup
        driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
    }

    @And("student enter their invalid email")
    public void studentEnterTheirInvalidEmail() {
        driver.findElement(By.name("email")).sendKeys("fakeemail@g.");

    }

    @Then("student should get an error message about email is being incorrect")
    public void studentShouldGetAnErrorMessageAboutEmailIsBeingIncorrect() {
        String expected = "Please enter a valid email address!";
        String actual = driver.findElement(By.xpath("//*[@id='email-error']")).getText();
        Assert.assertEquals(actual, expected);
    }

}
