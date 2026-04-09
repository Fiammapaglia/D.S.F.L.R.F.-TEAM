import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class Main {
    public static void main(String[] args) {
        ColaPrioridadTDA cola = new ColaPrioridadEstatica();
        cola.InicializarColaPrioridad();

        cola.AcolarPrioridad("Movilidad Reducida 1ero", 3);
        cola.AcolarPrioridad("Movilidad Reducida 2do", 3); //misma prioridad
        cola.AcolarPrioridad("Business 1ero", 2);
        cola.AcolarPrioridad("Business 2do", 2);
        cola.AcolarPrioridad("Pasajero 1", 1);
        cola.AcolarPrioridad("Pasajero 2", 1);

        while(!cola.ColaVacia()){
            System.out.println("Entra: " + cola.Primero());
            System.out.println("Prioridad: " + cola.Prioridad());
            cola.Desacolar();
            System.out.println();
        }

        cola.Desacolar();
        System.out.println("¿Ya entraron todos?: " + cola.ColaVacia());
    }
}