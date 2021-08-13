package StepObjects;
import DataObjects.models.ClientData;
import PageObjects.PageFactoryAndFluent.PopUpPage;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class Checkinfo extends ConfigSteps {
//    PopUpPage popUpPage =new PopUpPage();
//    ClientData clientData =new ClientData();
//    FillFormPage fillFormPage= new FillFormPage();
//    public void clickSubmit(){
//        fillFormPage.submit.scrollTo().click();
//    }
//    public void CheckSubmit(){
//        Assert.assertEquals(popUpPage.submittingtheform.getText(),"Thanks for submitting the form");
//    }
//    public void CheckStudentInfo(){
//        Assert.assertEquals(popUpPage.checkStudentName.getText()
//                ,"Giorgi Lazareshvili","Not Validate the Student Name");
//        Assert.assertEquals(popUpPage.checkgender.getText()
//                , clientData.gender,"Not Validate the Student Gender");
//        Assert.assertEquals(popUpPage.checkphone.getText(), clientData.Phone
//                ,"Not Validate the Student phone");
//    }
    PopUpPage popUpPage;
public  Checkinfo(WebDriver driver){
    super((driver));
    popUpPage=new PageObjects.PageFactoryAndFluent.PopUpPage(driver);
}
    @Feature("Submitting Text")
    @Story("Check Submiting Text")
    @Description("Check Submiting Text")
    public  Checkinfo CheckSubmit(){
        Assert.assertEquals(popUpPage.SubmittingtheForm.getText(),"Thanks for submitting the form");
        return this;
    }
    ClientData clientData= new ClientData();
    @Epic("Stundent Infromation")
    @Story("Check StudentInfo")
    @Description("Check StudentInfo")
    public  Checkinfo CheckStudentInfo(){
                Assert.assertEquals(popUpPage.checkStudentName.getText()
                ,"Giorgi Lazareshvili","Not Validate the Student Name");
        Assert.assertEquals(popUpPage.CheckGender.getText()
                , clientData.gender,"Not Validate the Student Gender");
        Assert.assertEquals(popUpPage.CheckPhone.getText(), clientData.Phone
                ,"Not Validate the Student phone");
        return this;
    }
}