package FactoryAndFluent;
import io.qameta.allure.*;
import org.testng.annotations.Test;
@Epic("FillFormFactory ")
@Feature("FillFormFactory Steps")
public class FillFormFactory extends SetUp {
    @Test(description = "Test Case UserRegistration")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Check UserRegistration")
    @Step("Registration Step")
    @Description("Test Case UserRegistration")
     public void UserRegistration(){
        formStep
                .ClickbtnForm();
        practiceFormStep
                .ClickPracticeForm();
        fillPageStep
                .setFullName(clientData.firstName, clientData.lastName)
                .setGender()
                .setPhone()
                .setSubmitbtn();
        checkinfo
                .CheckSubmit()
                .CheckStudentInfo();
    }
}
