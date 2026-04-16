import Implementacion.Estrategia_1;
import Implementacion.PilaDinamica;
import Interfaces.PilaTDA;

public class Main {
    public static void main(String[] args) {

        PilaTDA pila = new Estrategia_1();
        PilaTDA aux = new Estrategia_1();
        PilaDinamica pila2 = new PilaDinamica();

        pila.InicializarPila();
        aux.InicializarPila();
        pila2.InicializarPila();

        for (int i = 0; i < 100; i++) {
            pila.Apilar(i);
        }

        for (int i = 0; i < 100; i++) {
            aux.Apilar(pila.Tope());
            pila.Desapilar();
        }

        for (int i = 0; i < 100; i++) {
            pila2.Apilar(aux.Tope());
            pila2.Desapilar();
        }

    }
}