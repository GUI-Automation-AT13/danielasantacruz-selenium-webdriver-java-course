package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUploadPage();
        uploadPage.uploadFile("C:\\Daniela\\Jala\\API testing\\Proyectos\\Webdriver_course\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFilesMessage(), "chromedriver.exe", "Uploaded files incorrect");
    }
}
