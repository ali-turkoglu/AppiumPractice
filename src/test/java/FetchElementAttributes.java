import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class FetchElementAttributes {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver=CreateDriverSession.initializeDriver("Android");

        By accessibiity= AppiumBy.accessibilityId("Accessibility");
        System.out.println("text: "+ driver.findElement(accessibiity).getText());
        System.out.println("text: "+driver.findElement(accessibiity).getAttribute("text"));
        System.out.println("package: "+driver.findElement(accessibiity).getAttribute("package"));
        System.out.println("checked: "+driver.findElement(accessibiity).getAttribute("checked"));
        System.out.println("displayed: "+driver.findElement(accessibiity).getAttribute("displayed"));

        System.out.println("selected: "+driver.findElement(accessibiity).isSelected());
        System.out.println("enabled: "+driver.findElement(accessibiity).isEnabled());
        System.out.println("displayed: "+driver.findElement(accessibiity).isDisplayed());
    }
}
