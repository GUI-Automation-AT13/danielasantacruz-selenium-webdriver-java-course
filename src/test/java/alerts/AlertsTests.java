package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alertClickToAccept();
        assertEquals(alertsPage.getResultText(),"You successfully clicked an alert","wrong message");
    }

    @Test
    public void testGetTextFromAlert() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alertGetText();
        alertsPage.alertClickToDismiss();
        assertEquals(text,"I am a JS Confirm","wrong message");
    }

    @Test
    public void testSetInputInAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "TAU";
        alertsPage.alertSetInput(text);
        alertsPage.alertClickToAccept();
        assertEquals(alertsPage.getResultText(), "You entered: " + text, "wrong result");
    }
}