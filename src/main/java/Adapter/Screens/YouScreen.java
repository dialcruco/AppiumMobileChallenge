package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;
import org.pmw.tinylog.Logger;

public class YouScreen extends BaseMobileScreen {

    private final MobileElement seeAllMoviesOption =  new MobileElement(By.Id,"com.imdb.mobile:id/see_all", "See all option.");
    private String movieName = "new UiSelector().resourceId(\"com.imdb.mobile:id/primaryText\").text(\"%s\")";

    public YouScreen(){super();}

    public void goToSeeAllOption(){
        Logger.info("Going to the full Watchlist...");
        findMobileElement(seeAllMoviesOption).click();
    }

    public boolean verifyTitle(String movie){
        Logger.info("Verifying if the movie exists in the list...");
        MobileElement firstMovieOfList = new MobileElement(By.AndroidUiSelector,String.format(movieName,movie),"First movie of list.");
        return exist(firstMovieOfList);
    }

}
