package horizontalSlider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizotanlSliderTests extends BaseTests {

    @Test
    public void testSendKeys() {
        var horizontalSlider = homePage.clickHorizontalSlider();
        horizontalSlider.setSliderValue("4");
        assertEquals(horizontalSlider.getSliderText(),"4", "Incorrect slider value");
    }
}
