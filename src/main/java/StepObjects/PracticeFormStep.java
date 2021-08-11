package StepObjects;

import PageObjects.PracticeForm;

public class PracticeFormStep {
    PracticeForm practiceForm= new PracticeForm();
    public void ClickPracticeForm(){
        practiceForm.btnPracticeForm.click();
    }
}
