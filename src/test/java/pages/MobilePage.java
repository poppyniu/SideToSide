package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by poppy zhang on 2018/9/13.
 */
public class MobilePage {
    //user protocol page element
    @AndroidFindBy(id="com.eco.global.app:id/actionbar_title")
    public MobileElement protocolMobilePageTitle;
    @AndroidFindBy(id="com.eco.global.app:id/actionbar_left")
    public MobileElement protocolMobilePageBackBtn;
    @AndroidFindBy(id="com.eco.global.app:id/agreement_agree")
    public MobileElement protocolMobilePageAgreeBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'发现新版本')]")
    public MobileElement findNewVersion;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'忽略')]")
    public MobileElement newVersionIgnoreBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'当前版本')]")
    public MobileElement currentVersionPanel;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_country_arrow")
    public MobileElement moreCountryIcon;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_country")
    public MobileElement countryInLoginPage;
    @AndroidFindBy(id = "com.eco.global.app:id/btn_change_login")
    public MobileElement chinaPwdLoginBtn;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/edit_account")
    public MobileElement emailAccountTextbox;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeSecureTextField[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/edit_password")
    public MobileElement passwordTextbox;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/btn_login")
    public MobileElement loginButton;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id="com.eco.global.app:id/actionbar_right_text")
    public MobileElement saveBtnInAreaPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id="com.eco.global.app:id/actionbar_left")
    public MobileElement actionBarLeft;
    @AndroidFindBy(id="com.eco.global.app:id/tv_contact")
    public MobileElement helpFeedback;
    @AndroidFindBy(id="com.eco.global.app:id/online_service_text")
    public MobileElement onlineCustom;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'test')]")
    public MobileElement xiaonengText;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'取消')]")
    public MobileElement xiaonengCancelBtn;


    @AndroidFindBy(id = "android:id/icon")
    public MobileElement iconBtn;

    @AndroidFindBy(id = "com.eco.global.app:id/rl_push_msg")
    public MobileElement rl_push_msgBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'test')]")
    public MobileElement ll_messageBtn;


    public MobilePage(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


}
