public class Estrategia_1 implements PilaTDA {

    private static final int MAX = 100;
    private String[] datos;
    private int cantidad; // cantidad de directorios en la pila

    @Override
    public void InicializarPila() {
        // prepara la pila vacia
        datos = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void Apilar(String x) {
        // guarda el nuevo directorio en la pila
        if (cantidad < MAX) {
            datos[cantidad] = x;
            cantidad++;
        }
    }

    @Override
    public void Desapilar() {
        // elimina el directorio actual de la pila
        if (!PilaVacia()) {
            cantidad--;
        }
    }

    @Override
    public String Tope() {
        // devuelve el directorio actual sin eliminarlo
        return datos[cantidad - 1];
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }
}
