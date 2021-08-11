package PageObjects;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class FormPage {
    public SelenideElement btnForm= $(byXpath("//div[@class='category-cards']/div[2]"));
}
