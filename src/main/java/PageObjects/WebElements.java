package PageObjects;

import DataObjects.models.ClientData;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class WebElements {
    ClientData clientData = new ClientData();
    public SelenideElement
            Form = $(byXpath("//div[@class='category-cards']/div[2]")),
            PracticeForm = $(byXpath("//span[text()='Practice Form']")),
            firstName=$("#firstName"),
            lastName=$("#lastName"),
            Male=$(withText(clientData.gender)),
            Female=$(withText(clientData.gender)),
            Other=$(withText(clientData.gender)),
            phone=$("#userNumber"),

    submit=$("#submit"),
            submittingtheform=$("#example-modal-sizes-title-lg"),
            checkStudentName=$(byXpath("//td[contains(text(), 'Student Name')]/following-sibling::td")),
            checkgender=$(byXpath("//td[contains(text(), 'Gender')]/following-sibling::td")),
            checkphone=$(byXpath("//td[contains(text(), 'Mobile')]/following-sibling::td"));
}