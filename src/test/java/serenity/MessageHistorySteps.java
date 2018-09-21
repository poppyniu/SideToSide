package serenity;

import net.thucydides.core.annotations.Step;
import pages.MessageHistoryPage;

/**
 * Created by xiaowei.zhang on 2018/9/18.
 */
public class MessageHistorySteps {
    MessageHistoryPage messageHistoryPage;

    @Step
    public void get_newest_message_history_version() throws Exception{
        messageHistoryPage.getNewestMessageHistoryVersion();
    }
    @Step
    public void message_history() throws Exception{
        messageHistoryPage.MessageHistory();
    }
}
