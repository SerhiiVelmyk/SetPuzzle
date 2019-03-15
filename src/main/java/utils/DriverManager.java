package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static final int DELAY = 2;
    private static volatile WebDriver driver = null;
    private static String sep = File.separator;
    private static final String PATH_TO_RESOURCES = System.getProperty("user.dir") + sep + "src" + sep + "main" + sep
            + "resources" + sep;

    private DriverManager() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", PATH_TO_RESOURCES + "chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-inforbars");
            options.addArguments("incognito");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);

            return driver;
        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            getDriver().quit();
            driver = null;
        }
    }
}
