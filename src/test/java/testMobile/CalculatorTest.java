package testMobile;
import activities.calculatorApp.MainActivity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import session.Session;

public class CalculatorTest {

    MainActivity mainActivity = new MainActivity();

    @Test
    public void verifyAdditionTest() {
        mainActivity.fourButton.click();
        mainActivity.addButton.click();
        mainActivity.threeButton.click();
        mainActivity.equalButton.click();
        String expectedResult = "7";
        String actualResult = mainActivity.resultLabel.getText();
        Assertions.assertTrue(actualResult.contains(expectedResult),"ERROR la suma es incorrecta!");
    }

    @AfterEach
    public void close() {
        Session.getSession().closeSession();
    }
}