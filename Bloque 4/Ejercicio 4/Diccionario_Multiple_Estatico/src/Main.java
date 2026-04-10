import Implementacion.DiccionarioMultipleEstatico;
import Interface.DiccionarioMultipleTDA;

public class Main {
    public static void main(String[] args) {
        DiccionarioMultipleTDA d = new DiccionarioMultipleEstatico();

        d.InicializarDiccionario();

        d.Agregar(1, "Banco");
        d.Agregar(1, "Orilla");
        d.Agregar(2, "Pais");
        d.Agregar(2, "Campo");

        System.out.println("Claves del diccionario:");
        String[] claves1 = d.Claves();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println(claves1[i]);
        }

        System.out.println("Valores de la clave 1 = 'Bank':");
        String[] valoresBank = d.Recuperar(1);
        for (int i = 0; i < valoresBank.length; i++) {
            System.out.println(valoresBank[i]);
        }

        d.EliminarValor(1, "Orilla");

        System.out.println("Valores de la clave 1 = 'Bank' luego de eliminar el valor 'Orilla':");
        String[] valoresBankb = d.Recuperar(1);
        for (int i = 0; i < valoresBankb.length; i++) {
            System.out.println(valoresBankb[i]);
        }

        d.Eliminar(1);

        System.out.println("Claves luego de eliminar la clave 1 = 'Bank':");
        String[] claves2 = d.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println(claves2[i]);
        }
    }
}