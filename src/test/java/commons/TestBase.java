package commons;

import pages.LoginPage;
import driver.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import static data.Login.*;

public class TestBase {

    @BeforeClass
    public void init() {
        DriverManager.Inicializar();
        LoginPage.open();
        LoginPage.login(USERNAME, PASSWORD);
    }

    @AfterClass
    public void tearDown() {
        LoginPage.logOut();
        DriverManager.Finalizar();
    }
}
