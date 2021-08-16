package FactoryAndFluent;
import DataObjects.models.ClientData;
import StepObjects.Checkinfo;
import StepObjects.FillPageStep;
import StepObjects.FormStep;
import StepObjects.PracticeFormStep;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class SetUp  {
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

    public static WebDriver getDriver() {return driver;}
    @Story("Quit browser")
    @Step("Browser Close Step")
    @Description("Quit browser")
    @AfterClass(description = "Closer")
    public void closer(){
        driver.close();
        Reporter.log("Driver Closed After Testing");
    }
}
