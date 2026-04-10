import Implementacion.DiccionarioMultipleEstatico;
import Interface.DiccionarioMultipleTDA;

public class Main {
    public static void main(String[] args) {
        DiccionarioMultipleTDA d = new DiccionarioMultipleEstatico();

        d.InicializarDiccionario();

        d.Agregar("Feliz", "Contento");
        d.Agregar("Feliz", "Alegre");
        d.Agregar("Veloz", "Rapido");
        d.Agregar("Casa", "Hogar");
        d.Agregar("Bonito", "Lindo");

        System.out.println("Claves del diccionario:");
        String[] claves = d.Claves();
        for (int i = 0; i < claves.length; i++) {
            System.out.println(claves[i]);
        }

        System.out.println("Valores de la clave Casa:");
        String[] valores = d.Recuperar("Casa");
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

        d.EliminarValor("Casa", "Hogar");

        System.out.println("Valores de la clave 'Casa' luego de eliminar:");
        String[] valores2 = d.Recuperar("Casa");
        for (int i = 0; i < valores2.length; i++) {
            System.out.println(valores2[i]);
        }

        d.Eliminar("Casa");

        System.out.println("Claves luego de eliminar la clave Casa:");
        String[] claves2 = d.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println(claves2[i]);
        }
    }
}