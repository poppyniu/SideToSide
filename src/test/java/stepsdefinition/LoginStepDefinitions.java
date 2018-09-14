package stepsdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.LoginSteps;


public class LoginStepDefinitions {
    @Steps
    LoginSteps loginSteps ;

    @Given("^Open china area login page$")
    public void open_china_area_login_page() throws Throwable {
        loginSteps.open_login_page();
    }

    @When("^Input valid user ([^\"]*) and ([^\"]*) and click login button$")
    public void input_valid_user_linfeng_ma_and_Eco_and_click_login_button(String name, String password) throws Throwable {
        loginSteps.input_name_password(name, password);
    }

    @Then("^User login to system succeed$")
    public void user_login_to_system_succeed() throws Throwable {
        loginSteps.check_login_succeed();
    }

}