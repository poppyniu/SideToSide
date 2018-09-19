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
 * Created by Poppy_Zhang on 2018/9/18.
 */
public class ConfigManagementPage extends PageObject {
    String currentUrl;
    String finalVersion = null;
    CommonPage commonPage = new CommonPage();
    MainPage mainPage = new MainPage();
    @FindBy(xpath = "//*[@id=\"main-container\"]/div[2]/div[2]/div[2]/div/div/table/tbody/tr[4]/td[2]/a")
    WebElement editXiaonengBtn;
    @FindBy(xpath = "//*[@id=\"timeDesc\"]")
    WebElement xiaonengTextbox;
    @FindBy(xpath = "//*[@id=\"submitButton\"]")
    WebElement saveBtn;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/button[1]/span")
    WebElement sureBtn;
    @FindBy(xpath = "//*[@id=\"jAlert\"]/p")
    WebElement saveSucceedInfo;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/button/span")
    WebElement sureBtn1;



    public void setXiaoNeng() throws Exception {
        mainPage.appBasicManagement.click();
        mainPage.configureManagement.click();
        commonPage.wait(getDriver(), 3);
        editXiaonengBtn.click();
        commonPage.wait(getDriver(), 2);
        xiaonengTextbox.clear();
        xiaonengTextbox.sendKeys(TestDataConstants.testInfo);
        saveBtn.click();
        commonPage.wait(getDriver(), 2);
        sureBtn.click();
        commonPage.wait(getDriver(), 2);
        if(saveSucceedInfo.getText().equals("保存成功")){
            System.out.println("Config xiao neng succeed, test pass!");
            sureBtn1.click();
        }else
            Assert.fail("Config xiao neng get error, test fail!");

    }

}
