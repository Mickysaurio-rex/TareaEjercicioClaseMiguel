package activities.contactApp;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class MainActivity {

    public Button permissionButton = new Button(By.id("com.android.permissioncontroller:id/permission_allow_button"));
    public Button createContact = new Button(By.id("com.samsung.android.app.contacts:id/menu_create_contact"));
    public TextBox nameContact = new TextBox(By.id("com.samsung.android.app.contacts:id/nameEdit"));
    public Label selectNumberArea = new Label(By.id("com.samsung.android.app.contacts:id/titleLayout"));
    public TextBox numberContact = new TextBox(By.xpath("//android.widget.EditText[contains(@text,'Tel')]"));
    public Button selectType = new Button(By.xpath("//android.widget.TextView[contains(@text,'SIM')]"));
    public Button saveContact = new Button(By.id("com.samsung.android.app.contacts:id/menu_done"));

    public Label contact;
    public void setContact(String name){
        contact=new Label(By.xpath("//android.widget.TextView[@content-desc="+ name +"]"));
    }



}
