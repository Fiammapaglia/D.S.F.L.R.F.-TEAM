package estrategias;
import api.pilaTDA;

public class Estrategia_1 implements pilaTDA {
    private static final int MAX = 15;
    private String[] datos;  // <-- ahora es String
    private int cantidad;

    @Override
    public void InicializarPila() {
        datos = new String[MAX];
        datos[0] = "fi.uba.ar";
        datos[1] = "campus.utn.edu.ar";
        datos[2] = "stackoverflow.com";

        cantidad = 0;
    }

    @Override
    public void aplicar(String x) {  //
        if (cantidad < MAX) {
            datos[cantidad] = x; // apila las paginas
            cantidad++;
        }
    }

    @Override
    public void desapilar() { // cuando el usuario toca la flecha para atras, vuelve a la pagina anterior
        if (!pilaVacia()) {
            cantidad--;
        }
    }

    @Override
    public String tope() {  //
        return datos[cantidad - 1];
    }

    @Override
    public boolean pilaVacia() {
        return cantidad == 0;
    }
}
