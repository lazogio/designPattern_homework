package FactoryAndFluent;
import DataObjects.models.ClientData;
import StepObjects.Checkinfo;
import StepObjects.FillPageStep;
import StepObjects.FormStep;
import StepObjects.PracticeFormStep;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

public class SetUp {
    FormStep formStep;
    PracticeFormStep practiceFormStep;
    FillPageStep fillPageStep;
    Checkinfo checkinfo;
    ClientData clientData =new ClientData();
    static WebDriver driver;
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
    public static WebDriver getDriver() {
        return driver;
    }
    @AfterClass
    public void closer(){
        driver.close();
    }
}
