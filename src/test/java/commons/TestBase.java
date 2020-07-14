package commons;

import pages.LoginPage;
import driver.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    @BeforeClass
    public void init() {
        DriverManager.Inicializar();
        LoginPage.open();
        LoginPage.login("BRENDA001", "Juani-2019");
    }

    @AfterClass
    public void tearDown() {
        LoginPage.logOut();
        DriverManager.Finalizar();
    }
}
