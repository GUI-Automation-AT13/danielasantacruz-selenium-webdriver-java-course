package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailPasswordPage {

    private WebDriver driver;
    private By statusAlert = By.xpath("//h1");

    public EmailPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getStatusAlert() {
        return driver.findElement(statusAlert).getText();
    }
}
