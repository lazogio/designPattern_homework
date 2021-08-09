package StepObjects;

import DataObjects.models.ClientData;
import DataObjects.models.ClientData;
import PageObjects.WebElements;
import org.testng.Assert;
public class Checkinfo {
    WebElements webElements =new WebElements();
    ClientData clientData =new ClientData();

    public void clickSubmit(){
        webElements.submit.scrollTo().click();
    }
    public void CheckSubmit(){
        Assert.assertEquals(webElements.submittingtheform.getText(),"Thanks for submitting the form");
    }
    public void CheckStudentInfo(){
        Assert.assertEquals(webElements.checkStudentName.getText(),"Giorgi Lazareshvili","Validate the Student Name");
        Assert.assertEquals(webElements.checkgender.getText(), clientData.gender,"Validate the Student Gender");
        Assert.assertEquals(webElements.checkphone.getText(), clientData.Phone,"Validate the Student phone");
    }
}
