import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionAndroid {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities capabilities=new DesiredCapabilities();

        //capabilities.setCapability("platformName","Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 5");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        capabilities.setCapability("newCommandTimeout",300);


        //these for automatically run avd, waiting time to open it
        //capabilities.setCapability("avd","Pixel_5");
        //capabilities.setCapability("avdLaunchTimeout",180000);


        //we use this capabilities to install app. so after installing no need to run again this line. we just run existing app
        String appUrl=System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"ApiDemos-debug.apk";
        //capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\alitu\\IdeaProjects\\AppiumPractice\\src\\main\\resources\\ApiDemos-debug.apk");
        //capabilities.setCapability(MobileCapabilityType.APP,appUrl);

        // Terminal Command -->  adb shell "dumpsys activity activities | grep mResumedActivity"
        capabilities.setCapability("appPackage","io.appium.android.apis");
        capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");

        //URL url=new URL("http://0.0.0.0:4723/wd/hub"); //--> normally we use this line but I pass in command line 'appium --base-path /wd/hub'
        URL url=new URL("http://0.0.0.0:4723");

        AppiumDriver driver=new AndroidDriver(url,capabilities);

        System.out.println("session id"+driver.getSessionId());



    }
}
