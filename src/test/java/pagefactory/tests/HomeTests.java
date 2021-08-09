package pagefactory.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomeTests extends BaseTest {

    private String NEWS_TEXT = "Climate report is 'code red for humanity'";

    private List<String> SecondaryArticleTitles = Arrays.asList("Time nearly up to stop climate catastrophe - Sharma",
            "The activist entrepreneurs running zero-waste shops");

    private String categoryText;



    @Test(priority = 1)
    public void checkTheNameOfHeadlineArticle() {

        getHomePage().clickOnLinkNews();
        getNewsPage().waitForPageLoadComplete(5);

        assertEquals(getNewsPage().getLinkNewsText(), NEWS_TEXT);
    }

    @Test(priority = 2)
    public void checkSecondaryArticleTitles() throws InterruptedException {

        getHomePage().clickOnLinkNews();
        getNewsPage().waitForPageLoadComplete(5);

        assertEquals(getNewsPage().getSecondaryArticle1Text(), SecondaryArticleTitles.get(0));
        assertEquals(getNewsPage().getSecondaryArticle2Text(), SecondaryArticleTitles.get(1));
    }

    @Test(priority = 3)
    public void checkSearchCategory() throws InterruptedException {

        getHomePage().clickOnLinkNews();
        getNewsPage().waitForPageLoadComplete(5);
        categoryText = getNewsPage().getCategoryName().getText();
        getNewsPage().getSearchField().click();
        getNewsPage().getSearchField().clear();
        getNewsPage().getSearchField().sendKeys(categoryText, Keys.ENTER);
        getNewsPage().waitForPageLoadComplete(5);
        assertEquals(getNewsPage().getSearchFistArticle().getText(), NEWS_TEXT);

    }

}
