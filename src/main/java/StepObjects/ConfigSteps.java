package StepObjects;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Configuration.timeout;

public class ConfigSteps {
    public void init (){
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = false;
        timeout=5000;
        Configuration.fastSetValue=true;
    }
}