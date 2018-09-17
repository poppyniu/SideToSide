package stepsdefinition;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import serenity.LoginSteps;
import serenity.UserProtocolSteps;

/**
 * Created by poppy.zhang on 2018/9/11.
 */
public class UserProtocolStepDefinitions {
    @Steps
    UserProtocolSteps userProtocolSteps;

    @And("^Get current newest user protocol version$")
    public void get_current_newest_user_protocol_version() throws Exception {
        userProtocolSteps.get_newest_protocol_version();
    }

    @And("^Add a new user protocol and verify result$")
    public void add_a_new_user_protocol() throws Exception {
        userProtocolSteps.add_new_user_protocol();
    }

    @And("^Publish the new protocol and verify publish result$")
    public void publish_the_new_added_user_protocol() throws Throwable {
        userProtocolSteps.publish_new_user_protocol();
    }

    @And("^Search user protocol and check search result$")
    public void search_user_protocol_and_check_result() throws Throwable {
        userProtocolSteps.search_user_protocol();
    }

    @And("^View detailed info for a protocol$")
    public void view_protocol() throws Throwable {
        userProtocolSteps.view_protocol();
    }

    @And("^Eit a new user protocol and verify result$")
    public void edit_protocol() throws Throwable {
        userProtocolSteps.edit_protocol();
    }





}
