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


    @And("^Input (.*) and (.*) and click login button in (.*)$")
    public void different_country_login_to_mobile(String name,String password,String country) throws Throwable {
        mobileSteps.different_country_login_to_mobile(name,password,country);
    }

    @And("^Login to (.*) mobile to verify protocol is effective$")
    public void login_to_android_mobile_to_verify_protocol_is_effective(String platform) throws Throwable {
        mobileSteps.verify_protocol_on_mobile(platform);
    }

    @And("^Login to (.*) mobile to verify privacy policy is effective$")
    public void login_to_android_mobile_to_privacy_policy_is_effective(String platform) throws Throwable {
        mobileSteps.verify_policy_on_mobile(platform);
    }

    @And("^Login to (.*) mobile to verify app version is effective$")
    public void login_to_android_mobile_to_verify_app_version_is_effective(String platform) throws Throwable {
        mobileSteps.verify_app_on_mobile(platform);
    }

    @And("^Choose (.*) as login country on (.*)$")
    public void choose_america_as_login_country(String country,String platform) throws Throwable {
        mobileSteps.chooseCountry(country,platform);
    }

    @And("^Login to (.*) mobile to verify xiao neng working time is effective$")
    public void login_to_android_mobile_to_verify_xiao_neng_working_time_is_effective(String platform) throws Throwable {
        mobileSteps.verifyXiaoneng(platform);
    }
    //verifyaddmessagepush
    @And("^Login to (.*) mobile to verify add message push$")
    public void verifyaddmessagepush(String platform) throws Throwable {
        mobileSteps.verifyaddmessagepush(platform);
    }

    @And("^Login to (.*) mobile to verify advertisement is effective$")
    public void login_to_android_mobile_to_verify_advertisement_is_effective(String platform) throws Throwable {
        mobileSteps.verifyAdvertisement(platform);
    }

    @And("^Login to (.*) mobile to verify boot logo is effective$")
    public void login_to_android_mobile_to_verify_boot_logo_is_effective(String platform) throws Throwable {
        mobileSteps.verifyBootLogo(platform);
    }

    @And("^Login to (.*) mobile to verify custom service is effective$")
    public void login_to_android_mobile_to_verify_custom_service_is_effective(String platform) throws Throwable {
        mobileSteps.verifyCustomService(platform);
    }
}