import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class Main {
    public static void main(String[] args) {
        ColaPrioridadTDA cola = new ColaPrioridadEstatica();

        cola.InicializarColaPrioridad();

        cola.AcolarPrioridad("No me gusta el fondo de pantalla", 1);
        cola.AcolarPrioridad("Encontré un bug en una función", 10);
        cola.AcolarPrioridad("Encontré un problema en el back que deja sin funcionalidad una parte de la app", 40);
        cola.AcolarPrioridad("Se cayó el sistema", 90);

        System.out.println("¿Cola vacía?: " + cola.ColaVacia());

        System.out.println("Primero: " + cola.Primero());
        System.out.println("Prioridad del primero: " + cola.Prioridad());

        cola.Desacolar();
        System.out.println("Luego de desacolar:");
        System.out.println("Primero: " + cola.Primero());
        System.out.println("Prioridad del primero: " + cola.Prioridad());

        cola.Desacolar();
        System.out.println("Luego de desacolar:");
        System.out.println("Primero: " + cola.Primero());
        System.out.println("Prioridad del primero: " + cola.Prioridad());

        cola.Desacolar();
        System.out.println("Luego de desacolar:");
        System.out.println("Primero: " + cola.Primero());
        System.out.println("Prioridad del primero: " + cola.Prioridad());

        cola.Desacolar();
        System.out.println("¿Cola vacía?: " + cola.ColaVacia());
    }
}