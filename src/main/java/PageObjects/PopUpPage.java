package PageObjects;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PopUpPage {
    public SelenideElement
            submittingtheform=$("#example-modal-sizes-title-lg"),
            checkStudentName=$(byXpath("//td[contains(text(), 'Student Name')]/following-sibling::td")),
            checkgender=$(byXpath("//td[contains(text(), 'Gender')]/following-sibling::td")),
            checkphone=$(byXpath("//td[contains(text(), 'Mobile')]/following-sibling::td"));
}