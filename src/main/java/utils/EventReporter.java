package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventReporter implements WebDriverEventListener {
    @Override
    public void beforeAlertAccept(WebDriver webDriver) {
    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {
        System.out.println("After Alert Accept " + webDriver.toString());
    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {
        System.out.println("After Alert Dismiss "+ webDriver);
    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {
    }

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {
    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {
        System.out.println("After Navigate Back");
    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {
    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {
        System.out.println("After Navigate Forward");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {
    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {
        System.out.println("On Navigating Refresh");
    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Clicking on " + webElement.getText());
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {
        System.out.println("Before Script");
    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {
    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {
    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {
    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {
    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {
    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver webDriver) {
        System.out.println("This is the text obtained:  " + webElement.getText());
    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {
    }
}
