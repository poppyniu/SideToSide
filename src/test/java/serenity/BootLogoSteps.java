package serenity;

import net.thucydides.core.annotations.Step;
import pages.AdvertisementManagementPage;
import pages.BootLogoPage;


/**
 * Created by Poppy_Zhang on 2017/6/21.
 */
public class BootLogoSteps {
    BootLogoPage bootLogoPage;


    @Step
    public void add_bootlogo() throws Exception {
        bootLogoPage.addBootlogo();
    }

    @Step
    public void disable_bootlogo() throws Exception {
        bootLogoPage.disableBootlogo();
    }


}
