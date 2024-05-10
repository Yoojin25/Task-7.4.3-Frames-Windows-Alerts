package ui_tests_selenide;

import base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.asserts.AssertGeneral;
import steps.asserts.AssertWindows;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.switchTo;
import static web_elements.WindowsElements.clickHere;
import static web_elements.WindowsElements.textNewHandle;

public class WindowsTest extends BaseTest {

    @Test
    @DisplayName("Тест для работы с окном/вкладкой")
    @Description("Осуществляется открытие новой вкладки, переключение между вкладками, закрытие новой вкладки")
    public void windowsTest() {

//      1. Открыть http://the-internet.herokuapp.com/windows
        openBrowser("http://the-internet.herokuapp.com/windows");

        String firstHandle = switchTo().window(0).getWindowHandle();

//      2. Нажать “Click Here”
        clickHere.click();

//      3. Проверить что произошел переход на новую страницу
        String newHandle = switchTo().window(1).getWindowHandle();

        AssertWindows.textMismatch(firstHandle, newHandle);

//      4. Проверить текст “New Page” (тут, наверное, имеется в виду "New Window")
        AssertWindows.textPresence(textNewHandle, "New Window");

//      5. Закрыть новую вкладку
        closeWindow();

//      6. Проверить переход на предыдущую страницу
        String returnToFirstHandle = switchTo().window(0).getWindowHandle();

        AssertGeneral.textMatch(returnToFirstHandle, firstHandle);
    }
}