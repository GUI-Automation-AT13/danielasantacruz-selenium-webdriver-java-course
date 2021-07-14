package javascript;

import base.BaseTests;
import org.testng.annotations.Test;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDomPage().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScrollPage().scrollToParagraph(5);
    }

    @Test
    public void testSelectDropDownAttributes() {
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.addMultipleDropDownAttibute();
        String option1 = "Option 1";
        String option2 = "Option 2";
        dropDownPage.selectFromDropDown(option1);
        dropDownPage.selectFromDropDown(option2);
        List<String> selectedOptions = dropDownPage.getSelectedOptions();
        List<String> expectedOptions = List.of(option1, option2);
        assertTrue(selectedOptions.containsAll(expectedOptions), "There were not all the options");
        assertEquals(selectedOptions.size(), expectedOptions.size(), "Incorrect number of options");
    }
}
