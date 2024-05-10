package ui_tests_selenide;

import base.BaseTest;
import com.codeborne.selenide.Selenide;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.asserts.AssertGeneral;

import static com.codeborne.selenide.Condition.text;
import static web_elements.AlertsElements.*;

public class AlertsTest extends BaseTest {

    @Test
    @DisplayName("Тест для работы с алертом")
    @Description("Взаимодействие со всплывающими уведомлениями")
    public void alertsTest() {

//      1. Открыть http://the-internet.herokuapp.com/javascript_alerts
        openBrowser("http://the-internet.herokuapp.com/javascript_alerts");

//      2. Нажать на “Click for JS Alert”
        buttonAlert.click();

//      3. Получить и проверить что текст в алерте - I am a JS Alert
        Selenide.switchTo().alert();

        String textAlert = Selenide.switchTo().alert().getText();

        AssertGeneral.textMatch(textAlert, "I am a JS Alert");

//      4. Нажать кнопку “OK”
        Selenide.switchTo().alert().accept();

//      5. Проверить что алерт закрылся
        alertResult.shouldHave(text("You successfully clicked an alert"));

//      6. Нажать на “Click for JS Confirm”
        buttonConfirm.click();

//      7. Отказаться от алерта
        Selenide.switchTo().alert().dismiss();

//      8. Проверить что алерт закрылся
        alertResult.shouldHave(text("You clicked: Cancel"));

//      9. Нажать на Click for JS Prompt
        buttonPrompt.click();

//      10. Ввести текст “Hello World”
        Selenide.switchTo().alert().sendKeys("Hello World");

//      11. Нажать “ОК”
        Selenide.switchTo().alert().accept();

//      12. Проверить что на странице появился текст You entered: Hello World
        alertResult.shouldHave(text("You entered: Hello World"));
    }
}