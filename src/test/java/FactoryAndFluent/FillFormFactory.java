package FactoryAndFluent;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Config.class)
@Epic("FillFormFactory ")
@Feature("FillFormFactory Steps")
public class FillFormFactory extends SetUp {
    @Flaky
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
                .CheckStudentInfo();
    }
    @Flaky
    @Test(description = "Check Submiting Text")
    @Severity(SeverityLevel.NORMAL)
    @Story(" Check Submiting Text")
    @Step("Check Submiting Text Step")
    @Description("Check Submiting Text")
    public void check(){
        checkinfo
                .CheckSubmit();
    }
}
