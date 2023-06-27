package activities.calculatorApp;
import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class MainActivity {
    public Button fourButton = new Button(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_04"));
    public Button threeButton = new Button(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03"));
    public Button addButton = new Button(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
    public Button equalButton = new Button(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
    public Label resultLabel = new Label(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));

}
