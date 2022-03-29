package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;

public class GlobalNavigationScreen extends BaseMobileScreen {

    private final MobileElement homeIcon = new MobileElement(By.Id, "com.imdb.mobile:id/navigation_home", "Home Button");
    private final MobileElement searchIcon = new MobileElement(By.Id, "com.imdb.mobile:id/navigation_search_browse", "Search Button");
    private final MobileElement videoIcon = new MobileElement(By.Id, "com.imdb.mobile:id/navigation_video", "Video Button");
    private final MobileElement youIcon = new MobileElement(By.Id, "com.imdb.mobile:id/navigation_you", "You Button");

    public GlobalNavigationScreen(){
        super();
    }

    public void goToHomeOption(){
        findMobileElement(homeIcon).click();
    }

    public void goToSearchOption(){
        findMobileElement(searchIcon).click();
    }

    public void goToVideoOption(){
        findMobileElement(videoIcon).click();
    }

    public void goToYouOption(){
        findMobileElement(youIcon).click();
    }

}
