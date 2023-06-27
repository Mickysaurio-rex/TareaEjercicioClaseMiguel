package activities.clockApp;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class AlarmPage {
    public Label selectNameAlarmField = new Label(By.id("com.sec.android.app.clockpackage:id/alarm_name_input_layout"));
    public TextBox nameAlarmBox = new TextBox(By.id("com.sec.android.app.clockpackage:id/alarm_name"));
    public Button saveAlarmButton = new Button(By.xpath("//android.widget.Button[@content-desc=\"Guardar\"]/android.view.ViewGroup/android.widget.TextView"));

}
