package navegacion;

import org.openqa.selenium.By;

public class Navegacion {
    public static class Entradas {
        public static void seleccionar() {
            Seleccionar.opcion(By.linkText("Entradas"));
        }

        public static class AgregarNueva {
            public static void seleccionar() {
                Seleccionar.opcion(By.linkText("Agregar nueva"));
            }
        }
    }

    static class Multimedia {
        public static void seleccionar() {
            Seleccionar.opcion(By.linkText("Multimedia"));
        }

        static class Agregar {
            public static void seleccionar() {
                Seleccionar.opcion(By.linkText("Agregar nueva"));
            }
        }
    }
}
