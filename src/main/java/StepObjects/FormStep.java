package StepObjects;
import PageObjects.PageFactoryAndFluent.FormPage;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FormStep extends ConfigSteps{
//    FormPage formPage =new FormPage();
//    public void ClickForm(){formPage.btnForm.click();}
    FormPage formPage;
    public FormStep(WebDriver driver){
        super(driver);
        formPage = new FormPage(driver);
    }
    @Step("Click BtnForm")
    public FormStep ClickbtnForm() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();", formPage.FromBtn);
        executor.executeScript("arguments[0].click();", formPage.FromBtn);
        return  this;
    }
}

