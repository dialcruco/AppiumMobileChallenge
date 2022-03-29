package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;

public class SearchScreen extends BaseMobileScreen {

    public SearchScreen(){
        super();
    }

    private final MobileElement searchInput = new MobileElement(By.Id,"com.imdb.mobile:id/search_src_text", "Search Input");
    private final MobileElement firstMovie = new MobileElement(By.AndroidUiSelector, "new UiSelector().resourceId(\"com.imdb.mobile:id/holder\").index(0)", "First Movie");

    public SearchScreen searchMovie(String movie){
        findMobileElement(searchInput).click()
                .clear()
                .sendKeys(movie);
        return this;

    }

    public void selectFirstMovie(){
        findMobileElement(firstMovie).click();
    }
}
