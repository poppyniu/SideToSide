package stepsdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.MobileSteps;
import serenity.SetupSteps;

/**
 * Created by poppy zhang on 2018/8/9.
 */
public class SetupStepDefinitions {
    @Steps
    SetupSteps setupSteps=new SetupSteps();

    @Given("^Set up testing environment on (.*)$")
    public void set_up_testing_environment_on_android(String platfrom) throws Throwable {
        setupSteps.setUp(platfrom);
    }

    @Then("^Tear down for mobile driver$")
    public void tear_down() throws Throwable {
        setupSteps.tearDown();
    }
}