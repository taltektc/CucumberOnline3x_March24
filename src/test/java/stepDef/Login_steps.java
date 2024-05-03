package stepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Login_steps extends config {
    @And("student enter their newly created studentId")
    public void studentEnterTheirNewlyCreatedStudentId() {
        // enter student id or email
        driver.findElement(By.name("email")).sendKeys(STUDENT_RANDOM_ID);
    }

    @And("student enter their password during Login")
    public void studentEnterTheirPasswordDuringLogin() {
        // Enter password
        driver.findElement(By.name("password")).sendKeys("123456");
    }

    @When("they click on Login button")
    public void theyClickOnLoginButton() {
        // Click on Login Button
        driver.findElement(By.xpath("//*[@id='login_form']/input")).click();
    }

    @And("student enter their valid email address")
    public void studentEnterTheirValidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys(STUDENT_HARDCODED_EMAIL_ADDRESS);
    }

    @Then("student should be successfully login")
    public void studentShouldBeSuccessfullyLogin() {
        // assertion
        // What developer has been implemented
        String act = driver.findElement(By.xpath("//*[@id='wrap']/div/div/div[1]/h2")).getText();
        // Requirements or design or business
        String exp = "Student Information";
        Assert.assertEquals(exp, act);
    }

    @And("student enter their invalid email address")
    public void studentEnterTheirInvalidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys("thisEmailNeverExist1@gmail.com");
    }

    @Then("student should not able to successfully login")
    public void studentShouldNotAbleToSuccessfullyLogin() {
        // assertion
        // What developer has been implemented
        String act = driver.findElement(By.xpath("//*[@id='error-msg']")).getText();
        // Requirements or design or business
        String exp = "Invalid email address";
        Assert.assertEquals(act, exp);
        //*[@id="error-msg"]
    }

    @Then("student should be successfully login but failing on purpose")
    public void studentShouldBeSuccessfullyLoginButFailingOnPurpose() {
        // What developer has been implemented
        String act = driver.findElement(By.xpath("//*[@id='wrap']/div/div/div[1]/h2")).getText();
        // Requirements or design or business
        String exp = "Student Information - Fail";
        Assert.assertEquals(act, exp);
    }
}
