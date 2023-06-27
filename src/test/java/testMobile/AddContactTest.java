package testMobile;

import activities.contactApp.MainActivity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class AddContactTest {

    MainActivity mainActivity = new MainActivity();

    @Test
    public void verifyAdditionTest() {
        mainActivity.permissionButton.click();
        mainActivity.createContact.click();
        mainActivity.selectType.click();
        mainActivity.nameContact.setText("MiguelPrueba");
        mainActivity.selectNumberArea.click();
        mainActivity.numberContact.setText("12121212");
        mainActivity.saveContact.click();
        mainActivity.setContact("MiguelPrueba");

        Assertions.assertEquals("MiguelPrueba",mainActivity.contact.getText(),"ERROR, no se creo el contacto");
    }

    @AfterEach
    public void close() {
        Session.getSession().closeSession();
    }
}
