package activities.calendarApp2;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class EventCreateActivity {
    public TextBox tittleEvent = new TextBox(By.id("com.calendar.schedule.event:id/addTitle"));
    public Button saveEventButton = new Button(By.id("com.calendar.schedule.event:id/saveEvent"));
    public Button buttonLateral = new Button(By.id("com.calendar.schedule.event:id/icBack"));
    public Label eventSection = new Label(By.id("//android.widget.CheckedTextView[@text='Event']"));

}
