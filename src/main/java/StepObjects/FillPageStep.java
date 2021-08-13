package StepObjects;

import DataObjects.models.ClientData;
import PageObjects.PageFactoryAndFluent.FillFormPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FillPageStep extends ConfigSteps {
//    FillFormPage fillFormPage = new FillFormPage();
//    public void firstName(String firstName){fillFormPage.firstName.setValue(firstName);}
//    public void lastName(String lastName){fillFormPage.lastName.setValue(lastName);}
//    public void gender(String gender){
//        switch (gender) {
//            case "Male" -> fillFormPage.Male.click();
//            case "Female" -> fillFormPage.Female.click();
//            case "Other" -> fillFormPage.Other.click();
//        }
//    }
//    public void phone(String phone){fillFormPage.phone.setValue(phone);}
    FillFormPage fillFormPage;
    public FillPageStep(WebDriver driver){
        super(driver);
        fillFormPage = new FillFormPage(driver);
    }
    ClientData clientData = new ClientData();
    public FillPageStep setFirstName(){
       fillFormPage.firstName.sendKeys(clientData.firstName);
        return this;
    }
    public FillPageStep setLastName(){
        fillFormPage.lastName.sendKeys(clientData.lastName);
        return this;
    }
    public  FillPageStep setGender(){
        switch (clientData.gender) {
            case "Male" -> fillFormPage.Male.click();
            case "Female" -> fillFormPage.Female.click();
            case "Other" -> fillFormPage.Other.click();
        }
        return  this;
    }
    public FillPageStep setPhone(){
        fillFormPage.phone.sendKeys(clientData.Phone);
        return this;
    }
    public FillPageStep setSubmitbtn(){
        WebElement submitbnt1 = fillFormPage.submitbtn;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", submitbnt1);
        submitbnt1.click();
        return this;
    }
}
