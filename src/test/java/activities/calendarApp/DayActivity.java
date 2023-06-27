package activities.calendarApp;

import controls.Label;
import org.openqa.selenium.By;

public class DayActivity {
    public Label eventToDay;
    public void setEventToDay(String name){
        eventToDay = new Label(By.xpath("//android.view.View[contains(@content-desc,'"+name+"')]"));
    }
}
