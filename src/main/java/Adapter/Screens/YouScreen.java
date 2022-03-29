package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;

public class YouScreen extends BaseMobileScreen {

    private final MobileElement seeAllMoviesOption =  new MobileElement(By.Id,"com.imdb.mobile:id/see_all", "See all option.");
    private String element = "new UiSelector().resourceId(\"com.imdb.mobile:id/primaryText\").text(\"%s\")";

    public YouScreen(){super();}

    public void goToSeeAllOption(){
        findMobileElement(seeAllMoviesOption).click();
    }

    public boolean verifyTitle(String movie){
        MobileElement firstMovieOfList = new MobileElement(By.AndroidUiSelector,String.format(element,movie),"First movie of list.");
        return exist(firstMovieOfList);
    }

}
