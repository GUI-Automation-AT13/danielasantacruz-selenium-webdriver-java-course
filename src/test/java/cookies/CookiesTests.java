package cookies;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class CookiesTests extends BaseTests {

    @Test
    public void testDeleteCookie() {
        var cookieBase = getCookiesManager();
        Cookie newCookie = cookieBase.createCookie("test cookie", "555");
        cookieBase.deleteCookie(newCookie);
        assertFalse(cookieBase.cookieExists(newCookie));
    }
}
