package serenity;

import net.thucydides.core.annotations.Step;
import pages.AdvertisementManagementPage;
import pages.AppVersionManagementPage;


/**
 * Created by Poppy_Zhang on 2017/6/21.
 */
public class AdvertisementManagementSteps {
    AdvertisementManagementPage adManagementPage;


    @Step
    public void add_advertisement() throws Exception {
        adManagementPage.addAdvertisement();
    }

    @Step
    public void disable_advertisement() throws Exception {
        adManagementPage.adisableAdvertisement();
    }


}
