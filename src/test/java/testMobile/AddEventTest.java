package testMobile;

import activities.calendarApp.CreateMeetActivity;
import activities.calendarApp.DayActivity;
import activities.calendarApp.MainActivity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class AddEventTest {
    MainActivity mainActivity = new MainActivity();
    CreateMeetActivity createMeetActivity = new CreateMeetActivity();
    DayActivity dayActivity = new DayActivity();

    @Test
    public void verifyAdditionTest() {

        String nameMeet = "Reunion2";
        mainActivity.setDay("2023-6-30");
        mainActivity.selectDay.click();
        mainActivity.selectDay.click();
        createMeetActivity.tittleMeet.setText(nameMeet);
        createMeetActivity.saveMeet.click();
        mainActivity.setnameMeet(nameMeet);
        mainActivity.menuLateral.click();
        mainActivity.dayAreaButton.click();
        dayActivity.setEventToDay(nameMeet);

        Assertions.assertTrue(dayActivity.eventToDay.isControlDisplayed(),"ERROR, no se creo el contacto");
    }
    @AfterEach
    public void close() {
        Session.getSession().closeSession();
    }
}
