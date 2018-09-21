package serenity;

import net.thucydides.core.annotations.Step;
import pages.UserQueryPage;

/**
 * Created by xiaowei.zhang on 2018/9/18.
 */
public class UserQuerySteps {
    UserQueryPage userQueryPage;

    @Step
    public void get_newest_control_version() throws Exception{
        userQueryPage.getNewestControlQueryVersion();
    }
    @Step
    public void user_query() throws Exception{
        userQueryPage.userQuery();
    }
}
