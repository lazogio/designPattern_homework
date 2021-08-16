package FactoryAndFluent;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Config.class)
@Epic("FillFormFactory ")
@Feature("FillFormFactory Steps")
public class FillFormFactory extends SetUp {
    @Flaky
    @Test(description = "Test Case UserRegistration",priority = 1)
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
    @Flaky()
    @Feature("Check Submiting Text")
    @Test(description = "Check Submiting Text",priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Story(" Check Submiting Text")
    @Step("Check Submiting Text Step")
    @Description("Check Submiting Text")
    public void check(){
        checkinfo
                .CheckSubmit();
    }
    @Flaky()
    @Feature("Skip Test")
    @Test(description = "Skip Test",priority = 3)
    @Severity(SeverityLevel.NORMAL)
    @Story("Skipping The Test Method ")
    @Step("Skipping The Test Method  Step")
    @Description("Skipping The Test Method ")
    public void SkipTest() {
        throw new SkipException("Skipping The Test Method ");
    }
}
