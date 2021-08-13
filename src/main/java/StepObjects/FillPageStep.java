package StepObjects;

import DataObjects.models.ClientData;
import PageObjects.PageFactoryAndFluent.FillFormPage;
import io.qameta.allure.Step;
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
    @Step("Set firstName")
    public FillPageStep setFullName(String firstName,String lastName){
       fillFormPage.firstName.sendKeys(clientData.firstName);
       fillFormPage.lastName.sendKeys(clientData.lastName);
        return this;
    }
    @Step("Set LastName")
    public FillPageStep setLastName(){

        return this;
    }
    @Step("Select  Gender")
    public  FillPageStep setGender(){
        if (clientData.gender=="Male"){
            fillFormPage.Male.click();
        }else if(clientData.gender=="Female"){
            fillFormPage.Female.click();
        }else if (clientData.gender=="Other"){
            fillFormPage.Other.click();
        }
        return  this;
    }
    @Step("SetPhone")
    public FillPageStep setPhone(){
        fillFormPage.phone.sendKeys(clientData.Phone);
        return this;
    }
    @Step("Click SubmitBtn")
    public FillPageStep setSubmitbtn(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", fillFormPage.submitbtn);
        js.executeScript("arguments[0].click();", fillFormPage.submitbtn);
        return this;
    }
}
