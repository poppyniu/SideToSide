package serenity;

import net.thucydides.core.annotations.Step;
import pages.BootLogoPage;
import pages.ContactServicePage;


/**
 * Created by Poppy_Zhang on 2017/6/21.
 */
public class ContactServiceSteps {
    ContactServicePage contactServicePage;


    @Step
    public void add_custom_service(String area) throws Exception {
        contactServicePage.addCustomService(area);
    }

    @Step
    public void search_delete_custom_service(String area) throws Exception {
        contactServicePage.searchDeleteCustomService(area);
    }



}
