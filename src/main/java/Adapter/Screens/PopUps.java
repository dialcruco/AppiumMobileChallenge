package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;
import org.pmw.tinylog.Logger;

public class PopUps extends BaseMobileScreen {

    private final MobileElement denyButton = new MobileElement(By.Id, "com.android.permissioncontroller:id/permission_deny_button", "Deny Button for Location");
    private final MobileElement okButton = new MobileElement(By.Id, "android:id/button2","Ok button for Notifications PopUp");

    public PopUps(){
        super();
    }

    public void denyLocation(){
        Logger.info("Denying the location permission to the app...");
        findMobileElement(denyButton).click();
    }

    public void acceptIMDbNotification(){
        Logger.info("Accepting notifications permission of the app in emulator...");
        findMobileElement(okButton).click();
    }
}

