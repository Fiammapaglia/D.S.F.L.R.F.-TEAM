import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class Main {
    public static void main(String[] args) {
        ConjuntoTDA c = new ConjuntoEstatico();

        c.InicializarConjunto();

        c.Agregar(47621598);
        c.Agregar(48657221);
        c.Agregar(46211559);
        c.Agregar(47621598); // quiere votar dos veces , no va a poder
        c.Agregar(49563325);

        System.out.println("Elemento elegido: " + c.Elegir());
        System.out.println();
        System.out.println("¿Pertenece 47621598?: " + c.Pertenece(47621598));
        System.out.println();
        c.Sacar(48657221);
        System.out.println("¿Pertenece el estudiante 48657221 en el conjunto?: " + c.Pertenece(48657221));

        System.out.println();
        System.out.println("¿Conjunto vacío?: " + c.ConjuntoVacio());
    }
    //con los conjuntos se evita que los estudiantes voten dos veces
}