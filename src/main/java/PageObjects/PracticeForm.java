package PageObjects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PracticeForm {
        public SelenideElement btnPracticeForm= $(byXpath("//span[text()='Practice Form']"));
}
