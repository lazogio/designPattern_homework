package PageObjects.PageFactoryAndFluent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopUpPage {
    WebDriver driver;
    public PopUpPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="example-modal-sizes-title-lg")
    public WebElement SubmittingtheForm;
    @FindBy(xpath="//td[contains(text(), 'Student Name')]/following-sibling::td")
    public WebElement checkStudentName;
    @FindBy(id="//td[contains(text(), 'Gender')]/following-sibling::td")
    public WebElement CheckGender;
    @FindBy(xpath="//td[contains(text(), 'Mobile')]/following-sibling::td")
    public WebElement CheckPhone;
}
