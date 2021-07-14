package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.EmailPasswordPage;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testSuccessfulLogin() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("tau@example.com");
        EmailPasswordPage emailPasswordPage = forgotPasswordPage.clickRetrievePasswordButton();
        assertEquals(emailPasswordPage.getStatusAlert(),
                "Your e-mail's been sent!",
                "Alert text is incorrect");
    }
}
