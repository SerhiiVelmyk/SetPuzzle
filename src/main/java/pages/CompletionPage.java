package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletionPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'minutes-and-seconds')]")
    private WebElement completionTime;

    public CompletionPage(WebDriver driver) {
        super(driver);
    }

    public String getCompletionTimeValue() {
        return completionTime.getText();
    }
}
