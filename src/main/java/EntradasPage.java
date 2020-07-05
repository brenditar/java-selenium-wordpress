import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

public class EntradasPage {

    public static void newPost() {
        WebElement entradas = DriverManager.Instance.findElement(By.linkText("Entradas"));
        entradas.click();
        System.out.println("Se ingreso al modulo entradas");
        WebElement agregarNueva = DriverManager.Instance.findElement(By.linkText("Agregar nueva"));
        agregarNueva.click();

        // Cerrar dialogo
        WebElement popUp = DriverManager.Instance.findElement(By.cssSelector(".components-guide"));

        WebElement closePopUp = popUp.findElement(By.cssSelector(".has-icon"));
       // WebElement closePopUp = popUp.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div/div[1]/button"));
        closePopUp.click();

        //Completar Post
        WebElement agregarTitulo = DriverManager.Instance.findElement((By.id("post-title-0")));
        agregarTitulo.sendKeys("Este es nuevo post");
        System.out.println("Se escribió titulo del post");

        WebElement agregarBody = DriverManager.Instance.findElement(By.cssSelector("#block-f0e1b7ea-b722-41b0-ba3c-44f4ad5fce1e > p"));

        agregarBody.sendKeys("Este es el cuerpo del post");
        System.out.println("Se escribió body");

        WebElement publicar = DriverManager.Instance.findElement((By.linkText("Publicar…")));
        publicar.click();

    }

    public static boolean mensajeCreacionPost (){
        //buscar mensaje Entrada publicada.
        WebElement mensajeCreacionPost = DriverManager.Instance.findElement(By.linkText("Entrada publicada."));
        String mensaje = mensajeCreacionPost.getText();
        if (mensaje.contains(("Entrada publicada"))) {
            return true;
        }
        return false;
    }

    public static void returnToDasboard(){
        WebElement logoWord = DriverManager.Instance.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div[1]/div/div[1]/div/a/svg"));
        logoWord.click();
    }
}
