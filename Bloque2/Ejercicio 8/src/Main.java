import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class Main {
    public static void main(String[] args) {
        ColaPrioridadTDA cola = new ColaPrioridadEstatica();
        cola.InicializarColaPrioridad();

cola.AcolarPrioridad("Servidor principal caido", 999);
cola.AcolarPrioridad("No me gusta el fondo de pantalla", 0);

        while(!cola.ColaVacia()){
            System.out.println("Entra: " + cola.Primero());
            System.out.println("Prioridad: " + cola.Prioridad());
            cola.Desacolar();
            System.out.println();
        }

    }
}