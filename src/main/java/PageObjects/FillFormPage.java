package PageObjects;

import DataObjects.models.ClientData;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class FillFormPage {
    ClientData clientData = new ClientData();
    public SelenideElement
            firstName=$("#firstName"),
            lastName=$("#lastName"),
            Male=$(withText(clientData.gender)),
            Female=$(withText(clientData.gender)),
            Other=$(withText(clientData.gender)),
            phone=$("#userNumber"),
            submit=$("#submit");
}
