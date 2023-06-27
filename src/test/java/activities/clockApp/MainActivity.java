package activities.clockApp;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class MainActivity {
    public Button createAlarmButton = new Button(By.id("com.sec.android.app.clockpackage:id/menu_alarm_add"));
    public Label nameAlarmField;

    public void setNameAlarmField(String name){
        nameAlarmField = new Label(By.xpath("//android.view.ViewGroup//android.widget.TextView[contains(@text,"+name+")]"));
    }

}
