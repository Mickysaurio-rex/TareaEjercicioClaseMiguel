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
import java.time.Duration;

public class CalculatorXPathTest {
    AppiumDriver appiumDriver;
    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "S20 de Miguel");
        capabilities.setCapability("platformVersion", "13");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
        appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    public void closeApp(){
        appiumDriver.quit();
    }

    @Test
    public void verifyAdditionTest() throws InterruptedException {
        //click 4 button
        appiumDriver.findElement(By.xpath("//android.widget.Button[@content-desc=\"4\"]")).click();
        //click + button
        appiumDriver.findElement(By.xpath("//android.widget.Button[@text='+']")).click();
        //click 3 button
        appiumDriver.findElement(By.xpath("//android.widget.Button[@content-desc=\"3\"]")).click();
        //click = button
        appiumDriver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Igual\"]")).click();

        //verification total
        Thread.sleep(5000);
        String expectedResult = "7";
        String actualResult = appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'id/calc_edt_formula')]")).getText();
        Assertions.assertTrue(actualResult.contains(expectedResult),"ERROR la suma es incorrecta!");

    }
}

