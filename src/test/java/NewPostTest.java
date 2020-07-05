import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class NewPostTest {
    @BeforeClass
    public static void init() {
        DriverManager.Inicializar();
    }

    @Test
    public void newPostOK() {
        LoginPage.open();
        LoginPage.login("BRENDA001", "Juani-2019");

        EntradasPage.newPost();
        //Assert.assertTrue("Post creado exitosamente", EntradasPage.mensajeCreacionPost());

        //EntradasPage.returnToDasboard();
    }

    @AfterClass
    public static void tearDown() {
        LoginPage.closeChrome();
    }
}

