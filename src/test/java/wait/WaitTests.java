package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoadingPage().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }

    @Test
    public void testWaitUntilHiddenExample2(){
        var loadingPage = homePage.clickDynamicLoadingPage().clickExample2();
        loadingPage.clickStartButton();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
