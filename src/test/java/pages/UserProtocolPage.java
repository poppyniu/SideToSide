package pages;

import constants.Setup;
import constants.TestDataConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import static java.util.concurrent.TimeUnit.SECONDS;



/**
 * Created by poppy.zhang on 2018/9/11.
 */
public class UserProtocolPage extends PageObject {
    CommonPage commonPage = new CommonPage();
    MainPage mainPage = new MainPage();
    String finalVersion = null;
    String currentUrl;
    @FindBy(xpath = ".//*[@id='agreementTb']/tbody/tr[2]/td[2]")
    WebElement currentVersion;
    @FindBy(xpath = "//*[@id='breadcrumbs']/div/div[2]/a")
    WebElement addBtn;
    @FindBy(xpath = "//*[@id=\"agreementArea_chosen\"]/a/span")
    WebElement selectCountryDropdown;
    @FindBy(xpath = "//*[@id=\"agreementVersion\"]")
    WebElement versionNumberTextbox;
    @FindBy(xpath = "//*[@id=\"data_form\"]/div[3]/div/label[1]/span")
    WebElement userConfirmYes;
    @FindBy(xpath = "//*[@id=\"data_form\"]/div[6]/div/button")
    WebElement saveBtn;
    @FindBy(xpath = "//*[@id=\"jAlert\"]/p")
    WebElement saveProtocolAlertInfo;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/button/span")
    WebElement alertConfirmBtn;
    @FindBy(xpath = "//*[@id=\"data_form\"]/div[6]/label[2]/a")
    WebElement addLanguageBtn;
    @FindBy(xpath = "//*[@id=\"agreementLanguage_chosen\"]/a/span")
    WebElement selectLanguageDropdown;
    @FindBy(id = "title")
    WebElement languageTitle;
    @FindBy(xpath = "/html/body")
    WebElement languageContent;
    @FindBy(xpath = "//*[@id=\"data_form\"]/div[5]/div/button")
    WebElement languageSaveBtn;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/button/span")
    WebElement languageAlertConfirmBtn;
    @FindBy(xpath = "//*[@id=\"main-container\"]/div[2]/div[2]/div[1]/div[1]/div[2]/a")
    WebElement publishBtn;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/button[1]/span")
    WebElement publishAlertConfirmBtn;
    @FindBy(xpath = "//*[@id=\"jAlert\"]/p")
    WebElement publishAlertContent;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/button/span")
    WebElement publishAlertConfirmBtn1;
    @FindBy(xpath = ".//iframe[@id='ueditor_0']")
    WebElement languageRichTextboxIframe;


    public String getNewestProtocolVersion() throws Exception {
        if (mainPage.appBasicManagement != null) {
            mainPage.appBasicManagement.click();
            mainPage.userProtocol.click();
            commonPage.wait(getDriver(), 2);
            String latestVersionChina = currentVersion.getText();
            String[] splitStr = latestVersionChina.split("\\.");
            int newVersion = Integer.parseInt(splitStr[1].toString());
            int version = newVersion + 1;
            finalVersion = splitStr[0] + "." + String.valueOf(version);
            System.out.println("New version will be: " + finalVersion);
        }
        return finalVersion;
    }

    public void addUserProtocol() throws Exception {
        addBtn.click();
        currentUrl = getDriver().getCurrentUrl();
        commonPage.wait(getDriver(), 2);
        commonPage.navigatePage(currentUrl);
        commonPage.wait(getDriver(), 3);
        selectCountryDropdown.click();
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        versionNumberTextbox.sendKeys(finalVersion);
        userConfirmYes.click();
        saveBtn.click();
        commonPage.wait(getDriver(), 2);
        //Alert alert = getAlert();
        //alert.accept();
        if (saveProtocolAlertInfo.getText().equals("保存用户协议成功！")) {
            System.out.println("Save user proticol succeed, tese pass!");
        } else
            Assert.fail("Save user proticol get error, tese fail!");
        alertConfirmBtn.click();
        commonPage.wait(getDriver(), 2);
        //add language version
        addLanguageBtn.click();
        commonPage.wait(getDriver(), 2);
        selectLanguageDropdown.click();
        Actions action1 = new Actions(getDriver());
        action1.sendKeys(Keys.DOWN).perform();
        action1.sendKeys(Keys.ENTER).perform();
        languageTitle.sendKeys(TestDataConstants.testInfo);
        getDriver().switchTo().frame(languageRichTextboxIframe);
        commonPage.wait(getDriver(), 2);
        languageContent.click();
        languageContent.sendKeys(TestDataConstants.testInfo);
        getDriver().switchTo().defaultContent();
        commonPage.wait(getDriver(), 2);
        languageSaveBtn.click();
        languageAlertConfirmBtn.click();
    }

    public void pulishUserProtocol() throws Exception {
        publishBtn.click();
        commonPage.wait(getDriver(), 2);
        publishAlertConfirmBtn.click();
        if (publishAlertContent.getText().equals("发布成功！")) {
            System.out.println("Publish user protocol succeed, test pass!");
        } else
            Assert.fail("Publish user protocol get error, test fail!");
        publishAlertConfirmBtn1.click();
        getDriver().quit();
    }

}
