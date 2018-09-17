package stepsdefinition;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import serenity.PrivacyPolicySteps;
import serenity.UserProtocolSteps;

/**
 * Created by poppy.zhang on 2018/9/11.
 */
public class PrivacyPolicyStepDefinitions {
    @Steps
    PrivacyPolicySteps privacyPolicySteps;

    @And("^Get current newest privacy policy version$")
    public void get_current_newest_privacy_policy_version() throws Throwable {
        privacyPolicySteps.get_newest_policy_version();
    }

    @And("^Add a new privacy policy and verify result$")
    public void add_a_new_privacy_policy_and_verify_result() throws Throwable {
        privacyPolicySteps.add_new_privacy_policy();
    }

    @And("^Publish the new privacy policy and verify publish result$")
    public void publish_the_new_privacy_policy_and_verify_publish_result() throws Throwable {
        privacyPolicySteps.publish_new_privacy_policy();
    }

    @And("^Search privacy policy and check search result$")
    public void search_privacy_policy_and_check_search_result() throws Throwable {
        privacyPolicySteps.search_privacy_policy();
    }

    @And("^View detailed info for a privacy policy$")
    public void view_detailed_info_for_a_privacy_policy() throws Throwable {
        privacyPolicySteps.view_privacy_policy();
    }

    @And("^Edit a new privacy policy and verify result$")
    public void edit_a_new_privacy_policy_and_verify_result() throws Throwable {
        privacyPolicySteps.edit_new_privacy_policy();
    }

}
