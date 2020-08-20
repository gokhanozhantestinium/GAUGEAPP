import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HookImple {


        public static AppiumDriver appiumDriver;

        @BeforeScenario
        public void setUp() throws Exception {

            DesiredCapabilities capabilities=new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.turkishairlines.mobile");

            capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.turkishairlines.mobile.ui.main.MainActivity");
            capabilities.setCapability("autoGrantPermissions","true");


            URL url=new URL("http://localhost:4723/wd/hub");
            appiumDriver=new AppiumDriver(url,capabilities);




        }
        @AfterScenario
        public void closeDriver(){appiumDriver.quit();}


    }
}
