package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests  {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoadingPage().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://youtube.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindowsPage().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testSwitchOtherTab(){
        var dynamicLoadingPage = homePage.clickDynamicLoadingPage().middleClickOnExample2Link();
        getWindowManager().switchToTab("The internet");
        boolean buttonDisplayed = dynamicLoadingPage.isStartButtonDisplayed();
        assertTrue(buttonDisplayed, "Start button is not displayed");
    }
}
