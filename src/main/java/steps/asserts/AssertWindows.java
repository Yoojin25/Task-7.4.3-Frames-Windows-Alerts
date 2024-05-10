package steps.asserts;

import com.codeborne.selenide.SelenideElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AssertWindows {

    public static void textMismatch(String text1, String text2) {
        assertThat(text1, not(equalTo(text2)));
    }

    public static void textPresence(SelenideElement element, String expectedResult) {
        assertThat(element.getText(), equalTo(expectedResult));
    }
}