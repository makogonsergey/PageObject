package pagefactory.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends BasePage {

    @FindBy(xpath = "//*[@class='gs-c-promo-heading__title gel-canon-bold nw-o-link-split__text']")
    private WebElement linkNews;

    @FindBy(xpath = "//li[@class='nw-c-related-story nw-c-related-story--1 gel-1/2@s gel-1/1@l gel-1/3@m gs-u-float-left@s gs-u-float-none@l']//span[@class='nw-o-bullet__text']")
    private WebElement secondaryArticle1;

    @FindBy(xpath = "//span[@class='nw-o-link-split__text gs-u-align-bottom'][normalize-space()='The activist entrepreneurs running zero-waste shops']")
    private WebElement secondaryArticle2;

    @FindBy(xpath = "//span[normalize-space()='Science & Environment']")
    private WebElement categoryName;

    @FindBy(xpath = "//input[@id='orb-search-q']")
    private WebElement searchField;

    @FindBy(xpath = "//input[@id='orb-search-q']")
    private WebElement searchFistArticle;

    public NewsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLinkNews() {
        return linkNews;
    }

    public String getLinkNewsText() {
        return linkNews.getText();
    }

    public String getSecondaryArticle1Text() {
        return secondaryArticle1.getText();
    }

    public String getSecondaryArticle2Text() {
        return secondaryArticle2.getText();
    }

    public WebElement getCategoryName() {
        return categoryName;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchFistArticle() {
        return searchFistArticle;
    }




}
