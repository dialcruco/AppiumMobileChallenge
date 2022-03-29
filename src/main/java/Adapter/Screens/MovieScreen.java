package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;
import io.appium.java_client.MobileBy;
import org.pmw.tinylog.Logger;

public class MovieScreen extends BaseMobileScreen {

    private final MobileElement movieOverview = new MobileElement(By.Id,"com.imdb.mobile:id/plot_overview", "Movie Overview");
    private final MobileElement addToWatchlistButton = new MobileElement(By.Id,"com.imdb.mobile:id/state_off","Add to Watchlist");
    private String scrollableElement = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Your Rating\"))";

    public MovieScreen(){
        super();
    }

    public String getOverview(){
        Logger.info("Getting the overview information of the movie selected...");
        return findMobileElement(movieOverview).getText();
    }

    public void addToWatchlist(){
        Logger.info("Adding the movie selected to the Watchlist...");
        findMobileElement(addToWatchlistButton).click();
    }

    public void scrollToRate(){
        Logger.info("Scrolling the page until rate section...");
        MobileElement yourRatingSection = new MobileElement(By.AndroidUiSelector,scrollableElement,"Scrollable until Your Rating section");
        findMobileElement(yourRatingSection).click();

    }
}
