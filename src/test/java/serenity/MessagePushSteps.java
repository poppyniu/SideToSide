package serenity;

import net.thucydides.core.annotations.Step;

import pages.MessagePushPage;

/**
 * Created by xiaowei.zhang on 2018/9/18.
 */
public class MessagePushSteps {
    MessagePushPage messagePushPage;
    @Step
    public void get_newest_message_push_version() throws Exception{
        messagePushPage.getNewestMessagePushVersion();
    }
    @Step
    public void add_message_push() throws Exception{
        messagePushPage.addMessagePush();
    }

}
