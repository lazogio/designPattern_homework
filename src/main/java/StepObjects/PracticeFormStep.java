package StepObjects;

import PageObjects.PageFactoryAndFluent.FormPage;
import PageObjects.PageFactoryAndFluent.PracticeForm;
import org.openqa.selenium.WebDriver;

public class PracticeFormStep extends ConfigSteps {
//    PracticeForm practiceForm= new PracticeForm();
//    public void ClickPracticeForm(){
//        practiceForm.btnPracticeForm.click();
//    }
    PracticeForm practiceForm;
    public PracticeFormStep(WebDriver driver){
        super(driver);
        practiceForm = new PracticeForm(driver);
    }
    public PracticeFormStep ClickPracticeForm() {
        practiceForm.SubmittingtheForm.click();
        return  this;
    }


}
