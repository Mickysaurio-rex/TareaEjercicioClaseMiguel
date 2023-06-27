package testMobile;

import activities.clockApp.AlarmPage;
import activities.clockApp.MainActivity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class CreateAlarmtest {
    MainActivity mainActivity = new MainActivity();
    AlarmPage alarmPage = new AlarmPage();
    @Test
    public void verifyAdditionTest() throws InterruptedException {
        mainActivity.createAlarmButton.click();
        alarmPage.selectNameAlarmField.click();
        alarmPage.nameAlarmBox.setText("PruebaMiguel");
        alarmPage.saveAlarmButton.click();

        Thread.sleep(10000);
        mainActivity.setNameAlarmField("PruebaMiguel");


        Assertions.assertEquals("PruebaMiguel",mainActivity.nameAlarmField.getText(),"ERROR, no se creo el contacto");
    }

    @AfterEach
    public void close() {
        Session.getSession().closeSession();
    }
}

