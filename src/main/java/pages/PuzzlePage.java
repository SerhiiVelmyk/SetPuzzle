package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utils.DriverManager.getDriver;

public class PuzzlePage extends BasePage {

    @FindBy(xpath = "//img[contains(@name,'card')]")
    private List<WebElement> cardList;

    @FindBy(xpath = "//div[@class='set-messages' and @style='display: block;']")
    private WebElement setMessage;

    @FindBy(xpath = "//div[@class='set-messages' and (@style='display: none;' or not(@style))]/..")
    private WebElement disappearedSetMessage;

    @FindBy(xpath = "//button[contains(@class, 'cookie') and text()='OK, I agree']")
    private WebElement agreeCookieUsage;

    public PuzzlePage(WebDriver driver) {
        super(driver);
    }

    public void openPuzzlePage() {
        driver.get("https://www.setgame.com/set/puzzle");
    }

    private List<WebElement> getCardList() {
        return cardList;
    }

    public String getSetMessageText() {
        return setMessage.getText();
    }

    public List<Integer> getListOfImageIdsFromUI() {
        List<Integer> list = new ArrayList<>();

        for (WebElement element : getCardList()) {
            String link = element.getAttribute("src");
            String idPng = link.split("/")[link.split("/").length - 1];
            String id = idPng.split("\\.")[0];

            list.add(Integer.parseInt(id));
        }

        return list;
    }

    public void inputSetCombination(int[] array) {
        String card = "//img[contains(@name,'card') and contains(@src, '/%s.png')]";
        waitForElement(disappearedSetMessage);
        Arrays.stream(array).forEach(pngId -> {
            WebElement element = getDriver().findElement(By.xpath(String.format(card, pngId)));
            waitForElement(element);
            element.click();
            waitForAttributeContains(element, "class", "set-active");
        });
    }

    public void acceptCookies() {
        agreeCookieUsage.click();
    }
}
