package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;

import utils.CookiesManager;

public class BaseTests {

    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporter());
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        //--------------------------First task
//        WebElement shifting = driver.findElement(By.xpath("//li/a[contains(@href, 'shifting')]"));
//        shifting.click();
//        WebElement menuElement = driver.findElement(By.xpath("//div/a[contains(@href, 'menu')]"));
//        menuElement.click();
//        List<WebElement> link = driver.findElements(By.tagName("li"));
//        System.out.println(link.size());
//        System.out.println(driver.getTitle());
        //---------------------------first task
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
//        options.setHeadless(true);
        return options;
    }

    public CookiesManager getCookiesManager() {
        return new CookiesManager(driver);
    }

}
