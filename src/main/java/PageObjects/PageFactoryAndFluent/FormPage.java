package PageObjects.PageFactoryAndFluent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    WebDriver driver;
//    @FindBy(xpath= "//div[@class='category-cards']/div[2]")
//    WebElement FromBtn;
//    public FormPage(WebDriver driver){
//        driver.get("https://demoqa.com/");
//        PageFactory.initElements(driver, this);
//    }
//    public void clickForm(){FromBtn.click();}

//        ----------Fluent Ap-----------
    public FormPage(WebDriver driver){
        driver.get("https://demoqa.com/");
        this.driver=driver;
    }
    By submitbtn= By.xpath("//div[@class='category-cards']/div[2]");

    public FormPage clickForm(){
        driver.findElement(submitbtn).click();
        return this;
    }
}
