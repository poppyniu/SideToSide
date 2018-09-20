package stepsdefinition;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import serenity.AdvertisementManagementSteps;
import serenity.BootLogoSteps;


public class BootLogoStepDefinitions {
    @Steps
    BootLogoSteps bootLogoSteps ;

    @And("^Add a new boot logo and enable it$")
    public void add_a_new_boot_logo_and_enable_it() throws Throwable {
        bootLogoSteps.add_bootlogo();
    }

    @And("^Go back to website to disable boot logo$")
    public void go_back_to_website_to_disable_boot_logo() throws Throwable {
        bootLogoSteps.disable_bootlogo();
    }


}