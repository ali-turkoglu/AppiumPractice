import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionIOS {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities capabilities=new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 11");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
        capabilities.setCapability(MobileCapabilityType.UDID,"77Q6BBF0-8877-4EDF-8C8C-99CBS93FF");

        //capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\alitu\\IdeaProjects\\AppiumPractice\\src\\main\\resources\\ApiDemos-debug.apk");
        String appUrl=System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"UIKitCatalog-iphonesimulator.app";
        capabilities.setCapability(MobileCapabilityType.APP,appUrl);

        //  URL url=new URL("http://0.0.0.0:4723/wd/hub"); --> normally we use this line but I pass in command line 'appium --base-path /wd/hub'
        URL url=new URL("http://0.0.0.0:4723");

        AppiumDriver driver=new IOSDriver(url,capabilities);


    }
}
