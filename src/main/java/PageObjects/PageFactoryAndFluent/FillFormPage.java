package PageObjects.PageFactoryAndFluent;
import DataObjects.models.ClientData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class FillFormPage {
    WebDriver driver;
//    public FillFormPage(WebDriver driver){
//        this.driver=driver;
//        PageFactory.initElements(new AjaxElementLocatorFactory(driver,20), this);
//    }
    ClientData clientData= new ClientData();
//    @FindBy(id="firstName")
//    WebElement firstName;
//    @FindBy(id="lastName")
//    WebElement lastName;
//    @FindBy(xpath ="//label[text()='Male']")
//    WebElement gender;
//    @FindBy(id ="userNumber")
//    WebElement phone;
//    @FindBy(id ="submit")
//    WebElement submitbtn;
//
//
//    public void setFirstName(){
//        firstName.sendKeys(clientData.firstName);
//    }
//    public void setLastName(){
//        lastName.sendKeys(clientData.lastName);
//    }
//    public void setGender(){
//        gender.click();
//    }
//    public void setPhone(){
//        phone.sendKeys(clientData.Phone);
//    }
//    public void setSubmitbtn(){
//        WebElement submitbnt1 = driver.findElement(By.id("submit"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", submitbnt1);
//        submitbtn.click();
//    }

//        ----------Fluent Ap-----------
    By submitbtn= By.id("submit");
    By firstName1 = By.id("firstName");
    By lastName = By.id("lastName");
    By gender = By.xpath("//label[text()='Male']");
    By phone = By.id("userNumber");

    public FillFormPage(WebDriver driver){
        this.driver=driver;
    }

    public FillFormPage setFirstName(){
       driver.findElement(firstName1).sendKeys(clientData.firstName);
       return this;
    }
    public FillFormPage setLastName(){
        driver.findElement(lastName).sendKeys(clientData.lastName);
        return this;
    }
    public FillFormPage setGender(){
        driver.findElement(gender).click();
        return this;
    }
    public FillFormPage setPhone(){
        driver.findElement(phone).sendKeys(clientData.Phone);
        return this;
    }
    public FillFormPage setSubmitbtn(){
        WebElement submitbnt1 = driver.findElement(submitbtn);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", submitbnt1);
        submitbnt1.click();
        return this;
    }
}
