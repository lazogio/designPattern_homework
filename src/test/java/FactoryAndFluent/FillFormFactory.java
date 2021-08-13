package FactoryAndFluent;
import org.testng.annotations.Test;
public class FillFormFactory extends SetUp {
    @Test
     public void UserRegistration(){
        formStep
                .ClickbtnForm();
        practiceFormStep
                .ClickPracticeForm();
        fillPageStep
                .setFirstName()
                .setLastName()
                .setGender()
                .setPhone()
                .setSubmitbtn();
        checkinfo
                .CheckSubmit()
                .CheckStudentInfo();
    }
}
