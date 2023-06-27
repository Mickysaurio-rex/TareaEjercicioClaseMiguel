package activities.calendarApp2;

import controls.Button;
import org.openqa.selenium.By;

public class MainActivity {
    public Button newEventButton = new Button(By.id("com.calendar.schedule.event:id/sd_main_fab"));
    public Button eventButton = new Button(By.id("//android.widget.ImageButton[@content-desc=\"Event\"]"));

}
