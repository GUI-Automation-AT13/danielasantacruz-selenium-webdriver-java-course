package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextClickOnContextMenu() {
        ContextMenuPage contextMenuPage = homePage.clickContextMenuPage();
        contextMenuPage.contextClickContextMenu();
        String alertMessage = contextMenuPage.alertGetText();
        contextMenuPage.alertClickToAccept();
        assertEquals(alertMessage,"You selected a context menu");
    }
}
