package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;

public class SignInWithImdbScreen extends BaseMobileScreen {

    private final MobileElement emailTextBox = new MobileElement(By.Id, "com.imdb.mobile:id/", "");
    private final MobileElement passwordTextBox = new MobileElement(By.Id, "com.imdb.mobile:id/", "");
    private final MobileElement signInButton = new MobileElement(By.Id, "com.imdb.mobile:id/", "");

    public SignInWithImdbScreen(){
        super();
    }

}
