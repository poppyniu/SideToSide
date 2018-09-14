package stepsdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.MobileSteps;

/**
 * Created by poppy zhang on 2018/8/13.
 */
public class MobileStepDefinitions {
    @Steps
    MobileSteps mobileSteps=new MobileSteps();


    @And("^Login to (.*) mobile to verify protocol is effective$")
    public void login_to_android_mobile_to_verify_protocol_is_effective(String platform) throws Throwable {
        mobileSteps.verify_protocol_on_mobile(platform);
    }

}