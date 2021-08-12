package PageObjects.PageFactoryAndFluent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeForm {
    WebDriver driver;
//    @FindBy(xpath ="//span[text()='Practice Form']")
//    WebElement submittingtheform;
//
//    public PracticeForm(WebDriver driver){PageFactory.initElements(driver, this);}
//    public void PracticeForClick(){
//        submittingtheform.click();
//    }
//        ----------Fluent Ap-----------
    public PracticeForm (WebDriver driver){
        this.driver=driver;
    }
    By submittingtheform= By.xpath("//span[text()='Practice Form']");
    public PracticeForm  PracticeForClick(){
        driver.findElement(submittingtheform).click();
        return this;
    }
}
