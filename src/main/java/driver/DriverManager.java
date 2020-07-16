package driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver Instance;

    public static void Inicializar() {
        Instance = new ChromeDriver();
    }

    public static void Finalizar() {
        DriverManager.Instance.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
        DriverManager.Instance.close();
        DriverManager.Instance.quit();
    }

    public static WebElement elementoVisible(By locator, int timeout) {
        WebElement element = null;
        WebDriverWait wait = new WebDriverWait(Instance, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element;
    }
    public static WebElement elementoClicable(By locator, int timeout) {
        WebElement element = null;
        WebDriverWait wait = new WebDriverWait(Instance, timeout);
        element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        return element;
    }

    public  static void  forceSleep(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

