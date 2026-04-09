import Implementacion.Estrategia_1;
import Interfaces.PilaTDA;

public class Main {
    public static void main(String[] args) {

        Estrategia_1 p1 = new Estrategia_1();

        p1.InicializarPila();

        p1.Apilar("((())())");
    }
}