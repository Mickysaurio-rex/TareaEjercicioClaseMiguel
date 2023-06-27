package activities.calendarApp;
import controls.Button;
import controls.Label;
import org.openqa.selenium.By;
import controls.TextBox;
public class CreateMeetActivity {
    public TextBox tittleMeet = new TextBox(By.id("com.samsung.android.calendar:id/title"));
    public Button saveMeet = new Button(By.id("com.samsung.android.calendar:id/add_app_bar_menu_done"));
}
