package Tests;

import Adapter.Bases.BaseMobileTest;
import org.testng.Assert;
import org.testng.annotations.*;

public class ImdbTests extends BaseMobileTest {

    @Test(priority = 1)
    public void searchMovieTest(){
        loginScreen.skipSignIn();
        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie("Space Jam");
        Assert.assertEquals("In a desperate attempt to win a basketball match and earn their freedom, the Looney Tunes seek the aid of retired basketball champion, Michael Jordan.", movieScreen.getOverview());
    }

    @Test(priority = 2)
    public void checkWatchlist(){
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
        loginScreen.clickInSignInWithGoogle();
        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie("Encanto")
                .selectFirstMovie();
        movieScreen.scrollToRate();
        rateScreen.rateMovie()
                .clickRateButton();
        Assert.assertEquals("Rating saved", rateScreen.getRateConfirmation());
    }
}
