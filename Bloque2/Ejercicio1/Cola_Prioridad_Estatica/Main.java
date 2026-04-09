import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class Main {
    public static void main(String[] args) {
        ColaPrioridadTDA cola = new ColaPrioridadEstatica();
        cola.InicializarColaPrioridad();
        cola.AcolarPrioridad("persona1", 1);
        cola.AcolarPrioridad("persona2", 1);
        cola.AcolarPrioridad("persona mayor", 2);
        cola.AcolarPrioridad("embarazada", 3);
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
