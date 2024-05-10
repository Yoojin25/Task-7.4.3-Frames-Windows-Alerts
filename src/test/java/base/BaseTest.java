package base;

import io.github.bonigarcia.wdm.WebDriverManager;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    public void openBrowser(String url) {
        WebDriverManager.chromedriver().setup();

        open(url);
    }
}
