package step_definitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Hooks{

    ChromeOptions options = new ChromeOptions();
    public static WebDriver driver;

    @Before
    public void setUp() {
        String chromeDriverPath = "/home/idd_abarreto/Documentos/Drivers/chromedriver";
        options.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        //********* Set next line to run tests in background *********
        //options.addArguments("--headless", "--disable-gpu");

        driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}