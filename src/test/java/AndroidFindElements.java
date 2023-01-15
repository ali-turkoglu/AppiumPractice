import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class AndroidFindElements {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver= CreateDriverSession.initializeDriver("Android");

        WebElement accessibility = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        System.out.println(accessibility.getAttribute("resource-id"));

        WebElement element2 = driver.findElements(AppiumBy.id("android:id/text1")).get(1);
        System.out.println("id: "+element2.getText());

        WebElement element3 = driver.findElements(AppiumBy.className("android.widget.TextView")).get(2);
        System.out.println("className: "+element3.getText());

        WebElement element4 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
        System.out.println("xpath: "+element4.getText());

//        WebElement element5 = driver.findElement(AppiumBy.name("Accessibility")); // Name --> test attribute value
//        System.out.println(element5.getText());
//
//        WebElement element6 = driver.findElement(AppiumBy.name("Accessibility")); //TagName -> content-desc value in general
//        System.out.println(element6.getText());

    }
}
