package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by xiaowei.zhang on 2018/9/18.
 */
public class MessagePushPage extends PageObject {
    //消息推送
    CommonPage commonPage = new CommonPage();
    MainPage mainPage = new MainPage();
    String finalVersion = null;

    @FindBy(xpath = "//*[@id=\"navbar-container\"]/nav/ul/li[4]/a")
    WebElement messageManagement;

    @FindBy(xpath = "//*[@id=\"navbar-container\"]/nav/ul/li[4]/ul/li[1]/a")
    WebElement messagePush;

    @FindBy(xpath = "//*[@id=\"msgSaveForm\"]/div[1]/div/label[1]/span")
    WebElement application1;

    @FindBy(xpath = "//*[@id=\"msgSaveForm\"]/div[1]/div/label[2]/span")
    WebElement application2;

    @FindBy(xpath = "//*[@id=\"msgSaveForm\"]/div[1]/div/label[3]/span")
    WebElement application3;

    @FindBy(xpath = "//*[@id=\"msgSaveForm\"]/div[2]/div/label[1]/span")
    WebElement pushTime1;

    @FindBy(xpath = "//*[@id=\"msgSaveForm\"]/div[2]/div/label[2]/span")
    WebElement pushTime2;

    @FindBy(xpath = "//*[@id=\"pushTime\"]")
    WebElement pushTime21;

    @FindBy(xpath = "//*[@id=\"offlineSaveDays\"]")
    WebElement messageOfflineRetentionTime;

    @FindBy(xpath = "//*[@id=\"msgSaveForm\"]/div[4]/div/label[1]/span")
    WebElement pushObject1;

    @FindBy(xpath = "//*[@id=\"msgSaveForm\"]/div[4]/div/label[2]/span")
    WebElement pushObject2;
    //*[@id="areaSel_chosen"]/a/span
    //*[@id="msgSaveForm"]/div[5]/div/a
    //针对国家选择国家删除
    //*[@id="areaTbody"]/tr/td[4]/a
    // /html/body/div[6]/div[3]/div/button[1]/span
    @FindBy(xpath = "//*[@id=\"msgSaveForm\"]/div[4]/div/label[3]/span")
    WebElement pushObject3;

    @FindBy(xpath = "//*[@id=\"msgSaveForm\"]/div[6]/div/div/div/a")
    WebElement filtrateBtn;

    @FindBy(xpath = "//*[@id=\"checkUserModal\"]/div/div/div[2]/div/div/div/form/div[1]/div[2]/label[1]/span")
    WebElement usernameSelect;
    @FindBy(xpath = "//*[@id=\"checkUserModal\"]/div/div/div[2]/div/div/div/form/div[1]/div[2]/label[2]/span")
    WebElement mobileNumberSelect;

    @FindBy(xpath = "//*[@id=\"needValidateUsers\"]")
    WebElement inputValidationBox;

    @FindBy(xpath = "//*[@id=\"checkUserModal\"]/div/div/div[3]/button[1]")
    WebElement useVerifyBtn;
    @FindBy(xpath = "//*[@id=\"checkUserModal\"]/div/div/div[3]/button[2]")
    WebElement useDirectBtn;
    @FindBy(xpath = "//*[@id=\"checkUserModal\"]/div/div/div[3]/button[3]")
    WebElement anewDirectBtn;
    @FindBy(xpath = "//*[@id=\"checkUserModal\"]/div/div/div[3]/button[4]")
    WebElement cancleBtn;

//消息点击 应用内URL跳转
    @FindBy(xpath = "//*[@id=\"msgSaveForm\"]/div[7]/div/label[1]/span")
    WebElement messageClick1;
    @FindBy(xpath = "//*[@id=\"msgSaveForm\"]/div[8]/div/input")
    WebElement msgSaveForm;
    @FindBy(xpath = "//*[@id=\"defaultLangTitle\"]")
    WebElement defaultLangTitle;
    @FindBy(xpath = "//*[@id=\"defaultLangContent\"]")
    WebElement defaultLangContent;
//消息点击 跳转至原生界面
    @FindBy(xpath = "//*[@id=\"msgSaveForm\"]/div[7]/div/label[2]/span")
    WebElement messageClick2;
    @FindBy(xpath = "//*[@id=\"msgNativePage\"]")
    WebElement msgNativePage;
    @FindBy(xpath = "//*[@id=\"defaultLangTitle\"]")
    WebElement defaultLangTitle2;
    @FindBy(xpath = "//*[@id=\"defaultLangContent\"]")
    WebElement defaultLangContent2;
 //消息点击  纯文本展示
    @FindBy(xpath = "//*[@id=\"msgSaveForm\"]/div[7]/div/label[3]/span")
    WebElement messageClick3;
    //*[@id="defaultLangTitle"]
    @FindBy(xpath = "//*[@id=\"msgSaveForm\"]/div[7]/div/label[3]/span")
    WebElement defaultLangTitle3;
    //*[@id="defaultLangContent"]
    @FindBy(xpath = "//*[@id=\"msgSaveForm\"]/div[7]/div/label[3]/span")
    WebElement defaultLangContent3;


    //添加语言
    @FindBy(xpath = "//*[@id=\"msgSaveForm\"]/div[13]/div/a")
    WebElement addLanguageBtn;
    @FindBy(xpath = "//*[@id=\"langSel_chosen\"]/a/span")
    WebElement selectLanguage;
    @FindBy(xpath = "//*[@id=\"langTitle\"]")
    WebElement messageTitleInput;
    @FindBy(xpath = "//*[@id=\"langContent\"]")
    WebElement messageContentInput;
    @FindBy(xpath = "//*[@id=\"langContentModal\"]/div/div/div[3]/button[1]")
    WebElement saveBtn;
    @FindBy(xpath = "//*[@id=\"langContentModal\"]/div/div/div[3]/button[2]")
    WebElement closeBtn;
    //推送确定
    @FindBy(xpath = "//*[@id=\"submitButton\"]")
    WebElement submitPushBut;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/button[1]/span")
    WebElement saveBtn1;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/button[2]/span")
    WebElement cancelBut;


    public String getNewestMessagePushVersion() throws Exception {

        mainPage.messageManagement.click();
        mainPage.messagePush.click();
        application1.click();
        application2.click();
        application3.click();
        pushTime1.click();
        pushTime2.click();
        messageOfflineRetentionTime.click();
        pushObject1.click();
        pushObject2.click();
        pushObject3.click();

        messageClick1.click();
        msgSaveForm.click();
        defaultLangTitle.click();
        defaultLangContent.click();

        messageClick2.click();
        msgNativePage.click();
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        defaultLangTitle2.click();
        defaultLangContent2.click();

        messageClick3.click();
        defaultLangTitle3.click();
        defaultLangContent3.click();

//        addLanguageBtn.click();
//        selectLanguage.click();
//        messageTitleInput.click();
//        messageContentInput.click();
//        saveBtn.click();
//        closeBtn.click();
//        submitPushBut.click();

        return finalVersion;

    }
     public void addMessagePush() throws Exception{
         mainPage.messageManagement.click();
         mainPage.messagePush.click();
         application1.click();
         pushTime1.click();
         pushObject1.click();
         messageClick2.click();
         msgNativePage.click();
         Actions actions = new Actions(getDriver());
         actions.sendKeys(Keys.DOWN).perform();
         actions.sendKeys(Keys.ENTER).perform();
         defaultLangTitle2.click();
         defaultLangTitle2.sendKeys("test");
         defaultLangContent2.click();
         defaultLangContent2.sendKeys("test");
         submitPushBut.click();
         commonPage.wait(getDriver(), 2);
//         saveBtn1.click();
         cancelBut.click();
//         Alert alt = getDriver().switchTo().alert();
//         alt.accept();

    }

}
