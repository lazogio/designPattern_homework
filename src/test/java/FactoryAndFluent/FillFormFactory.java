package FactoryAndFluent;

import DataObjects.models.ClientData;
import PageObjects.PageFactoryAndFluent.FillFormPage;
import PageObjects.PageFactoryAndFluent.FormPage;
import PageObjects.PageFactoryAndFluent.PracticeForm;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class FillFormFactory {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void applyAsDeveloper() {
        PageObjects.PageFactoryAndFluent.FormPage formPage = new FormPage(driver);
        formPage.clickForm();
        PracticeForm practiceForm = new PracticeForm(driver);
        practiceForm.PracticeForClick();
        FillFormPage fillFormPage = new FillFormPage(driver);
//        ----------Factory-----------
//        fillFormPage.setFirstName();
//        fillFormPage.setLastName();
//        fillFormPage.setGender();
//        fillFormPage.setPhone();
//        fillFormPage.setSubmitbtn();

//        ----------Fluent Ap-----------
        fillFormPage.setFirstName()
                .setLastName()
                .setGender()
                .setGender()
                .setPhone()
                .setSubmitbtn();
        ClientData clientData = new ClientData();
        String submittingtheform = driver.findElement(By.id("example-modal-sizes-title-lg")).getText();
        String CheckstudentName = driver.findElement(By.xpath("//td[contains(text(), 'Student Name')]/following-sibling::td")).getText();
        String checkgender = driver.findElement(By.xpath("//td[contains(text(), 'Gender')]/following-sibling::td")).getText();
        String checkphone = driver.findElement(By.xpath("//td[contains(text(), 'Mobile')]/following-sibling::td")).getText();

        Assert.assertEquals(submittingtheform,"Thanks for submitting the form");
        Assert.assertEquals(CheckstudentName,"Giorgi Lazareshvili","Not Validate the Student Name");
        Assert.assertEquals(checkgender, clientData.gender,"Not Validate the Student Gender");
        Assert.assertEquals(checkphone, clientData.Phone,"Not Validate the Student phone");
    }
    @AfterClass
    public void close(){
        driver.close();
    }
}
