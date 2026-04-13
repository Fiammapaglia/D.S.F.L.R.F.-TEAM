import Implementacion.DiccionarioMultipleEstatico;
import Interface.DiccionarioMultipleTDA;

public class Main {
    public static void main(String[] args) {
        DiccionarioMultipleTDA d = new DiccionarioMultipleEstatico();

        d.InicializarDiccionario();

        d.Agregar("Recursion", 12); //paginas donde aparece Recursion
        d.Agregar("Recursion", 45);
        d.Agregar("Recursion", 88);

        System.out.println("Claves:");
        String[] claves1 = d.Claves();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println(claves1[i]);
        }

        System.out.println("Paginas para Recursion:");
        int[] valores7 = d.Recuperar("Recursion");
        for (int i = 0; i < valores7.length; i++) {
            System.out.println(valores7[i]);
        }

        //d.EliminarValor(7, 1);

        //System.out.println("Valores de la clave 7 luego de eliminar el valor 1:");
        //int[] valores7b = d.Recuperar(7);
        //for (int i = 0; i < valores7b.length; i++) {
       //     System.out.println(valores7b[i]);
       // }

        //d.Eliminar(7);

        //System.out.println("Claves luego de eliminar la clave 7:");
        //int[] claves2 = d.Claves();
        //for (int i = 0; i < claves2.length; i++) {
        //    System.out.println(claves2[i]);
        //}
    }
}