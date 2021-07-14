package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookiesManager {

    private WebDriver driver;

    public CookiesManager(WebDriver driver){
        this.driver = driver;
    }

    public void addCookie(Cookie cookie){
        driver.manage().addCookie(cookie);
    }

    public void deleteCookie(Cookie cookie){
        driver.manage().deleteCookie(cookie);
    }

    public boolean cookieExists(Cookie cookie){
        if (driver.manage().getCookieNamed(cookie.getName()) != null) {
            return true;
        }
        return false;
    }

    public Cookie createCookie(String name, String value){
        Cookie cookie = new Cookie.Builder(name, value)
                .domain("the-internet.herokuapp.com")
                .build();
        return cookie;
    }
}
