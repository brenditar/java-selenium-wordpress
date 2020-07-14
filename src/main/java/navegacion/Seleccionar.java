package navegacion;

import driver.DriverManager;
import org.openqa.selenium.By;

public class Seleccionar {

    public static void opcion(By selector){
        DriverManager.elementoClicable(selector, 10).click();
    }
}



