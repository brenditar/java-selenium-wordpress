package pages;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {

    public static void open() {
        DriverManager.Instance.navigate().to("http://localhost:8000/wp-admin/");
    }

    public static void buttonConfirm() {

        WebElement confirm = DriverManager.Instance.findElement((By.id("wp-submit")));
        confirm.click();
    }

    public static void populateLogin(String user, String password) {
        WebElement userInput = DriverManager.elementoClicable(By.id("user_login"), 50);
        userInput.sendKeys(user);
        WebElement userPassword = DriverManager.Instance.findElement(By.id("user_pass"));
        userPassword.sendKeys(password);
    }

    public static void login(String user, String password) {
        populateLogin(user, password);
        buttonConfirm();
    }


    public static void recoveryPassword(String user) {
        WebElement passwordForget = DriverManager.Instance.findElement(By.cssSelector("p#nav :only-of-type"));
        String boton = passwordForget.getText();
        System.out.println(boton);
        passwordForget.click();

        WebElement inputUser = DriverManager.Instance.findElement(By.id("user_login"));
        inputUser.sendKeys(user);

        WebElement buttonObtener = DriverManager.Instance.findElement(By.id("wp-submit"));
        buttonObtener.click();

    }

    public static void rememberme(String user, String password) {
        WebElement checkRememberMe = DriverManager.Instance.findElement(By.id("rememberme"));
        populateLogin(user, password);
        checkRememberMe.click();
        buttonConfirm();
    }

    public static void logOut() {
        WebElement profile = DriverManager.Instance.findElement(By.partialLinkText("BRENDA001"));
        String perfil = profile.getText();
        System.out.println(perfil);

        Actions action = new Actions(DriverManager.Instance);
        WebElement we = DriverManager.Instance.findElement(By.id("wp-admin-bar-my-account"));
        action.moveToElement(we).perform();

        WebElement buttonCloseSession = DriverManager.Instance.findElement(By.linkText("Cerrar sesión"));
        buttonCloseSession.click();
        System.out.println("Se hizo click en cerrar sesión");

    }

    public static boolean pageLogin() {
        WebElement messageLogin = DriverManager.Instance.findElement(By.cssSelector("#login > p.message"));
        String mensaje = messageLogin.getText();
        System.out.println(mensaje);

        if (mensaje.contains("desconectado")) {
            return true;
        }
        return false;
    }

}


