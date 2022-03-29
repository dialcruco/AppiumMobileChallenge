package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;

public class RateScreen extends BaseMobileScreen {

    private final MobileElement rate10Button = new MobileElement(By.Id,"com.imdb.mobile:id/star_10", "Rate 10 button.");
    private final MobileElement rateButton = new MobileElement(By.Id,"com.imdb.mobile:id/rate_title_button","Rate button");
    private final MobileElement rateSavedMessage = new MobileElement(By.Id, "com.imdb.mobile:id/title","Message: Rate saved.");

    public RateScreen() {
        super();
    }

    public RateScreen rateMovie(){
        findMobileElement(rate10Button).click();
        return this;
    }
    public RateScreen clickRateButton(){
        findMobileElement(rateButton).click();
        return this;
    }
    public String getRateConfirmation(){
        return findMobileElement(rateSavedMessage).getText();

    }
}
