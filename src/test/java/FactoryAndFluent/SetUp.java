package FactoryAndFluent;
import StepObjects.Checkinfo;
import StepObjects.FillPageStep;
import StepObjects.FormStep;
import StepObjects.PracticeFormStep;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class SetUp {
    FormStep formStep;
    PracticeFormStep practiceFormStep;
    FillPageStep fillPageStep;
    Checkinfo checkinfo;
    WebDriver driver;
    public SetUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        formStep= new FormStep(driver);
        practiceFormStep= new PracticeFormStep(driver);
        fillPageStep=new FillPageStep(driver);
        checkinfo=new Checkinfo(driver);
    }
    @AfterMethod
    public void closer(){
        driver.close();
    }
}
