package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginScreen extends BaseMobileScreen {

    private final MobileElement notNowButton = new MobileElement(By.Id, "com.imdb.mobile:id/splash_not_now", "Not now Button");
    private final MobileElement signInWithFacebookButton = new MobileElement(By.Id, "com.imdb.mobile:id/facebook_oauth", "Sign in with Facebook");
    private final MobileElement signInWithGoogleButton = new MobileElement(By.Id, "com.imdb.mobile:id/google_oauth", "Sign in with Google");
    private final MobileElement signInWithImdbButton = new MobileElement(By.Id, "com.imdb.mobile:id/imdb_auth_portal", "Sign in with IMDb");
    private final MobileElement trailerItem = new MobileElement(By.Id,"com.imdb.mobile:id/trailer_item","Trailer Item");

    public LoginScreen(){
        super();
    }

    public void skipSignIn(){
        findMobileElement(notNowButton).click();
    }

    public void clickInSignInWithImdbButton(){
        findMobileElement(signInWithImdbButton).click();
    }

    public void clickInSignInWithGoogle(){
        findMobileElement(signInWithGoogleButton).click();
        findMobileElement(trailerItem);
    }


}
