package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.DriverManager.getDriver;

class BasePage {
    WebDriver driver;
    private static final int DELAY = 5;
    private WebDriverWait wait = new WebDriverWait(getDriver(), DELAY);

    BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    void waitForElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    void waitForAttributeContains(WebElement element, String attribute, String value) {
        wait.until(ExpectedConditions.attributeContains(element, attribute, value));
    }
}
