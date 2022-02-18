import com.codeborne.selenide.Configuration;
import model.PracticeFormViewModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.AutomationPracticeFormPage;

public class BaseTest {

    @BeforeEach
    public void beforeEach() {
        System.out.println("before");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after");
    }

    AutomationPracticeFormPage automationPracticeFormPage = new AutomationPracticeFormPage();
    PracticeFormViewModel form = new PracticeFormViewModel();

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = false;
        Configuration.browserSize = "1920x1080";
    }
}