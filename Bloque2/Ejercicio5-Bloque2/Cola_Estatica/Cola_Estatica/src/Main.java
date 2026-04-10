import Implementacion.ColaEstatica;
import Interface.ColaTDA;

public class Main {
    public static void main(String[] args) {
        ColaTDA cola = new ColaEstatica();

        cola.InicializarCola();

        System.out.println("¿Cola vacía?: " + cola.ColaVacia());

        cola.Acolar("Cliente 1");
        cola.Acolar("Cliente 2");
        cola.Acolar("Cliente 3");

        System.out.println("### Buffet de la facultad ###");

        System.out.println("Cliente atendido: " + cola.Primero()); // 10

        cola.Desacolar();
        System.out.println("Cliente atendido: " + cola.Primero()); // 20

        cola.Desacolar();
        System.out.println("Cliente atendido: " + cola.Primero()); // 30

        cola.Desacolar();
        System.out.println("¿Cola vacía?: " + cola.ColaVacia()); // true
    }
}