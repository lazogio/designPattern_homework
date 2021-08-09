package StepObjects;

import PageObjects.WebElements;

public class FormStep {

    WebElements webElements= new WebElements();
    public void ClickForm(){
        webElements.Form.click();
    }
    public void ClickPracticeForm(){
        webElements.PracticeForm.click();
    }
    public void firstName(String firstName){
        webElements.firstName.setValue(firstName);
    }
    public void lastName(String lastName){webElements.lastName.setValue(lastName);}
    public void gender(String gender){
        switch (gender) {
            case "Male" -> webElements.Male.click();
            case "Female" -> webElements.Female.click();
            case "Other" -> webElements.Other.click();
        }
    }
    public void phone(String phone){webElements.phone.setValue(phone);}
}
