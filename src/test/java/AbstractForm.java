import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public abstract class AbstractForm {
    @BeforeEach
    public void setUp() {

        Selenide.open("https://demoqa.com/automation-practice-form");
//
    }

    @AfterEach
    public void tearDown() {
    }
}
