import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConjuntoTDA c = new ConjuntoEstatico();

        c.InicializarConjunto();

        System.out.println("¿Conjunto vacío?: " + c.ConjuntoVacio());

        c.Agregar(1454514);
        c.Agregar(1569032);
        c.Agregar(1454514); // no debe repetirse
        c.Agregar(1097202);
        
        //lo que hace es que, al agregar dos veces el mismo legajo y leer 
        //que es el mismo, no lo agrega

        System.out.println("¿Pertenece 1454514?: " + c.Pertenece(1454514));
        System.out.println("¿Pertenece 1569032?: " + c.Pertenece(1569032));

        System.out.println("Elemento elegido: " + c.Elegir());

        c.Sacar(1454514);
        System.out.println("¿Pertenece 1454514 luego de sacarlo?: " + c.Pertenece(1454514));

        c.Sacar(1569032);
        System.out.println("¿Pertenece 1569032 luego de sacarlo?: " + c.Pertenece(1569032));

        System.out.println("¿Conjunto vacío?: " + c.ConjuntoVacio());
    }
}