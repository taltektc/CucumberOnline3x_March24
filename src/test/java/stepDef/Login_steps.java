package stepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

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
}
