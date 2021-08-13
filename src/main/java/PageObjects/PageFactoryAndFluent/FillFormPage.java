package PageObjects.PageFactoryAndFluent;
import DataObjects.models.ClientData;
import StepObjects.ConfigSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
public class FillFormPage  {
    WebDriver driver;
    public FillFormPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="firstName")
    public WebElement firstName;
    @FindBy(id="lastName")
    public WebElement lastName;
    @FindBy(xpath ="//label[text()='Male']")
    public WebElement Male;
    @FindBy(xpath = "//label[text()='Female']")
    public WebElement Female;
    @FindBy(xpath="//label[text()='Other']")
    public WebElement Other;
    @FindBy(id ="userNumber")
    public WebElement phone;
    @FindBy(id ="submit")
    public WebElement submitbtn;
}
