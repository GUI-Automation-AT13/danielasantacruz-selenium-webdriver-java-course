package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By inputRange = By.xpath("//div/input");
    private By spanRange = By.cssSelector("span#range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSliderValue(String value) {
        while(!getSliderText().equals(value)) {
            driver.findElement(inputRange).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getSliderText() {
        return driver.findElement(spanRange).getText();
    }

}
