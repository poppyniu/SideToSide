package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by poppy.zhang on 2018/9/11.
 */
public class MainPage extends PageObject{
    @FindBy(xpath = "//*[@id='navbar-container']/div/a/img[1]")
    WebElement logoImg;
    @FindBy(xpath = "//*[@id='navbar-container']/nav/ul/li[1]/a")
    WebElement appBasicManagement;
    @FindBy(xpath = "//*[@id='navbar-container']/nav/ul/li[1]/ul/li[1]/a")
    WebElement userProtocol;
    @FindBy(xpath = "//*[@id='navbar-container']/nav/ul/li[1]/ul/li[2]/a")
    WebElement privacyPolicy;
    @FindBy(xpath = "//*[@id='navbar-container']/nav/ul/li[1]/ul/li[3]/a")
    WebElement appVersionManagement;
    @FindBy(xpath = "//*[@id='navbar-container']/nav/ul/li[1]/ul/li[4]/aa")
    WebElement mailTemplate;
    @FindBy(xpath = "//*[@id=\"navbar-container\"]/nav/ul/li[1]/ul/li[5]/a")
    WebElement configureManagement;
    @FindBy(xpath = "//*[@id='sidebar']/div[1]/div[1]/div/ul/li/ul/li[2]/a")
    WebElement privacyPolicySideBar;
    @FindBy(xpath = "//*[@id='sidebar']/div[1]/div[1]/div/ul/li/ul/li[3]/a")
    WebElement appVersioncManagementSideBar;
    @FindBy(xpath = "//*[@id='sidebar']/div[1]/div[1]/div/ul/li/ul/li[4]/a")
    WebElement mailTemplateSideBar;
    @FindBy(xpath = "//*[@id='sidebar']/div[1]/div[1]/div/ul/li/ul/li[5]/a")
    WebElement configureManagementSideBar;
    @FindBy(xpath = "/html/body/div[2]/div")
    WebElement content;
    @FindBy(xpath = "//*[@id=\"navbar-container\"]/nav/ul/li[2]/a")
    WebElement contentManagement;
    @FindBy(xpath = "//*[@id=\"navbar-container\"]/nav/ul/li[2]/ul/li[1]/a")
    WebElement adManagement;
    @FindBy(xpath = "//*[@id=\"navbar-container\"]/nav/ul/li[2]/ul/li[2]/a")
    WebElement bootLogo;
    @FindBy(xpath = "//*[@id=\"navbar-container\"]/nav/ul/li[2]/ul/li[3]/a")
    WebElement contactService;
    @FindBy(xpath = "//*[@id=\"navbar-container\"]/nav/ul/li[3]/a")
    WebElement userControl;
    @FindBy(xpath = "//*[@id=\"navbar-container\"]/nav/ul/li[3]/ul/li/a")
    WebElement userQuery;
    @FindBy(xpath = "//*[@id=\"navbar-container\"]/nav/ul/li[4]/a")
    WebElement messageManagement;
    @FindBy(xpath = "//*[@id=\"navbar-container\"]/nav/ul/li[4]/ul/li[1]/a")
    WebElement messagePush;
    @FindBy(xpath = "//*[@id=\"navbar-container\"]/nav/ul/li[4]/ul/li[2]/a")
    WebElement messageHistory;

}
