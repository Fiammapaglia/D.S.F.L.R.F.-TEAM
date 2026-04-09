import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class Main {
    public static void main(String[] args) {
        ColaPrioridadTDA cola = new ColaPrioridadEstatica();
        cola.InicializarColaPrioridad();
        cola.AcolarPrioridad("Promocion1", 10);
        cola.AcolarPrioridad("Rinden final1", 5);
        cola.AcolarPrioridad("Promocion2", 10);
        cola.AcolarPrioridad("Rinden final2", 5);
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
