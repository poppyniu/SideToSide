package stepsdefinition;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import serenity.AppVersionManagementSteps;
import serenity.ConfigManagementSteps;


public class ConfigManagementStepDefinitions {
    @Steps
    ConfigManagementSteps configManagementSteps ;

    @And("^Set xiao neng working time$")
    public void set_xiao_neng_working_time() throws Throwable {
        configManagementSteps.set_xiaoneng();
    }


}