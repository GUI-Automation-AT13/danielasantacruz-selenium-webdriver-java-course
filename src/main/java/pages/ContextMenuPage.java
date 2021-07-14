package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By contexMenu = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void contextClickContextMenu() {
        WebElement menu = driver.findElement(contexMenu);
        Actions actions = new Actions(driver);
        actions.contextClick(menu).perform();
    }

    public void alertClickToAccept() {
        driver.switchTo().alert().accept();
    }

    public String alertGetText() {
        return driver.switchTo().alert().getText();
    }

//    public String alertGetText() {
//        return driver.switchTo().alert().getText();
//    }
}
