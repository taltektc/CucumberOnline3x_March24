package stepDef;

import base.config;
import io.cucumber.java.Before;

public class Hook extends config {
    public static String baseURL;
    public static String envType = System.getProperty("env");
    public static String browserType = System.getProperty("browser");

    @Before
    public void beforeEachTest(){
        driver = setupBrowser(browserType);
        switch (envType){
            case "qa":
                baseURL = "https://qa.taltektc.com";
                STUDENT_HARDCODED_EMAIL_ADDRESS = "QaaEnv1@gmail.com";
                break;

            case "stage":
                baseURL = "https://stage.taltektc.com";
                STUDENT_HARDCODED_EMAIL_ADDRESS = "StageEnv1@gmail.com";
                break;

            case "prod":
                baseURL = "https://prod.taltektc.com";
                STUDENT_HARDCODED_EMAIL_ADDRESS = "ProdEnv1@gmail.com";
                break;
        }
        driver.get(baseURL);
    }
}
