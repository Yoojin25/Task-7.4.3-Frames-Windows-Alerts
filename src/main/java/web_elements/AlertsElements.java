package web_elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AlertsElements {
    public static SelenideElement buttonAlert = $x("//button[@onclick='jsAlert()']");
    public static SelenideElement alertResult = $x("//p[@id='result']");
    public static SelenideElement buttonConfirm = $x("//button[@onclick='jsConfirm()']");
    public static SelenideElement buttonPrompt = $x("//button[@onclick='jsPrompt()']");
}
