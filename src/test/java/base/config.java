package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class config {
    public static WebDriver driver;
    public static String STUDENT_RANDOM_ID;
    public static String STUDENT_HARDCODED_EMAIL_ADDRESS;

    public static WebDriver setupBrowser (String browserType){
        if (browserType.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("ff")) {
            driver = new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
        } else {
            System.out.println("Invalid browser type specified!");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

}

// How to do cross-browser testing, run test in chrome, ff ect
// How to do cross env testing such as qa/stage/prod
// If test fail because of the bug or any reason, how to capture the log and screenshots
        //  and attach the logs/screenshot within the report
// How to generate JVM report
// How to run the test suite in CI/CD (GitHub and Jenkins)