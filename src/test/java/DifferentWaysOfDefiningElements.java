import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DifferentWaysOfDefiningElements {

    @AndroidFindBy(id= "android:id/text1")
    private static WebElement myElementA;

    public DifferentWaysOfDefiningElements(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public static void main(String[] args) throws Exception {

        AppiumDriver driver=CreateDriverSession.initializeDriver("Android");

//
//        DifferentWaysOfDefiningElements differentWaysOfDefiningElements=new DifferentWaysOfDefiningElements(driver);
//        System.out.println(myElementA.getText());

        WebElement myElement=driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        System.out.println(myElement.getText());

        By element3= AppiumBy.accessibilityId("Accessibility");
        System.out.println(driver.findElement(element3).getText());

//        WebElement myElement3=driver.findElement(AppiumBy.xpath("//*[test()='Accessibility']"));
//        System.out.println(myElement3.getText());

//        By myElement2=By.xpath("//*[@test=\"Accessibility\"]");
//        System.out.println(driver.findElement(myElement2).getText());



    }

}
