package Adapter.Bases;

import Adapter.Screens.*;
import Core.ConfigCapabilities;
import Core.MobileAppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.*;

public class BaseMobileTest {

    private AndroidDriver<AndroidElement> driver;
    public LoginScreen loginScreen;
    public GlobalNavigationScreen globalNavigationScreen;
    public SearchScreen searchScreen;
    public MovieScreen movieScreen;
    public PopUps popUps;
    public YouScreen youScreen;
    public RateScreen rateScreen;

    @BeforeSuite(alwaysRun = true)
    public void setUp(){
        driver = MobileAppDriver.getMovieAppDriver(ConfigCapabilities.getCapabilities());
        loginScreen = new LoginScreen();
        globalNavigationScreen = new  GlobalNavigationScreen();
        searchScreen = new SearchScreen();
        movieScreen = new MovieScreen();
        popUps = new PopUps();
        youScreen = new YouScreen();
        rateScreen = new RateScreen();
        popUps.denyLocation();
        popUps.acceptIMDbNotification();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown(){
        if(driver != null)
            driver.quit();
    }
}
