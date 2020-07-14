package pages;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardPage {
    public static boolean loginSuccesfully() {
        WebElement tittle = DriverManager.Instance.findElement(By.id("welcome-panel"));
        String titulo = tittle.getText();
        System.out.println(titulo);

        if (titulo.contains("Bienvenido a WordPress")) {
            return true;
        }
        return false;
    }

    public static boolean recoveryPasswordError() {
        WebElement errorMessage = DriverManager.Instance.findElement((By.id("login_error")));
        String message = errorMessage.getText();

        if (message.contains("Error: no se pudo enviar el correo")) {
            return true;
        }
        return false;

    }

    public static void pagePrincipal(){
        WebElement pageBrenda = DriverManager.Instance.findElement(By.linkText("← Volver a BRENDATEST"));
        pageBrenda.click();
    }


}
