import com.codeborne.selenide.Configuration;
import model.PracticeFormViewModel;
import org.junit.jupiter.api.BeforeAll;
import pages.AutomationPracticeFormPage;

public class BaseTest {

    AutomationPracticeFormPage automationPracticeFormPage = new AutomationPracticeFormPage();
    PracticeFormViewModel form = new PracticeFormViewModel();

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = false;
        Configuration.browserSize = "1920x1080";
    }
}