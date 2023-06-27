package activities.calendarApp;

import controls.Label;
import org.openqa.selenium.By;

public class EventsActivity {
    public Label recentEvent;
    public void setRecentEvent(String name){
        recentEvent = new Label(By.xpath("//android.widget.TextView[@text='"+name+"']"));
    }
}
