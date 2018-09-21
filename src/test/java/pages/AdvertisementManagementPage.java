package pages;

import constants.TestDataConstants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
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
public class AdvertisementManagementPage extends PageObject {
    String currentUrl;
    String testDataPath = System.getProperty("testdata");
    CommonPage commonPage = new CommonPage();
    MainPage mainPage = new MainPage();
    @FindBy(xpath = "//*[@id=\"breadcrumbs\"]/div/div[2]/a")
    WebElement addAdBtn;
    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement adNameTextbox;
    @FindBy(xpath = "//*[@id=\"positionType\"]")
    WebElement adPositionDropdown;
    @FindBy(xpath = "//*[@id=\"saveForm\"]/div[3]/div/label[1]/span")
    WebElement adTypeRadioBtn;
    @FindBy(xpath = ".//input[@type='file']")
    WebElement uploadFileBtn;
    @FindBy(xpath = "//*[@id=\"saveForm\"]/div[5]/div/label[2]/span")
    WebElement adClickRadioBtn;
    @FindBy(xpath = "//*[@id=\"tempNativePageKey\"]")
    WebElement jumpDropdown;
    @FindBy(xpath = "//*[@id=\"validityStartTime\"]")
    WebElement startTime;
    @FindBy(xpath = "//*[@id=\"dpTitle\"]/div[2]/a")
    WebElement lastMonthBtn;
    @FindBy(xpath = "//*[@id=\"dpOkInput\"]")
    WebElement okBtn;
    @FindBy(xpath = "//*[@id=\"validityEndTime\"]")
    WebElement toTime;
    @FindBy(xpath = "//*[@id=\"dpTitle\"]/div[6]/a")
    WebElement nextMonthBtn;
    @FindBy(xpath = "//*[@id=\"saveForm\"]/div[9]/div/input")
    WebElement sortTextbox;
    @FindBy(xpath = "//*[@id=\"saveForm\"]/div[10]/div/label[1]/span")
    WebElement allCountryRadioBtn;
    @FindBy(xpath = "//*[@id=\"saveForm\"]/div[11]/div/label[1]/span")
    WebElement allUserRadioBtn;
    @FindBy(xpath = "//*[@id=\"saveForm\"]/div[12]/div/label[1]/span")
    WebElement enableRadioBtn;
    @FindBy(xpath = "//*[@id=\"submitButton\"]")
    WebElement saveBtn;
    @FindBy(xpath = "//*[@id=\"jAlert\"]/p")
    WebElement alertInfo;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/button/span")
    WebElement sureBtn;
    @FindBy(xpath = "//*[@id=\"adItemList\"]/tr[1]/td[9]/a[1]")
    WebElement editBtn;
    @FindBy(xpath = "//*[@id=\"saveForm\"]/div[12]/div/label[2]/span")
    WebElement disableBtn;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/button/span")
    WebElement sureBtn1;



    public void addAdvertisement() throws Exception {
        mainPage.contentManagement.click();
        mainPage.adManagement.click();
        commonPage.wait(getDriver(), 3);
        addAdBtn.click();
        commonPage.wait(getDriver(), 2);
        adNameTextbox.sendKeys(TestDataConstants.testInfo);
        adPositionDropdown.click();
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        adTypeRadioBtn.click();
        uploadFileBtn.sendKeys(testDataPath);
        commonPage.wait(getDriver(), 5);
        adClickRadioBtn.click();
        commonPage.wait(getDriver(), 3);
        jumpDropdown.click();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        commonPage.wait(getDriver(), 2);
        startTime.click();
        commonPage.wait(getDriver(), 2);
        actions.sendKeys(Keys.LEFT).perform();
        actions.sendKeys(Keys.ENTER).perform();
        commonPage.wait(getDriver(), 2);
        toTime.click();
        commonPage.wait(getDriver(), 2);
        actions.sendKeys(Keys.RIGHT).perform();
        actions.sendKeys(Keys.ENTER).perform();
        commonPage.wait(getDriver(), 2);
        sortTextbox.sendKeys("1");
        commonPage.wait(getDriver(), 2);
        allCountryRadioBtn.click();
        allUserRadioBtn.click();
        enableRadioBtn.click();
        saveBtn.click();
        commonPage.wait(getDriver(), 2);
        if (alertInfo.getText().contains("保存成功")) {
            System.out.println("Add new ad succeed, test pass!");
            sureBtn.click();
        } else {
            Assert.fail("Add new ad get error, test fail!");
        }
    }

    public void adisableAdvertisement() throws Exception {
        editBtn.click();
        commonPage.wait(getDriver(), 2);
        commonPage.scrollToElement(disableBtn);
        disableBtn.click();
        saveBtn.click();
        commonPage.wait(getDriver(), 2);
        if (alertInfo.getText().contains("保存成功")) {
            System.out.println("Disable ad succeed, test pass!");
            sureBtn1.click();
        } else {
            Assert.fail("Disable ad get error, test fail!");
        }
    }

}
