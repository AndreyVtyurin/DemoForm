import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;


public class FormTest extends AbstractForm { //Постоянно падает по тайм ауту. sleep не помогал.
    //Реализовал паттерны page object, page component, использовал бизнес метод.

    @Test
    //Заполнить поля валидными значениями, отправить форму, проверить отправку формы.
    public void testPositive(){
        BuisnessMethodForForm.createBuisnessMethod();
        PageFormResults pageFormResults = new PageFormResults();

    pageFormResults.ThanksTitle.shouldHave(Condition.text("Thanks for submitting the form"));
//    pageFormResults.ThanksList.shouldHave(Condition.text(""));

    }

    @Test
    //Нажать кнопку отправки формы без заполнения формы. Отправка формы не должна состояться.
    public void testNegative(){
        PageForm pageForm = new PageForm();
        PageFormResults pageFormResults = new PageFormResults();
        pageForm.clickSubmitButton();
        pageFormResults.ThanksTitle.shouldNotBe(visible);
    }
}
