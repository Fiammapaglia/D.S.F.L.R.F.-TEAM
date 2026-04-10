import Implementacion.DiccionarioSimpleEstatico;
import Interface.DiccionarioSimpleTDA;

public class Main {
    public static void main(String[] args) {
        DiccionarioSimpleTDA d = new DiccionarioSimpleEstatico();

        d.InicializarDiccionario();

        d.Agregar("Luciano", "549112034910");
        d.Agregar("Dolores", "549112745436");
        d.Agregar("Santiago", "5491177493746");
        d.Agregar("Fiamma", "5491127564533"); // actualiza el valor de la clave 2

        System.out.println("Claves del diccionario:");
        String[] claves1 = d.Claves();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println(claves1[i]);
        }

        d.Eliminar("Luciano");

        System.out.println("Claves luego de eliminar la clave 2:");
        String[] claves2 = d.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println(claves2[i]);
        }
    }
}