//import DataObjects.models.ClientData;
//import StepObjects.*;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import static com.codeborne.selenide.Selenide.*;
//
//public class FillForm {
//    @BeforeTest
//    public void setUp(){
//        ConfigSteps configSteps=new ConfigSteps();
//        configSteps.init();
//        open("https://demoqa.com/");
//    }
//    @Test
//    public void UserRegistration(){
//        ClientData clientData =new ClientData();
//        FormStep formStep = new FormStep();
//        PracticeFormStep practiceFormStep =new PracticeFormStep();
//        FillPageStep fillPageStep=new FillPageStep();
//        formStep.ClickForm();
//        practiceFormStep.ClickPracticeForm();
//        Checkinfo checkinfo= new Checkinfo();
//
//        fillPageStep.firstName(clientData.firstName);
//        fillPageStep.lastName(clientData.lastName);
//        fillPageStep.gender(clientData.gender);
//        fillPageStep.phone(clientData.Phone);
//
//        checkinfo.clickSubmit();
//        checkinfo.CheckSubmit();
//        checkinfo.CheckStudentInfo();
//    }
//    @AfterMethod
//    public void closer(){closeWindow();}
//}
