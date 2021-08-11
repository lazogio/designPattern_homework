package StepObjects;

import PageObjects.FormPage;

public class FormStep {
    FormPage formPage =new FormPage();
    public void ClickForm(){formPage.btnForm.click();}
}
