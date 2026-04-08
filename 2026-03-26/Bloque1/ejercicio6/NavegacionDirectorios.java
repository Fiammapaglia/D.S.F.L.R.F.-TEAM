public class NavegacionDirectorios {
    public static void main(String[] args) {

        // Se crea la pila que va a guardar los directorios visitados
        PilaTDA directorios = new Estrategia_1();
        directorios.InicializarPila(); // se inicializa vacia

        // El usuario entra a las carpetas: cada directorio visitado se apila
        directorios.Apilar("C:/"); // directorio raiz
        System.out.println("Entras a: " + directorios.Tope());

        directorios.Apilar("Usuarios"); // entra a Usuarios
        System.out.println("Entras a: " + directorios.Tope());

        directorios.Apilar("Documentos"); // entra a Documentos, queda en el tope
        System.out.println("Entras a: " + directorios.Tope());

        // El usuario aprieta "Subir un nivel": se desapila el directorio actual
        // y el tope pasa a ser el directorio anterior
        directorios.Desapilar();
        System.out.println("Subis un nivel. Ahora estas en: " + directorios.Tope());

        directorios.Desapilar();
        System.out.println("Subis un nivel. Ahora estas en: " + directorios.Tope());

        // Se desapila el ultimo directorio, la pila queda vacia
        directorios.Desapilar();
        System.out.println("Pila de directorios vacia?: " + directorios.PilaVacia());
    }
}
