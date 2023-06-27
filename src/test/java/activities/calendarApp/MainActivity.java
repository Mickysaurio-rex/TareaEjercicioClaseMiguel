package activities.calendarApp;
import controls.Button;
import controls.Label;
import org.openqa.selenium.By;


public class MainActivity {
    public Label selectDay;
    public void setDay(String fecha){
        selectDay =  new Label(By.xpath("//android.view.View[@text='"+fecha+"']"));
    }

    public Label nameMeet;
    public void setnameMeet(String nombre){
        nameMeet =  new Label(By.xpath("//android.widget.TextView[@text = "+nombre+"]"));
    }

    public Button menuLateral = new Button(By.id("com.samsung.android.calendar:id/open_drawer"));
    public Button dayAreaButton = new Button(By.xpath("//android.widget.RelativeLayout[contains(@content-desc,\"Vista de\")]"));
}
