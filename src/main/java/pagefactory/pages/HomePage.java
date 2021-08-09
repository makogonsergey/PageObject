package pagefactory.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@id='orb-nav-links']//a[normalize-space()='News']")
    private WebElement linkNews;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLinkNews() {
        linkNews.click();
    }



    /*

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public WebElement searchResultMessage() {
        return searchResultMessage;
    }

    public String getTextOfSearchResultMessage() {
        return searchResultMessage.getText();
    }

    */

}
