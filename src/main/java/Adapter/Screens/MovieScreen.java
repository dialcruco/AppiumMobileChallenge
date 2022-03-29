package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;
import io.appium.java_client.MobileBy;

public class MovieScreen extends BaseMobileScreen {

    private final MobileElement movieOverview = new MobileElement(By.Id,"com.imdb.mobile:id/plot_overview", "Movie Overview");
    private final MobileElement addToWatchlistButton = new MobileElement(By.Id,"com.imdb.mobile:id/state_off","Add to Watchlist");
    private String scrollableElement = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Your Rating\"))";

    //MobileBy.AndroidUIAutomator(“new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(“textValue”))”)

    public MovieScreen(){
        super();
    }

    public String getOverview(){
        return findMobileElement(movieOverview).getText();
    }

    public void addToWatchlist(){
        findMobileElement(addToWatchlistButton).click();
    }

    public void scrollToRate(){
        MobileElement yourRatingSection = new MobileElement(By.AndroidUiSelector,scrollableElement,"Scrollable until Your Rating section");
        findMobileElement(yourRatingSection).click();

    }
}
