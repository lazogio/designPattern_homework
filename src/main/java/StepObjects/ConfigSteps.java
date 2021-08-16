package StepObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfigSteps {
/*    public void init (){
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = false;
        timeout=5000;
        Configuration.fastSetValue=true;
    }*/
    WebDriver driver;
    WebDriverWait WebDriverWait;
   public  ConfigSteps(WebDriver driver){
       this.driver=driver;
       WebDriverWait = new WebDriverWait(driver,5);
   }

}