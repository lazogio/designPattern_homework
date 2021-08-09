import DataObjects.models.ClientData;
import StepObjects.Checkinfo;
import StepObjects.ConfigSteps;
import StepObjects.FormStep;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class FillForm {
    @BeforeTest
    public void setUp(){
        ConfigSteps configSteps=new ConfigSteps();
        configSteps.init();
        open("https://demoqa.com/");
    }
    @Test
    public void UserRegistration(){
        ClientData clientData =new ClientData();
        FormStep formStep = new FormStep();
        Checkinfo checkinfo= new Checkinfo();
        formStep.ClickForm();
        formStep.ClickPracticeForm();
        formStep.firstName(clientData.firstName);
        formStep.lastName(clientData.lastName);
        formStep.gender(clientData.gender);
        formStep.phone(clientData.Phone);
        checkinfo.clickSubmit();
        checkinfo.CheckSubmit();
        checkinfo.CheckStudentInfo();
    }
    @AfterMethod
    public void closer(){closeWindow();}
}
