package PageObjects.PageFactoryAndFluent;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeForm {
    WebDriver driver;
    @FindBy(xpath ="//span[text()='Practice Form']")
    public WebElement SubmittingtheForm;
    public PracticeForm(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
}
