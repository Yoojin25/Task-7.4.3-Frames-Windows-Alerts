package ui_tests_selenide;

import base.BaseTest;
import com.codeborne.selenide.Selenide;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.interactable;
import static com.codeborne.selenide.Selenide.actions;
import static web_elements.FramesElements.*;

public class FramesTest extends BaseTest {

    @Test
    @DisplayName("Тест для работы с фреймом")
    @Description("Переключение на iFrame, взаимодействие с элементами внутри фрейма")
    public void framesTest() {

//      1. Открыть http://the-internet.herokuapp.com/frames
        openBrowser("http://the-internet.herokuapp.com/frames");

//      2. Перейти на iFrame
        goIframe.click();

//      3. В текстовый редактор ввести Hello World
        Selenide.switchTo().frame(iframeId);

        textEditor.shouldBe(interactable).clear();
        textEditor.shouldBe(interactable).setValue("Hello World");

//      4. Сделать текст жирным через кнопку B в окне фрейма
        actions().moveToElement(textEditor)
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .perform();

        Selenide.switchTo().defaultContent();

        textFormat.shouldBe(interactable).click();
    }
}