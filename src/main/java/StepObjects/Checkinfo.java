package StepObjects;
import DataObjects.models.ClientData;
import PageObjects.FillFormPage;
import PageObjects.PopUpPage;
import org.testng.Assert;
public class Checkinfo {
    PopUpPage popUpPage =new PopUpPage();
    ClientData clientData =new ClientData();
    FillFormPage fillFormPage= new FillFormPage();
    public void clickSubmit(){
        fillFormPage.submit.scrollTo().click();
    }
    public void CheckSubmit(){
        Assert.assertEquals(popUpPage.submittingtheform.getText(),"Thanks for submitting the form");
    }
    public void CheckStudentInfo(){
        Assert.assertEquals(popUpPage.checkStudentName.getText(),"Giorgi Lazareshvili","Not Validate the Student Name");
        Assert.assertEquals(popUpPage.checkgender.getText(), clientData.gender,"Not Validate the Student Gender");
        Assert.assertEquals(popUpPage.checkphone.getText(), clientData.Phone,"Not Validate the Student phone");
    }
}