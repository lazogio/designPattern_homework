package StepObjects;
import PageObjects.PageFactoryAndFluent.FormPage;
import org.openqa.selenium.WebDriver;

public class FormStep extends ConfigSteps{
//    FormPage formPage =new FormPage();
//    public void ClickForm(){formPage.btnForm.click();}
    FormPage formPage;
    public FormStep(WebDriver driver){
        super(driver);
        formPage = new FormPage(driver);
    }
    public FormStep ClickbtnForm() {
        formPage.FromBtn.click();
        return  this;
    }
}
