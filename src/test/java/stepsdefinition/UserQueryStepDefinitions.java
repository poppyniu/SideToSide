package stepsdefinition;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import serenity.UserQuerySteps;

/**
 * Created by xiaowei.zhang on 2018/9/18.
 */
public class UserQueryStepDefinitions {
    @Steps
    UserQuerySteps userQuerySteps;

    @And("^Get current newest user control version$")
        public void get_current_newest_user_control_version() throws Exception{
        userQuerySteps.get_newest_control_version();
        }

    @And("^User Query$")
    public void user_query() throws Exception{
        userQuerySteps.user_query();
    }
}
