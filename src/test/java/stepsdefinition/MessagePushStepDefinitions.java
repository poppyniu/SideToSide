package stepsdefinition;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import serenity.MessagePushSteps;

/**
 * Created by xiaowei.zhang on 2018/9/18.
 */
public class MessagePushStepDefinitions {
    @Steps
    MessagePushSteps messagePushSteps;

    @And("^Get current newest message push version$")
    public void get_newest_message_push_version() throws Exception{
        messagePushSteps.get_newest_message_push_version();
    }
    @And("^Add Message Push$")
    public void add_message_push() throws Exception{
        messagePushSteps.add_message_push();
    }
}
