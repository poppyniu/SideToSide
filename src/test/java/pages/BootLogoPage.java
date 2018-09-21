package pages;

import constants.TestDataConstants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Poppy_Zhang on 2018/9/19.
 */
public class BootLogoPage extends PageObject {
    String currentUrl;
    String testDataPath = System.getProperty("testdata");
    CommonPage commonPage = new CommonPage();
    MainPage mainPage = new MainPage();
    @FindBy(xpath = "//*[@id=\"breadcrumbs\"]/div/div[2]/a")
    WebElement addAdBtn;
    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement nameTextbox;
    @FindBy(xpath = ".//input[@type='file']")
    WebElement uploadFileBtn;
    @FindBy(xpath = "//*[@id=\"startTimeStr\"]")
    WebElement startTime;
    @FindBy(xpath = "//*[@id=\"endTimeStr\"]")
    WebElement endTime;
    @FindBy(xpath = "//*[@id=\"delayTime\"]")
    WebElement displayTime;
    @FindBy(xpath = "//*[@id=\"saveForm\"]/div[7]/div/label[1]/span")
    WebElement noLinkRadioBtn;
    @FindBy(xpath = "//*[@id=\"saveForm\"]/div[9]/div/label[1]/span")
    WebElement allCountryRadioBtn;
    @FindBy(xpath = "//*[@id=\"saveForm\"]/div[11]/div/label[1]/span")
    WebElement enableRadioBtn;
    @FindBy(xpath = "//*[@id=\"saveForm\"]/div[11]/div/label[2]/span")
    WebElement disableRadioBtn;
    @FindBy(xpath = "//*[@id=\"submitButton\"]")
    WebElement saveBtn;
    @FindBy(xpath = "//*[@id=\"bootAdTb\"]/tbody/tr[1]/td[1]")
    WebElement bootLogoName;
    @FindBy(xpath = "//*[@id=\"bootAdTb\"]/tbody/tr[1]/td[6]/a[1]")
    WebElement editBtn;
    @FindBy(xpath = "//*[@id=\"bootAdTb\"]/tbody/tr[1]/td[5]")
    WebElement statusLabel;




    public void addBootlogo() throws Exception {
        mainPage.contentManagement.click();
        mainPage.bootLogo.click();
        commonPage.wait(getDriver(), 3);
        addAdBtn.click();
        commonPage.wait(getDriver(), 2);
        nameTextbox.sendKeys(TestDataConstants.testInfo);
        uploadFileBtn.sendKeys(testDataPath);
        commonPage.wait(getDriver(), 5);
        commonPage.scrollToElement(startTime);
        commonPage.wait(getDriver(), 2);
        startTime.click();
        commonPage.wait(getDriver(), 2);
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.LEFT).perform();
        actions.sendKeys(Keys.ENTER).perform();
        commonPage.wait(getDriver(), 2);
        endTime.click();
        commonPage.wait(getDriver(), 2);
        actions.sendKeys(Keys.RIGHT).perform();
        actions.sendKeys(Keys.ENTER).perform();
        commonPage.wait(getDriver(), 2);
        displayTime.sendKeys("5");
        noLinkRadioBtn.click();
        allCountryRadioBtn.click();
        enableRadioBtn.click();
        saveBtn.click();
        commonPage.wait(getDriver(), 2);
        if (bootLogoName.getText().contains(TestDataConstants.testInfo)) {
            System.out.println("Add new boot logo succeed, test pass!");
        } else {
            Assert.fail("Add new boot logo get error, test fail!");
        }
    }

    public void disableBootlogo() throws Exception {
        currentUrl = getDriver().getCurrentUrl();
        commonPage.wait(getDriver(), 2);
        commonPage.navigatePage(currentUrl);
        commonPage.wait(getDriver(), 2);
        editBtn.click();
        commonPage.wait(getDriver(), 3);
        commonPage.scrollToElement(disableRadioBtn);
        commonPage.wait(getDriver(), 2);
        disableRadioBtn.click();
        commonPage.wait(getDriver(), 2);
        saveBtn.click();
        commonPage.wait(getDriver(), 2);
        if (statusLabel.getText().equals("禁用")) {
            System.out.println("Disable new boot logo succeed, test pass!");
        } else {
            Assert.fail("Disable new boot logo get error, test fail!");
        }

    }


}
