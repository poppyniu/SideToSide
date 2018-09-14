package serenity;

import constants.Setup;
import constants.TestDataConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.MobilePage;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by poppy zhang on 2018/8/13.
 */
public class MobileSteps {
    AppiumDriver appiumDriver = Setup.appiumDriver;
    MobilePage mobilePage = new MobilePage(appiumDriver);

    @Step
    public void verify_protocol_on_mobile(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePage.class);
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/agreement_agree"), 60, platform);
            Thread.sleep(5000);
        }
        appiumDriver.tap(1, 1113, 929, 100);
        Thread.sleep(2000);
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/actionbar_title"), 60, platform);
            Thread.sleep(5000);
        }
        if (mobilePage.protocolMobilePageTitle.getText().equals(TestDataConstants.testInfo)) {
            System.out.println("Config user protocol to mobile succed, test pass!");
        } else
            Assert.fail("Config user protocol to mobile get error, test fail!");
        mobilePage.protocolMobilePageBackBtn.click();
        mobilePage.protocolMobilePageAgreeBtn.click();
    }
}
