package serenity;

import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.LoginPage;


/**
 * Created by Poppy_Zhang on 2017/6/21.
 */
public class LoginSteps {
    LoginPage loginPage;

    @Step
    public void open_login_page() {
        loginPage.open();
    }

    @Step
    public void input_name_password(String name, String password) throws Exception {
        loginPage.validLogin(name, password);
    }

    @Step
    public void check_login_succeed() throws Exception {
        loginPage.checkLoginSucceed();
    }


}
