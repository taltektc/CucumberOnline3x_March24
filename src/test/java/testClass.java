import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class testClass {
    public static void main(String[] args){

        System.out.println("Hello, World!");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://qa.taltektc.com/");
        driver.findElement(By.linkText("Create New Account")).click();
        driver.findElement(By.name("firstName")).click();
        driver.findElement(By.name("firstName")).clear();
        driver.findElement(By.name("firstName")).sendKeys("testing");
        driver.findElement(By.name("lastName")).clear();
        driver.findElement(By.name("lastName")).sendKeys("katalon");
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("testing.katalon1@gmail.com");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("123456789");
        driver.findElement(By.name("confirmPassword")).clear();
        driver.findElement(By.name("confirmPassword")).sendKeys("123456789");
        driver.findElement(By.name("month")).click();
        new Select(driver.findElement(By.name("month"))).selectByVisibleText("Mar");
        driver.findElement(By.name("day")).click();
        new Select(driver.findElement(By.name("day"))).selectByVisibleText("5");
        driver.findElement(By.name("year")).click();
        new Select(driver.findElement(By.name("year"))).selectByVisibleText("1988");
        driver.findElement(By.xpath("//form[@id='signup-form']/label[3]")).click();
        driver.findElement(By.id("defaultCheck1")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
