import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class Main{
    public static void main(String[] args) {
        ConjuntoTDA c = new ConjuntoEstatico();

        c.InicializarConjunto();

        System.out.println("¿Conjunto vacío?: " + c.ConjuntoVacio());

        c.Agregar("Crypto");
        c.Agregar("Gana");
        c.Agregar("Premio");


        System.out.println("¿Pertenece Crypto?: " + c.Pertenece("Crypto"));
        System.out.println("¿Pertenece Hola?: " + c.Pertenece("Hola"));
        System.out.println("¿Pertenece Gana?: " + c.Pertenece("Gana"));

        System.out.println("¿Conjunto vacío?: " + c.ConjuntoVacio());
    }
}