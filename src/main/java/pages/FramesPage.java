package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPage {

    private WebDriver driver;
    private By nestedFrame = By.linkText("Nested Frames");
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By body = By.tagName("body");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickNestedFrames() {
        driver.findElement(nestedFrame).click();
    }

    public String getTextFromLeftFrame() {
        switchToFrameArea(topFrame);
        switchToFrameArea(leftFrame);
        String text = driver.findElement(body).getText();
        switchToPArentFrameArea();
        switchToPArentFrameArea();
        return text;
    }

    public String getTextFromBottomFrame() {
        switchToFrameArea(bottomFrame);
        String text = driver.findElement(body).getText();
        return text;
    }

    private void switchToFrameArea(String frame) {
        driver.switchTo().frame(frame);
    }

    private void switchToPArentFrameArea() {
        driver.switchTo().parentFrame();
    }

}
