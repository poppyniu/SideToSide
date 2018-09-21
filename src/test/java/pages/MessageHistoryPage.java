package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by xiaowei.zhang on 2018/9/18.
 */
public class MessageHistoryPage extends PageObject {
    //历史消息
    CommonPage commonPage = new CommonPage();
    MainPage mainPage = new MainPage();
    String finalVersion = null;


    @FindBy(xpath = "//*[@id=\"navbar-container\"]/nav/ul/li[4]/a")
    WebElement messageManagement;

    @FindBy(xpath = "//*[@id=\"navbar-container\"]/nav/ul/li[4]/ul/li[2]/a")
    WebElement messageHistory;

    @FindBy(xpath = "//*[@id=\"breadcrumbs\"]/div/div[2]/a")
    WebElement addBtn;

    @FindBy(xpath = "//*[@id=\"searchForm\"]/div[1]/div/input")
    WebElement messageTitleInput;

    @FindBy(xpath = "//*[@id=\"searchForm\"]/div[2]/select")
    WebElement PushApplicationSelect;

    @FindBy(xpath = "//*[@id=\"searchForm\"]/div[3]/select")
    WebElement PushObjectSelect;

    @FindBy(xpath = "//*[@id=\"searchForm\"]/div[4]/select")
    WebElement PushStateSelect;


    @FindBy(xpath = "//*[@id=\"createTimeBegin\"]")
    WebElement createTimeBeginSelect;

    @FindBy(xpath = "//*[@id=\"createTimeEnd\"]")
    WebElement createTimeEndSelect;

    @FindBy(xpath = "//*[@id=\"pushTimeBegin\"]")
    WebElement pushTimeBeginSelect;

    @FindBy(xpath = "//*[@id=\"pushTimeEnd\"]")
    WebElement pushTimeEndSelect;

    @FindBy(xpath = "//*[@id=\"searchBtn\"]")
    WebElement searchBtn;

    public String getNewestMessageHistoryVersion() throws Exception {

        mainPage.messageManagement.click();
        mainPage.messageHistory.click();
        addBtn.click();
        messageTitleInput.click();
        PushApplicationSelect.click();
        PushObjectSelect.click();
        PushStateSelect.click();
        createTimeBeginSelect.click();
        createTimeEndSelect.click();
        pushTimeBeginSelect.click();
        pushTimeEndSelect.click();
        searchBtn.click();

        return finalVersion;
    }
    public void MessageHistory() throws Exception {
        Actions actions = new Actions(getDriver());
        mainPage.messageManagement.click();
        mainPage.messageHistory.click();

        messageTitleInput.click();

        PushApplicationSelect.click();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.UP).perform();
        actions.sendKeys(Keys.ENTER).perform();

        PushObjectSelect.click();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.UP).perform();
        actions.sendKeys(Keys.ENTER).perform();

        PushStateSelect.click();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.UP).perform();
        actions.sendKeys(Keys.ENTER).perform();

        createTimeBeginSelect.click();
        actions.sendKeys(Keys.UP).perform();
        actions.sendKeys(Keys.ENTER).perform();
        createTimeEndSelect.click();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();

        pushTimeBeginSelect.click();
        actions.sendKeys(Keys.UP).perform();
        actions.sendKeys(Keys.ENTER).perform();
        pushTimeEndSelect.click();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        searchBtn.click();

    }
}
