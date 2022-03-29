package Tests;

import Adapter.Bases.BaseMobileTest;
import org.pmw.tinylog.Logger;
import org.testng.Assert;
import org.testng.annotations.*;

public class ImdbTests extends BaseMobileTest {

    @Test(priority = 1)
    public void searchMovieTest(){
        Logger.info("*Test: Search a movie and check if the overview info of the movie is correct.");
        loginScreen.skipSignIn();
        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie("Space Jam");
        Assert.assertEquals("In a desperate attempt to win a basketball match and earn their freedom, the Looney Tunes seek the aid of retired basketball champion, Michael Jordan.", movieScreen.getOverview());
    }

    @Test(priority = 2)
    public void checkWatchlist(){
        Logger.info("*Test: Search a movie and add to the watchlist, then check if it exists in the list.");
        loginScreen.clickInSignInWithGoogle();
        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie("Red Notice")
                        .selectFirstMovie();
        movieScreen.addToWatchlist();
        globalNavigationScreen.goToYouOption();
        youScreen.goToSeeAllOption();
        Assert.assertTrue(youScreen.verifyTitle("Red Notice"));
    }

    @Test(priority = 3)
    public void rateAMovie(){
        Logger.info("*Test: Search a movie and give a rate.");
        loginScreen.clickInSignInWithGoogle();
        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie("Encanto")
                .selectFirstMovie();
        movieScreen.scrollToRate();
        rateScreen.rateMovie("10")
                .clickRateButton();
        Assert.assertEquals("Rating saved", rateScreen.getRateConfirmation());
    }
}
