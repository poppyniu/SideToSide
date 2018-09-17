package serenity;

import net.thucydides.core.annotations.Step;
import pages.PrivacyPolicyPage;
import pages.UserProtocolPage;

/**
 * Created by poppy.zhang on 2018/9/11.
 */
public class PrivacyPolicySteps {
    PrivacyPolicyPage privacyPolicyPage;

    @Step
    public void get_newest_policy_version() throws Exception {
        privacyPolicyPage.getNewestPolicyVersion();
    }

    @Step
    public void add_new_privacy_policy() throws Exception {
        privacyPolicyPage.addPrivacyPolicy();
    }

    @Step
    public void publish_new_privacy_policy() throws Exception {
        privacyPolicyPage.pulishPrivacyPolicy();
    }

    @Step
    public void search_privacy_policy() throws Exception {
        privacyPolicyPage.searchPrivacyPolicy();
    }

    @Step
    public void view_privacy_policy() throws Exception {
        privacyPolicyPage.viewPrivacyPolicy();
    }

    @Step
    public void edit_new_privacy_policy() throws Exception {
        privacyPolicyPage.editPrivacyPolicy();
    }

}
