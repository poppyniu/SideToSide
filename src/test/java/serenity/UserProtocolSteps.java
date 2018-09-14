package serenity;

import constants.Setup;
import constants.TestDataConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.MobilePage;
import pages.UserProtocolPage;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by poppy.zhang on 2018/9/11.
 */
public class UserProtocolSteps {
    UserProtocolPage userProtocolPage;

    @Step
    public void get_newest_protocol_version() throws Exception {
        userProtocolPage.getNewestProtocolVersion();
    }

    @Step
    public void add_new_user_protocol() throws Exception {
        userProtocolPage.addUserProtocol();
    }

    @Step
    public void publish_new_user_protocol() throws Exception {
        userProtocolPage.pulishUserProtocol();
    }


}
