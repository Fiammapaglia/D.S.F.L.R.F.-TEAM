import Implementacion.ColaEstatica;
import Interface.ColaTDA;

public class Main {
    public static void main(String[] args) {
        ColaTDA cola = new ColaEstatica();
        cola.InicializarCola();
        cola.Acolar(1);
        cola.Acolar(2);
        cola.Acolar(3);
        cola.Acolar(4);
        cola.Acolar(5);
        System.out.println("¿Cola de impresora vacía?: " + cola.ColaVacia());

        for(int i = 0; i < 5; ++i) {
            System.out.println("Se imprimio el archivo en posicion: " + cola.Primero());
            cola.Desacolar();
        }

        System.out.println("¿Cola de impresora vacía?: " + cola.ColaVacia());
    }
}
