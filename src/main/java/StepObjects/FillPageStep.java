package StepObjects;

import PageObjects.FillFormPage;

public class FillPageStep {
    FillFormPage fillFormPage = new FillFormPage();
    public void firstName(String firstName){fillFormPage.firstName.setValue(firstName);}
    public void lastName(String lastName){fillFormPage.lastName.setValue(lastName);}
    public void gender(String gender){
        switch (gender) {
            case "Male" -> fillFormPage.Male.click();
            case "Female" -> fillFormPage.Female.click();
            case "Other" -> fillFormPage.Other.click();
        }
    }
    public void phone(String phone){fillFormPage.phone.setValue(phone);}
}
