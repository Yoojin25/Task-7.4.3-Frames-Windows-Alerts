package steps.asserts;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AssertGeneral {

    public static void textMatch(String text1, String text2) {
        assertThat(text1, equalTo(text2));
    }
}
