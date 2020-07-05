import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    public static WebDriver Instance;

    public static void Inicializar() {
        Instance = new ChromeDriver();
    }
}

