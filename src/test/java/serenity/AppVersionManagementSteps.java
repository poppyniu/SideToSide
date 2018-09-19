package serenity;

import net.thucydides.core.annotations.Step;
import pages.AppVersionManagementPage;
import pages.LoginPage;


/**
 * Created by Poppy_Zhang on 2017/6/21.
 */
public class AppVersionManagementSteps {
    AppVersionManagementPage appVersionManagementPage;


    @Step
    public void getVersionForPlatform(String platform) throws Exception {
        appVersionManagementPage.getVersionForPlatform(platform);
    }

    @Step
    public void addAppVersion() throws Exception {
        appVersionManagementPage.addAppVersion();
    }

    @Step
    public void addInstallFileAndPublish() throws Exception {
        appVersionManagementPage.addInstallFileAndPublish();
    }



}
