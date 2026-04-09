import Implementacion.Estrategia_1;
import Interfaces.PilaTDA;

public class Main {
    public static void main(String[] args) {
        PilaTDA p1 = new Estrategia_1();
        probarPila("Estrategia 1", p1);
    }

    public static void probarPila(String nombre, PilaTDA pila) {
        System.out.println("--- " + nombre + " ---");
        System.out.println("Reversion de string: Algoritmos");

        pila.InicializarPila();

        String palabra = "ALGORITMOS";

        for (int i=0; i<palabra.length(); i++) {
            pila.Apilar(palabra.charAt(i)); //letra por letra en la pila
        }

        //armar nueva palabra invertida
        String invertida = "";

        while (!pila.PilaVacia()) {
            char letra = (char) pila.Tope(); //convierte el int
            invertida = invertida + letra;
            pila.Desapilar();
        }

        System.out.println("Palabra invertida: " + invertida);
    }
}