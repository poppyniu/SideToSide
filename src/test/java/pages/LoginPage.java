package pages;

import constants.TestDataConstants;
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
    @FindBy(xpath = "//*[@id=\"tipName\"]")
    WebElement invalidLoginTip;
    @FindBy(xpath = "//*[@id=\"tipPwd\"]")
    WebElement invalidLoginTip1;
    @FindBy(xpath = "//*[@id=\"tipPwd\"]")
    WebElement invalidLoginTip2;


    public void openPage(String country) throws Exception {
        if (country.equals("中国")) {
            getDriver().get(TestDataConstants.chinaLoginUrl);
        } else if (country.equals("美国")) {
            getDriver().get(TestDataConstants.americaLoginUrl);
        } else if (country.equals("德国")) {
            getDriver().get(TestDataConstants.germanyLoginUrl);
        } else if (country.equals("新加坡")) {
            getDriver().get(TestDataConstants.singaporeLoginUrl);
        }
        commonPage.wait(getDriver(), 2);
    }

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
        commonPage.wait(getDriver(), 2);
        commonPage.navigatePage(currentUrl);
        commonPage.wait(getDriver(), 3);
        if (commonPage.elementExist(mainPage.logoImg)) {
            System.out.println("Login to china area background system succeed, test pass!");
        } else
            Assert.fail("Login to china area background system get error, test fail!");
    }

    public void invalidlogin1() throws Exception {
        loginBtn.click();
        commonPage.wait(getDriver(), 3);
        if (invalidLoginTip.getText().equals("请输入用户名") && invalidLoginTip1.getText().equals("请输入密码")) {
            System.out.println("Input nothing to login see correct remind info, test pass!");
        } else
            Assert.fail("Input nothing to login does not see correct remind info, test fail!");
    }

    public void invalidlogin2() throws Exception {
        userNameTextbox.sendKeys(TestDataConstants.testInfo);
        userPwdTextbox.sendKeys(TestDataConstants.testInfo);
        loginBtn.click();
        commonPage.wait(getDriver(), 3);
        if (invalidLoginTip2.getText().equals("用户名、密码错误或账户被禁用，请联系管理员")) {
            System.out.println("Input wrong name and pwd to login see correct remind info, test pass!");
        } else
            Assert.fail("Input wrong name and pwd to login does not see correct remind info, test fail!");

    }


}
