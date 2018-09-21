package stepsdefinition;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import serenity.MessageHistorySteps;

/**
 * Created by xiaowei.zhang on 2018/9/18.
 */
public class MessageHistoryStepDefinitions {
    @Steps
    MessageHistorySteps messageHistorySteps;

    @And("^Get current newest message history version$")
    public void get_newest_message_history_version() throws Exception{
        messageHistorySteps.get_newest_message_history_version();
    }
    @And("^Get message history$")
    public void message_history() throws Exception{
        messageHistorySteps.message_history();
    }
}
