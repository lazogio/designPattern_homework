package PageObjects.PageFactoryAndFluent;

import StepObjects.ConfigSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage extends ConfigSteps {
    @FindBy(xpath= "//div[@class='category-cards']/div[2]")
   public WebElement FromBtn;
    public FormPage(WebDriver driver){
        super(driver);
        driver.get("https://demoqa.com/");
        PageFactory.initElements(driver, this);
    }
 //   public void clickForm(){FromBtn.click();}
}
