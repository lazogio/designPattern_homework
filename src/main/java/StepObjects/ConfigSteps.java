package StepObjects;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Configuration.timeout;

public class ConfigSteps {
//    public void init (){
//        Configuration.startMaximized = true;
//        Configuration.holdBrowserOpen = false;
//        timeout=5000;
//        Configuration.fastSetValue=true;
//    }
    WebDriver driver;
    WebDriverWait WebDriverWait;
   public  ConfigSteps(WebDriver driver){
       this.driver=driver;
       WebDriverWait = new WebDriverWait(driver,5);
   }
}