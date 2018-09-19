package pages;

import constants.TestDataConstants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Poppy_Zhang on 2018/9/19.
 */
@DefaultUrl("https://qas-gl-cn-mgr.ecovacs.cn/index")
public class AppVersionManagementPage extends PageObject {
    String currentUrl;
    String finalVersion = null;
    CommonPage commonPage = new CommonPage();
    MainPage mainPage = new MainPage();
    @FindBy(xpath = "//*[@id=\"appVersionSearchForm\"]/div[1]/select")
    WebElement appNameDropdown;
    @FindBy(xpath = "//*[@id=\"searchBtn\"]/span")
    WebElement searchBtn;
    @FindBy(xpath = "//*[@id=\"appVersionTb\"]/tbody/tr[1]/td[2]")
    WebElement newestVersionField;
    @FindBy(xpath = "//*[@id=\"breadcrumbs\"]/div/div[2]/a")
    WebElement addAppBtn;
    @FindBy(xpath = "//*[@id=\"appVersion\"]")
    WebElement appVersionTextbox;
    @FindBy(xpath = "//*[@id=\"data_form\"]/div[1]/div/div[3]/div/textarea")
    WebElement upgradeInfoChinese;
    @FindBy(xpath = "//*[@id=\"data_form\"]/div[1]/div/div[4]/div/textarea")
    WebElement upgradeInfoEnglish;
    @FindBy(xpath = " //*[@id=\"data_form\"]/div[2]/div/div[1]/div/label[1]/span/text()")
    WebElement defaultLanguageCheckbox;
    @FindBy(xpath = "//*[@id=\"data_form\"]/div[2]/div/div[4]/div/button")
    WebElement saveBtn;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/button/span")
    WebElement saveOkSureBtn;
    @FindBy(xpath = "//*[@id=\"appVersionTb\"]/tbody/tr[1]/td[11]/a[2]")
    WebElement detailBtn;
    @FindBy(xpath = "//*[@id=\"breadcrumbs\"]/div/div[2]/a[1]")
    WebElement addInstallFileBtn;
    @FindBy(xpath = "//*[@id=\"installType\"]")
    WebElement installTypeDropdown;
    @FindBy(xpath = "//*[@id=\"installUrl\"]")
    WebElement installUrlTextBox;
    @FindBy(xpath = "//*[@id=\"installInfoBtn\"]")
    WebElement saveBtn1;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/button/span")
    WebElement sureBtn;
    @FindBy(xpath = "//*[@id=\"data_form\"]/div[1]/div/div[5]/label[3]/a")
    WebElement remindUpgrade;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/button[1]/span")
    WebElement remindUpgradeYesBtn;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/button/span")
    WebElement modifySucceedSureBtn;
    @FindBy(xpath = "//*[@id=\"breadcrumbs\"]/div/div[2]/a[2]")
    WebElement publishBtn;
    @FindBy(xpath = "//*[@id=\"publishBtn\"]")
    WebElement publishBtn1;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/button[1]/span")
    WebElement sureBtn1;
    @FindBy(xpath = "//*[@id=\"jAlert\"]/p")
    WebElement publishSucceedInfo;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/button/span")
    WebElement sureBtn2;




    public String getVersionForPlatform(String platform) throws Exception {
        mainPage.appBasicManagement.click();
        mainPage.appVersionManagement.click();
        commonPage.wait(getDriver(), 3);
        appNameDropdown.click();
        if(platform.equals("android")){
            Actions actions = new Actions(getDriver());
            actions.sendKeys(Keys.DOWN).perform();
            actions.sendKeys(Keys.ENTER).perform();
        }
        else{
            Actions actions = new Actions(getDriver());
            actions.sendKeys(Keys.DOWN).perform();
            actions.sendKeys(Keys.DOWN).perform();
            actions.sendKeys(Keys.ENTER).perform();
        }
        searchBtn.click();
        commonPage.wait(getDriver(), 2);
        String latestVersion = newestVersionField.getText();
        String[] splitStr = latestVersion.split("\\.");
        int newVersion = Integer.parseInt(splitStr[2].toString());
        int version = newVersion + 1;
        if(String.valueOf(newVersion).length()==1) {
            finalVersion = splitStr[0] + "." +splitStr[1] + "."+"0"+ String.valueOf(version);
        }
        else{
            finalVersion = splitStr[0] + "."+splitStr[1] + "." + String.valueOf(version);
        }
        System.out.println("New version will be: " + finalVersion);
        return finalVersion;
    }

    public void addAppVersion() throws Exception {
        addAppBtn.click();
        commonPage.wait(getDriver(), 2);
        appVersionTextbox.sendKeys(finalVersion);
        upgradeInfoChinese.sendKeys(TestDataConstants.upgradeInfoChinese);
        upgradeInfoEnglish.sendKeys(TestDataConstants.upgradeInfoEnglish);
        saveBtn.click();
        commonPage.wait(getDriver(), 2);
        saveOkSureBtn.click();
        commonPage.wait(getDriver(), 2);
    }

    public void addInstallFileAndPublish() throws Exception {
        detailBtn.click();
        commonPage.wait(getDriver(), 2);
        addInstallFileBtn.click();
        installTypeDropdown.click();
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        installUrlTextBox.sendKeys(TestDataConstants.installUrl);
        saveBtn1.click();
        sureBtn.click();
        commonPage.wait(getDriver(), 2);
        remindUpgrade.click();
        remindUpgradeYesBtn.click();
        modifySucceedSureBtn.click();
        publishBtn.click();
        commonPage.wait(getDriver(), 2);
        publishBtn1.click();
        sureBtn1.click();
        if(publishSucceedInfo.getText().equals("发布成功！")){
            System.out.println("Publish new app version succeed, test pass!");
            sureBtn2.click();
        }
        else{
            Assert.fail("Publish new app version get error, test fail!");
        }
    }


}
