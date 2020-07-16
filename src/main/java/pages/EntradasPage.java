package pages;

import driver.DriverManager;
import navegacion.Navegacion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class EntradasPage {
    public static By tituloField = By.id("post-title-0");
    public static By publicarButton = By.cssSelector(".editor-post-publish-button__button");
    public static By filtroField = By.id("post-search-input");
    public static By searchButton = By.id("search-submit");
    public static By goBackButton = By.cssSelector(".edit-post-fullscreen-mode-close");

    public static void newPost(String namePost) {
        Navegacion.Entradas.seleccionar();
        System.out.println("Se ingreso al modulo Entradas");
        Navegacion.Entradas.AgregarNueva.seleccionar();

        // Cerrar dialogo
        WebElement popUp = DriverManager.Instance.findElement(By.cssSelector(".components-guide"));

        WebElement closePopUp = popUp.findElement(By.cssSelector(".has-icon"));
        closePopUp.click();

        //Completar Post
        WebElement agregarTitulo = DriverManager.Instance.findElement((tituloField));
        agregarTitulo.sendKeys(namePost);
        System.out.println("Se escribió titulo del post");

        WebElement publicar = DriverManager.Instance.findElement((publicarButton));
        publicar.click();
        System.out.println("Se hizo click en publicar");

        WebElement panel = DriverManager.Instance.findElement(By.cssSelector("#editor > div > div > div.components-navigate-regions > div > div.block-editor-editor-skeleton__body > div.block-editor-editor-skeleton__publish > div > div > div"));
        WebElement salvar = panel.findElement(By.cssSelector(".editor-post-publish-button__button"));
        salvar.click();
        DriverManager.forceSleep(5000);
    }


    public static void filterPost(String namePost){
        WebElement filter = DriverManager.Instance.findElement(filtroField);
        filter.sendKeys(namePost);
        //Buscar
        WebElement search = DriverManager.Instance.findElement(searchButton);
        search.click();
    }

    public static boolean postCreado(String namePost){
        filterPost(namePost);
        WebElement resultFilterPost = DriverManager.Instance.findElement(By.cssSelector(".row-title"));
        String resultado = resultFilterPost.getText();
        System.out.println(resultado);
        if (resultado.contains(namePost)) {
            return true;
        }
        return false;
    }

    public static void goBack(){
        // Volver a entradas
        WebElement goBack = DriverManager.Instance.findElement(goBackButton);
        goBack.click();
    }
}
