package basicAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class WhenDoTest {

    AppiumDriver appiumDriver;
    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "S20 de Miguel");
        capabilities.setCapability("platformVersion", "13");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity", "com.vrproductiveapps.whendo.ui.HomeActivity");
        appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @AfterEach
    public void closeApp(){
        appiumDriver.quit();
    }

    @Test
    public void verifySomeThing() throws InterruptedException {
        appiumDriver.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();
        appiumDriver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys("Miguel");
        appiumDriver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys("Miguel");
        appiumDriver.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();

        String expectedResult = "Miguel";
        String actualResult = appiumDriver.findElement(By.id("com.vrproductiveapps.whendo:id/home_list_item_text")).getText();
        Assertions.assertEquals(expectedResult,actualResult,"ERROR la nota no se creo!");

        Thread.sleep(5000);
    }
}
