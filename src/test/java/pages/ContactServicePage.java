package pages;

import constants.TestDataConstants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Poppy_Zhang on 2018/9/19.
 */
public class ContactServicePage extends PageObject {
    String currentUrl;
    String testDataPath = System.getProperty("testdata");
    CommonPage commonPage = new CommonPage();
    MainPage mainPage = new MainPage();
    @FindBy(xpath = "//*[@id=\"breadcrumbs\"]/div/div[2]/a[3]")
    WebElement addBtn;
    @FindBy(xpath = "//*[@id=\"areaSelect_chosen\"]/a/span")
    WebElement areaDropdown;
    @FindBy(xpath = "//*[@id=\"areaSelect_chosen\"]/div/div/input")
    WebElement areaTextbox;
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement emailTextbox;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    WebElement telephoneTextbox;
    @FindBy(xpath = "//*[@id=\"phoneAvailableTime\"]")
    WebElement availableTime;
    @FindBy(xpath = "//*[@id=\"data_form\"]/div[9]/div/button")
    WebElement saveBtn;
    @FindBy(xpath = "//*[@id=\"jAlert\"]/p")
    WebElement alertInfo;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/button/span")
    WebElement sureBtn;
    @FindBy(xpath = "//*[@id=\"customerServiceSearchForm\"]/div[1]/div/a/span")
    WebElement areaCountryDropdown;
    @FindBy(xpath = "//*[@id=\"customerServiceSearchForm\"]/div[1]/div/div/div/input")
    WebElement areaCountryTextbox;
    @FindBy(xpath = "//*[@id=\"searchBtn\"]/span")
    WebElement searchBtn;
    @FindBy(xpath = "//*[@id=\"customerServiceTb\"]/tbody/tr/td[8]/a[2]")
    WebElement deleteBtn;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/button[1]/span")
    WebElement sureBtn1;
    @FindBy(xpath = "//*[@id=\"jAlert\"]/p")
    WebElement deleteInfo;
    @FindBy(xpath = "/html/body/div[5]/div[3]/div/button/span")
    WebElement sureBtn2;
    @FindBy(xpath = "//*[@id=\"customerServiceTb\"]/tbody/tr/td[1]")
    WebElement cnLabel;


    public void addCustomService(String area) throws Exception {
        mainPage.contentManagement.click();
        mainPage.contactService.click();
        commonPage.wait(getDriver(), 3);
        //delete cn area custom service if exist
        areaCountryDropdown.click();
        commonPage.wait(getDriver(), 2);
        areaCountryTextbox.sendKeys(area);
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.ENTER).perform();
        searchBtn.click();
        commonPage.wait(getDriver(), 2);
        if (cnLabel.getText().equals("CN")) {
            deleteBtn.click();
            sureBtn1.click();
            commonPage.wait(getDriver(), 2);
            if (deleteInfo.getText().contains("删除成功")) {
                System.out.println("Search and delete custom service succeed, test pass!");
                sureBtn2.click();
            } else {
                Assert.fail("Search and delete custom service get error, test fail!");
            }
        }
        addBtn.click();
        commonPage.wait(getDriver(), 2);
        areaDropdown.click();
        commonPage.wait(getDriver(), 2);
        areaTextbox.sendKeys(area);
        actions.sendKeys(Keys.ENTER).perform();
        emailTextbox.sendKeys(TestDataConstants.testEmail);
        telephoneTextbox.sendKeys(TestDataConstants.telephoneNumber);
        availableTime.sendKeys(TestDataConstants.testInfo);
        saveBtn.click();
        commonPage.wait(getDriver(), 2);
        if (alertInfo.getText().contains("保存成功")) {
            System.out.println("Add new custom service succeed, test pass!");
            sureBtn.click();
        } else {
            Assert.fail("Add new custom service get error, test fail!");
        }
    }

    public void searchDeleteCustomService(String area) throws Exception {
        areaCountryDropdown.click();
        commonPage.wait(getDriver(), 2);
        areaCountryTextbox.sendKeys(area);
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.ENTER).perform();
        searchBtn.click();
        commonPage.wait(getDriver(), 2);
        deleteBtn.click();
        sureBtn1.click();
        commonPage.wait(getDriver(), 2);
        if (deleteInfo.getText().contains("删除成功")) {
            System.out.println("Search and delete custom service succeed, test pass!");
            sureBtn2.click();
        } else {
            Assert.fail("Search and delete custom service get error, test fail!");
        }
    }


}
