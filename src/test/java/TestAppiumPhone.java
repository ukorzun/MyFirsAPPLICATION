

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class TestAppiumPhone {


    public static void main(String []args) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"/Users/v_korzun/IdeaProjects/MyFirsAPPLICATION/src/main/resources/5 Second Rule (voiced)_0.99_Apkpure.apk");
//        desiredCapabilities.setCapability("appPackage","com.android.dialer");
        desiredCapabilities.setCapability("noReset",true);
//        desiredCapabilities.setCapability("appActivity","com.android.dialer.main.impl.MainActivity");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4809/wd/hub"), desiredCapabilities);

        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Buy");
//        driver.rotate();
//        el4.click();
//        List<MobileElement> el5 = driver.findElementsByXPath("//android.widget.Button[@text='BACK']");
//        el5.stream().filter(element ->element.getText());

        
    }
}
