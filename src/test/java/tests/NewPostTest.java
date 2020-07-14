package tests;

import commons.TestBase;
import pages.EntradasPage;
import org.junit.Assert;
import org.testng.annotations.Test;


public class NewPostTest extends TestBase {

    @Test
    public void newPostOK() {
        EntradasPage.newPost("Titulo del Post");
        EntradasPage.goBack();
        Assert.assertTrue("Post creado exitosamente", EntradasPage.postCreado("Titulo del Post"));
    }

}

