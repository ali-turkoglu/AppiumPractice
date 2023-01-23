import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class AndroidUiAutomator_NativeApps {
    //For native apps, please try to avoid using XPath. XPath is fragile, slow and bound to change with minor UI updates in the application. A single UI update and many XPaths will get impacted if not optimized.

    public static void main(String[] args) throws Exception {

        AppiumDriver driver= CreateDriverSession.initializeDriver("Android");

        WebElement myElement=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Accessibility\")"));
        //By myElement=AppiumBy.androidUIAutomator("new UiSelector().text(\"Accessibility\")");
        System.out.println("myElement: "+myElement.getText());
        myElement.click();

        WebElement myElement2=driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.TextView\")")).get(2);
        System.out.println("myElement2: "+myElement2.getText());

        //By myElement3=AppiumBy.androidUIAutomator("new UiSelector().clickable(\"true\")");
        WebElement myElement3=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().clickable(true)"));
        System.out.println("myElement3: "+myElement3.getText());

//        WebElement myElement4=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Accessibility\")"));
//        System.out.println("myElement4"+myElement4.getText());

        WebElement myElement5=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")"));
        System.out.println("myElement5: "+myElement5.getText());

//        WebElement accessibility = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
//        System.out.println(accessibility.getAttribute("resource-id"));
//
//        WebElement element2 = driver.findElements(AppiumBy.id("android:id/text1")).get(1);
//        System.out.println("id: "+element2.getText());
//
//        WebElement element4 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
//        System.out.println("xpath: "+element4.getText());
    }
}
