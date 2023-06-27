package activities.calendarApp2;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class TermsActivity {
    public Button checkBoxPolitica = new Button(By.id("com.calendar.schedule.event:id/BtnCheck"));
    public Button buttonContinue = new Button(By.id("com.calendar.schedule.event:id/actionContinue"));
    public Button buttonNext = new Button(By.id("com.calendar.schedule.event:id/tvAllowPermission"));
    public Button allowPermission = new Button(By.id("com.android.permissioncontroller:id/permission_allow_button"));
    public Button buttonContinueLanguage = new Button(By.id("com.calendar.schedule.event:id/actionContinue"));
}
