import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class Main {
    public static void main(String[] args) {
        ConjuntoTDA c = new ConjuntoEstatico();

        c.InicializarConjunto();

        c.Agregar(1);
        c.Agregar(2);
        c.Agregar(2); // no debe repetirse
        c.Agregar(3);

        // llamando a elegir() sin llamar a sacar():
        System.out.println("Elemento elegido (Primera vez): " + c.Elegir());
        System.out.println("Elemento elegido (Segunda vez): " + c.Elegir());

        //RTA: devuelve el mismo elemento.
        // llamarlo sin un Sacar(), siempre va a devolver lo mismo.
    }
}