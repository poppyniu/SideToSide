package stepsdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.AppVersionManagementSteps;
import serenity.LoginSteps;


public class AppVersionManagementStepDefinitions {
    @Steps
    AppVersionManagementSteps appVersionManagementSteps ;

    @And("^Get current newest app version for (.*)")
    public void get_current_newest_app_version_for_android(String platform) throws Throwable {
        appVersionManagementSteps.getVersionForPlatform(platform);
    }

    @And("^Add a new app version and verify result$")
    public void add_a_new_app_version_and_verify_result() throws Throwable {
        appVersionManagementSteps.addAppVersion();
    }

    @And("^Add install file set remind upgrade to yes and publish to mobile side$")
    public void add_install_file_set_remind_upgrade_to_yes_and_publish_to_mobile_side() throws Throwable {
        appVersionManagementSteps.addInstallFileAndPublish();
    }

    @And("^Go back to website to set remind upgrade to no$")
    public void set_remind_upgrade_to_no() throws Throwable {
        appVersionManagementSteps.setUpgradeToNo();
    }



}