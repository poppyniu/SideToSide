package stepsdefinition;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import serenity.BootLogoSteps;
import serenity.ContactServiceSteps;


public class ContactServiceStepDefinitions {
    @Steps
    ContactServiceSteps contactServiceSteps ;

    @And("^Add a new custom service for (.*)$")
    public void add_a_new_custom_service_for_CN(String area) throws Throwable {
        contactServiceSteps.add_custom_service(area);
    }

    @And("^Go back to website to search and delete custom service for (.*)$")
    public void go_back_to_website_to_search_and_delete_custom_service_for_CN(String area) throws Throwable {
        contactServiceSteps.search_delete_custom_service(area);
    }

}