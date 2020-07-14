package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
}

