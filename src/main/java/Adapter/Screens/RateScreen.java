package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;
import org.pmw.tinylog.Logger;

public class RateScreen extends BaseMobileScreen {

    private final String rate10Button = "com.imdb.mobile:id/star_%s";
    private final MobileElement rateButton = new MobileElement(By.Id,"com.imdb.mobile:id/rate_title_button","Rate button");
    private final MobileElement rateSavedMessage = new MobileElement(By.Id, "com.imdb.mobile:id/title","Message: Rate saved.");

    public RateScreen() {
        super();
    }

    public RateScreen rateMovie(String rateGiven){
        Logger.info("Rating the movie with the rate given by parameter...");
        MobileElement rateGivenToMovie = new MobileElement(By.Id,String.format(rate10Button,rateGiven),"Rate given to a selected movie.");
        findMobileElement(rateGivenToMovie).click();
        return this;
    }
    public RateScreen clickRateButton(){
        Logger.info("Clicking th rate button to upload the rate given to the movie...");
        findMobileElement(rateButton).click();
        return this;
    }
    public String getRateConfirmation(){
        Logger.info("Getting the rating confirmation...");
        return findMobileElement(rateSavedMessage).getText();

    }
}
