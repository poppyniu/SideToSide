package stepsdefinition;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import serenity.AdvertisementManagementSteps;
import serenity.AppVersionManagementSteps;


public class AdvertisementManagementStepDefinitions {
    @Steps
    AdvertisementManagementSteps adManagementSteps ;

    @And("^Add a new advertisement and enable it$")
    public void add_a_new_advertisement_and_enable_it() throws Throwable {
        adManagementSteps.add_advertisement();
    }

    @And("^Go back to website to disable advertisement$")
    public void disable_advertisement() throws Throwable {
        adManagementSteps.disable_advertisement();
    }

}