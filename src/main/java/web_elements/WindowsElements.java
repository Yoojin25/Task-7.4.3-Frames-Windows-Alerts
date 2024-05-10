package web_elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WindowsElements {
    public static SelenideElement clickHere = $x("//a[@href='/windows/new']");
    public static SelenideElement textNewHandle = $x("//h3");
}
