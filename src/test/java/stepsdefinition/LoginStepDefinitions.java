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

    @Given("^Open ([^\"]*) area login page$")
    public void open_china_area_login_page(String country) throws Throwable {
        loginSteps.open_login_page(country);
    }

    @When("^Input valid user ([^\"]*) and ([^\"]*) and click login button$")
    public void input_valid_user_linfeng_ma_and_Eco_and_click_login_button(String name, String password) throws Throwable {
        loginSteps.input_name_password(name, password);
    }

    @Then("^User login to system succeed$")
    public void user_login_to_system_succeed() throws Throwable {
        loginSteps.check_login_succeed();
    }

    @When("^Input nothing and click login button and check remind info$")
    public void input_nothing_and_click_login_button() throws Throwable {
        loginSteps.invalid_login1();
    }

    @Then("^Input invalid name or password then click login button and check remind info$")
    public void input_wrong_account_and_click_login_button() throws Throwable {
        loginSteps.invalid_login2();
    }


}