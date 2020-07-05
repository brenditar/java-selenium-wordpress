import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginTest {
    @BeforeClass
    public static void init() {
        DriverManager.Inicializar();
    }

    @Test
    public void loginOk() {
        LoginPage.open();
        LoginPage.login("BRENDA001", "Juani-2019");
        Assert.assertTrue("Login failed", DashboardPage.loginSuccesfully());
    }

    @Test
    public void logOutOK(){
        LoginPage.logOut();
        Assert.assertTrue("Logout failed", LoginPage.pageLogin());
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
        LoginPage.recoveryPassword("BRENDA001");
        Assert.assertTrue("Recovery password show error", DashboardPage.recoveryPasswordError());
    }

    @AfterClass
    public static void tearDown() {
        LoginPage.closeChrome();
    }
}
