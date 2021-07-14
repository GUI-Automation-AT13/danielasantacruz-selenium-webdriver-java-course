package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FramesPage;

import static org.testng.Assert.assertEquals;

public class NestedFrameTests extends BaseTests {

    @Test
    public void testFrameText() {
        FramesPage framesPage = homePage.clickFramesPage();
        framesPage.clickNestedFrames();
        String leftFrameText = framesPage.getTextFromLeftFrame();
        String bottomFrameText = framesPage.getTextFromBottomFrame();
        assertEquals(leftFrameText, "LEFT", "Left frame text incorrect");
        assertEquals(bottomFrameText, "BOTTOM", "Bottom frame text incorrect");
    }
}
