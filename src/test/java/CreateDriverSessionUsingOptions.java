import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CreateDriverSessionUsingOptions {

    public static void main(String[] args) throws MalformedURLException {

        String appUrl=System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"ApiDemos-debug.apk";

        UiAutomator2Options options=new UiAutomator2Options()
                .setDeviceName("Pixel 5")
                .setAutomationName("UiAutomator2")
                .setUdid("emulator-5554")
                .setAvd("Pixel_5")
                .setAvdLaunchTimeout(Duration.ofSeconds(18))
                //.setApp(appUrl);
                .setAppPackage("io.appium.android.apis")
                .setAppActivity("io.appium.android.apis.ApiDemos");

        // To get appPackage and appActivity paths pass the command from terminal-->  adb shell "dumpsys activity activities | grep mResumedActivity"

        URL url=new URL("http://0.0.0.0:4723");
        AppiumDriver driver=new AndroidDriver(url,options);
    }
}
