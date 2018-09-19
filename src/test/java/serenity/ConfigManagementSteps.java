package serenity;

import net.thucydides.core.annotations.Step;
import pages.AppVersionManagementPage;
import pages.ConfigManagementPage;


/**
 * Created by Poppy_Zhang on 2017/6/21.
 */
public class ConfigManagementSteps {
    ConfigManagementPage configManagementPage;


    @Step
    public void set_xiaoneng() throws Exception {
        configManagementPage.setXiaoNeng();
    }

}
