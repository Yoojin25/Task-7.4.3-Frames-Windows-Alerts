package web_elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FramesElements {
    public static SelenideElement goIframe = $x("//a[@href='/iframe']");
    public static SelenideElement iframeId = $x("//iframe[@id='mce_0_ifr']");
    public static SelenideElement textEditor = $x("//body[@id='tinymce']");
    public static SelenideElement textFormat = $x("//button[@aria-label='Bold']/span");
}
