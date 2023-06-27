package basicAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AddContactTest {

    AppiumDriver appiumDriver;
    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "S20 de Miguel");
        capabilities.setCapability("platformVersion", "13");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.samsung.android.app.contacts");
        capabilities.setCapability("appActivity", "com.samsung.android.contacts.contactslist.PeopleActivity");
        appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @AfterEach
    public void closeApp(){
        appiumDriver.quit();
    }

    @Test
    public void verifySomeThing() throws InterruptedException {

        String name = "MiguelPruebaTest";

        appiumDriver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();

        appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'SIM')]")).click();
        appiumDriver.findElement(By.xpath("com.samsung.android.app.contacts:id/menu_create_contact")).click();
        appiumDriver.findElement(By.id("com.samsung.android.app.contacts:id/nameEdit")).sendKeys(name);
        appiumDriver.findElement(By.id("com.samsung.android.app.contacts:id/titleLayout")).click();
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Tel')]")).sendKeys("121212");
        appiumDriver.findElement(By.id("com.samsung.android.app.contacts:id/menu_done")).click();



        Thread.sleep(5000);
    }
}
