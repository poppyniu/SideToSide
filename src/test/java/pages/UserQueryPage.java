package pages;

import constants.TestDataConstants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


/**
 * Created by xiaowei.zhang on 2018/9/18.
 */
public class UserQueryPage extends PageObject {
    CommonPage commonPage = new CommonPage();
    MainPage mainPage = new MainPage();
    String finalVersion = null;
    String currentUrl;
    @FindBy(xpath = ".//*[@id='agreementTb']/tbody/tr[2]/td[2]")
    WebElement currentVersion;
    @FindBy(xpath = "//*[@id=\"navbar-container\"]/nav/ul/li[3]/a")
    WebElement userControl;
    @FindBy(xpath = "//*[@id=\"navbar-container\"]/nav/ul/li[3]/ul/li/a")
    WebElement userQuery;

    @FindBy(xpath = "//*[@id=\"ucAccout\"]")
    WebElement selectAccount;
    @FindBy(xpath = "//*[@id=\"ucSearchForm\"]/div[1]/select")
    WebElement typeSearchFormDropdown;
    @FindBy(xpath = "//*[@id=\"ucSearchForm\"]/div[2]/input")
    WebElement typeSearchFormInput;
    @FindBy(xpath = "//*[@id=\"ucSearchForm\"]/div[3]/select")
    WebElement registeredSourceSearchFormDropdown;
    @FindBy(xpath = "//*[@id=\"searchUcBtn\"]/span")
    WebElement userCenterAccountSearchBtn;
    @FindBy(xpath = "//*[@id=\"ucTb\"]/tbody/tr[1]/td[1]/input")
    WebElement selectBoxBtn;
    @FindBy(xpath = "//*[@id=\"selectStorage\"]/div/div/div[1]/div[2]/button")
    WebElement clearSelectionDataBtn;
    @FindBy(xpath = "//*[@id=\"ucSearchConfirmBtn\"]")
    WebElement searchConfirmBtn;
    @FindBy(xpath = "//*[@id=\"ucSearchModal\"]/div/div/div[3]/button[2]")
    WebElement searchCancelBtn;

    @FindBy(xpath = "//*[@id=\"userSearchForm\"]/div[2]/div/a/span")
    WebElement selectAllAreaDropdown;
    @FindBy(xpath = "//*[@id=\"userSearchForm\"]/div[2]/div/a/span")
    WebElement selectAreaChinaDropdown;

    @FindBy(xpath = "//*[@id=\"registerTimeBeginStr\"]")
    WebElement registrationDateBeginInput;
    @FindBy(xpath = "//*[@id=\"dpOkInput\"]")
    WebElement registrationDateBeginInputConfirmbtn;
    @FindBy(xpath = "//*[@id=\"dpClearInput\"]")
    WebElement registrationDateBeginInputCancelBtn;
    @FindBy(xpath = "//*[@id=\"dpTodayInput\"]")
    WebElement registrationDateBeginInputTodayBtn;
    @FindBy(xpath = "//*[@id=\"registerTimeEndStr\"]")
    WebElement registrationDateEndInput;

    @FindBy(xpath = "//*[@id=\"lastLoginTimeBeginStr\"]")
    WebElement lastLoginTimeBeginInput;
    @FindBy(xpath = "//*[@id=\"lastLoginTimeEndStr\"]")
    WebElement lastLoginTimeEndInput;

    @FindBy(xpath = "//*[@id=\"searchBtn\"]/span")
    WebElement searchBtn1;

    public String getNewestControlQueryVersion() throws Exception {
        if (userControl != null) {
            mainPage.userControl.click();
            mainPage.userQuery.click();
//            commonPage.wait(getDriver(), 2);
//            String latestVersionChina = currentVersion.getText();
//            String[] splitStr = latestVersionChina.split("\\.");
//            int newVersion = Integer.parseInt(splitStr[1].toString());
//            int version = newVersion + 1;
//            if(String.valueOf(newVersion).length()==1) {
//                finalVersion = splitStr[0] + "." +"0"+ String.valueOf(version);
//            }
//            else{
//                finalVersion = splitStr[0] + "." + String.valueOf(version);
//            }
//            System.out.println("New version will be: " + finalVersion);
        }
        selectAccount.click();
        if (searchCancelBtn != null) {
            searchCancelBtn.click();
        }
        selectAllAreaDropdown.click();
        selectAreaChinaDropdown.click();

        registrationDateBeginInput.click();
//        registrationDateBeginInputConfirmbtn.click();
//        registrationDateBeginInputCancelBtn.click();
//        registrationDateBeginInputTodayBtn.click();
        registrationDateEndInput.click();
        lastLoginTimeBeginInput.click();
        lastLoginTimeEndInput.click();

        searchBtn1.click();
        return finalVersion;

    }
        public void userQuery() throws Exception{
            Actions actions = new Actions(getDriver());

            mainPage.userControl.click();
            mainPage.userQuery.click();

            selectAllAreaDropdown.click();
            actions.sendKeys(Keys.DOWN).perform();
            actions.sendKeys(Keys.ENTER).perform();

            registrationDateBeginInput.click();
            actions.sendKeys(Keys.UP).perform();
            actions.sendKeys(Keys.ENTER).perform();
            registrationDateEndInput.click();
            actions.sendKeys(Keys.DOWN).perform();
            actions.sendKeys(Keys.ENTER).perform();

            lastLoginTimeBeginInput.click();
            actions.sendKeys(Keys.UP).perform();
            actions.sendKeys(Keys.ENTER).perform();
            lastLoginTimeEndInput.click();
            actions.sendKeys(Keys.DOWN).perform();
            actions.sendKeys(Keys.ENTER).perform();

            searchBtn1.click();

  }


}
