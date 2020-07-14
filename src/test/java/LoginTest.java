import pages.DashboardPage;
import pages.LoginPage;
import driver.DriverManager;
import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest {

    @BeforeClass
    public void iniciar() {
        DriverManager.Inicializar();
    }

    @Test
    public void loginOk() {
        LoginPage.open();
        LoginPage.login("BRENDA001", "Juani-2019");
        Assert.assertTrue("Login failed", DashboardPage.loginSuccesfully());
        System.out.println("TEST1 PASS OK");
        LoginPage.logOut();
    }

    @Test
    public void logOutOK() {
        LoginPage.open();
        LoginPage.login("BRENDA001", "Juani-2019");
        LoginPage.logOut();
        Assert.assertTrue("Logout failed", LoginPage.pageLogin());
        System.out.println("TEST2 PASS OK");
    }

    @Test
    public void loginRememberMe() {
        LoginPage.open();
        LoginPage.rememberme("BRENDA001", "Juani-2019");
        Assert.assertTrue("Login failed", DashboardPage.loginSuccesfully());
        LoginPage.logOut();
    }

    @Test
    public void forgetPassword() {
        LoginPage.open();
        LoginPage.recoveryPassword("BRENDA001");
        Assert.assertTrue("Recovery password show error", DashboardPage.recoveryPasswordError());
        DashboardPage.pagePrincipal();
    }


     @AfterClass
     public void cerrar() {
         DriverManager.Finalizar();
     }


}
