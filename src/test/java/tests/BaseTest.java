package tests;

import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;

import static utils.DriverManager.closeDriver;
import static utils.DriverManager.getDriver;

class BaseTest {
    static WebDriver driver = getDriver();

    @AfterAll
    static void tearDown() {
        closeDriver();
    }
}
