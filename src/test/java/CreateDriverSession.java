import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSession {

    public static AppiumDriver initializeDriver(String platformName) throws Exception {

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,platformName);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,300);

        URL url=new URL("http://0.0.0.0:4723");

        switch (platformName){
            case "Android":
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_5");
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
                capabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554");

                //String appUrl=System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"ApiDemos-debug.apk";
                capabilities.setCapability("appPackage","io.appium.android.apis");
                capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");

                return new AndroidDriver(url,capabilities);
            case "iOS":
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 11");
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
                capabilities.setCapability(MobileCapabilityType.UDID,"77Q6BBF0-8877-4EDF-8C8C-99CBS93FF");

                //capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\alitu\\IdeaProjects\\AppiumPractice\\src\\main\\resources\\ApiDemos-debug.apk");
                //String appUrl=System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"UIKitCatalog-iphonesimulator.app";
                capabilities.setCapability("simulatorStartupTimeout",180000);
                capabilities.setCapability("bundleId","com.example.apple-samplecode.UICatalog");
                return new IOSDriver(url,capabilities);
            default:
                throw new Exception("invalid platform");
        }

    }
}
