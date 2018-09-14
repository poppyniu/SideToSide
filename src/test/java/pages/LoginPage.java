package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

/**
 * Created by Poppy_Zhang on 2018/9/12.
 */
@DefaultUrl("https://qas-gl-cn-mgr.ecovacs.cn/index")
public class LoginPage extends PageObject {
    String currentUrl;
    CommonPage commonPage = new CommonPage();
    MainPage mainPage = new MainPage();
    @FindBy(xpath = "//*[@id='username']")
    WebElement userNameTextbox;
    @FindBy(xpath = "//*[@id='password']")
    WebElement userPwdTextbox;
    @FindBy(xpath = "//*[@id='login']")
    WebElement loginBtn;

    public void validLogin(String name, String password) throws Exception {
        getDriver().manage().window().maximize();
        userNameTextbox.clear();
        commonPage.sendKeysOnElement(userNameTextbox, name);
        userPwdTextbox.clear();
        commonPage.sendKeysOnElement(userPwdTextbox, password);
        loginBtn.click();
    }

    public void checkLoginSucceed() throws Exception {
        currentUrl = getDriver().getCurrentUrl();
        commonPage.wait(getDriver(),2);
        commonPage.navigatePage(currentUrl);
        commonPage.wait(getDriver(), 3);
        if (commonPage.elementExist(mainPage.logoImg)) {
            System.out.println("Login to china area background system succeed, test pass!");
        } else
            Assert.fail("Login to china area background system get error, test pass!");
    }


}
