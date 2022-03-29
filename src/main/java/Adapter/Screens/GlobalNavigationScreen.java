package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;
import org.pmw.tinylog.Logger;

public class GlobalNavigationScreen extends BaseMobileScreen {

    private final MobileElement homeIcon = new MobileElement(By.Id, "com.imdb.mobile:id/navigation_home", "Home Button");
    private final MobileElement searchIcon = new MobileElement(By.Id, "com.imdb.mobile:id/navigation_search_browse", "Search Button");
    private final MobileElement videoIcon = new MobileElement(By.Id, "com.imdb.mobile:id/navigation_video", "Video Button");
    private final MobileElement youIcon = new MobileElement(By.Id, "com.imdb.mobile:id/navigation_you", "You Button");

    public GlobalNavigationScreen(){
        super();
    }

    public void goToHomeOption(){
        Logger.info("Going to Home Option...");
        findMobileElement(homeIcon).click();
    }

    public void goToSearchOption(){
        Logger.info("Going to Search Option...");
        findMobileElement(searchIcon).click();
    }

    public void goToVideoOption(){
        Logger.info("Going to Video Option...");
        findMobileElement(videoIcon).click();
    }

    public void goToYouOption(){
        Logger.info("Going to You Option...");
        findMobileElement(youIcon).click();
    }

}
