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

    public MobilePage(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


}
