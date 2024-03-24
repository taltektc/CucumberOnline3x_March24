import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class prectice {
    public static void main(String[] args){

        // Email address must be unique
        // run in multiple browser like chrome and firefox
        // Test Env such as QA, Stage and Prod

        System.out.println("Hello, World!");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qa.taltektc.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.linkText("Create New Account")).click();
        driver.findElement(By.name("firstName")).sendKeys("testing");
        driver.findElement(By.name("lastName")).sendKeys("katalon");
        driver.findElement(By.name("email")).sendKeys("testing.katalon1@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456789");
        driver.findElement(By.name("confirmPassword")).sendKeys("123456789");
        new Select(driver.findElement(By.name("month"))).selectByVisibleText("Mar");
        new Select(driver.findElement(By.name("day"))).selectByVisibleText("5");
        new Select(driver.findElement(By.name("year"))).selectByVisibleText("1988");
        driver.findElement(By.xpath("//form[@id='signup-form']/label[3]")).click();
        driver.findElement(By.id("defaultCheck1")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
