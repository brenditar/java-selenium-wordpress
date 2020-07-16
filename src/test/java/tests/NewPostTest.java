package tests;

import commons.TestBase;
import pages.EntradasPage;
import org.junit.Assert;
import org.testng.annotations.Test;
import static data.Post.*;


public class NewPostTest extends TestBase {

    @Test
    public void newPostOK() {
        EntradasPage.newPost(TITLE);
        EntradasPage.goBack();
        Assert.assertTrue(SUCCESSFULLY_MESSAGE, EntradasPage.postCreado(TITLE));
    }

}

