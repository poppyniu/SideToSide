package serenity;

import constants.Setup;
import constants.TestDataConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.LoginPage;
import pages.MobilePage;

import java.util.HashMap;
import java.util.Map;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by poppy zhang on 2018/8/13.
 */
public class MobileSteps {
    AppiumDriver appiumDriver = Setup.appiumDriver;
    MobilePage mobilePage = new MobilePage(appiumDriver);


    @Step
    public void chooseCountry(String country, String platform) throws Exception {
        //initial area page
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePage.class);
        Thread.sleep(9000);
        if (country != null && appiumDriver != null && platform.equals("android")) {
            if (elementExist(mobilePage.moreCountryIcon)) {
                mobilePage.moreCountryIcon.click();
                String countryStr = "new UiScrollable(new UiSelector().scrollable(true).instance(0))." + "scrollIntoView(new UiSelector().textContains(" + "\"" + country + "\"" + ").instance(0))";
                ((AndroidDriver) appiumDriver).findElementByAndroidUIAutomator(countryStr).click();
            }
        } else {
            //CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[6]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]"), 60, platform);
            //loginPage.notAllowNoticeBtn.click();
            Thread.sleep(2000);
            mobilePage.countryInLoginPage.click();
            Thread.sleep(20000);
            boolean countryYouWant = true;
            while (countryYouWant) {
                if (appiumDriver.findElementByXPath("//XCUIElementTypeStaticText[@name='" + country + "']").isDisplayed()) {
                    appiumDriver.findElementByXPath("//XCUIElementTypeStaticText[@name='" + country + "']").click();
                    countryYouWant = false;
                } else {
                    swipeToDirection(appiumDriver, "up");
                }
            }
        }
        mobilePage.saveBtnInAreaPage.click();
    }

    @Step
    public void different_country_login_to_mobile(String name, String password, String country) throws Exception {
        if (country.equals("中国")) {
            mobilePage.chinaPwdLoginBtn.click();
        }
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePage.class);
        if (name != null && password != null) {
            mobilePage.emailAccountTextbox.clear();
            mobilePage.emailAccountTextbox.sendKeys(name);
            mobilePage.passwordTextbox.clear();
            mobilePage.passwordTextbox.sendKeys(password);
            mobilePage.loginButton.click();
        }
    }

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
            System.out.println("Config user protocol to mobile succeed, test pass!");
        } else
            Assert.fail("Config user protocol to mobile get error, test fail!");
        mobilePage.protocolMobilePageBackBtn.click();
        mobilePage.protocolMobilePageAgreeBtn.click();
    }

    @Step
    public void verify_policy_on_mobile(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePage.class);
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/agreement_agree"), 60, platform);
            Thread.sleep(5000);
        }
        appiumDriver.tap(1, 550, 1021, 100);
        Thread.sleep(2000);
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/actionbar_title"), 60, platform);
            Thread.sleep(5000);
        }
        if (mobilePage.protocolMobilePageTitle.getText().equals(TestDataConstants.testInfo)) {
            System.out.println("Config privacy policy to mobile succeed, test pass!");
        } else
            Assert.fail("Config privacy policy to mobile get error, test fail!");
        mobilePage.protocolMobilePageBackBtn.click();
        mobilePage.protocolMobilePageAgreeBtn.click();
    }

    @Step
    public void verify_app_on_mobile(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePage.class);
        Thread.sleep(10000);
        if (mobilePage.findNewVersion.getText().equals("发现新版本") && mobilePage.currentVersionPanel.getText().contains(TestDataConstants.upgradeInfoChinese)) {
            System.out.println("Config app version to mobile succeed, test pass!");
        } else
            Assert.fail("Config app version to mobile get error, test fail!");
        mobilePage.newVersionIgnoreBtn.click();
    }

    @Step
    public void verifyXiaoneng(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePage.class);
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/actionbar_left"), 60, platform);
            Thread.sleep(5000);
        }
        mobilePage.actionBarLeft.click();
        Thread.sleep(2000);
        mobilePage.helpFeedback.click();
        Thread.sleep(2000);
        mobilePage.onlineCustom.click();
        Thread.sleep(3000);
        if (mobilePage.xiaonengText.getText().equals(TestDataConstants.testInfo)) {
            System.out.println("Config xiao neng to mobile succeed, test pass!");
        } else
            Assert.fail("Config xiao neng to mobile get error, test fail!");
        mobilePage.xiaonengCancelBtn.click();

    }

    private boolean elementExist(MobileElement element)
            throws Exception {
        boolean elementExist = element.isDisplayed();
        if (elementExist == true) {
            junit.framework.Assert.assertTrue(true);
            return elementExist;
        }
        junit.framework.Assert.assertFalse("Mobile element does not exist!", false);
        return elementExist;
    }

    private static void swipeToDirection(AppiumDriver driver, String direction) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<>();
        params.put("direction", direction);
        js.executeScript("mobile: swipe", params);

    }

}
