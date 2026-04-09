package Implementacion;

import Interfaces.PilaTDA;
public class Estrategia1 implements PilaTDA {
    private static final int MAX = 10;// se puede ir hacia atras 10 veces
    private String[] datos;
    private int cantidad; // variable auxiliar: cantidad de elementos

    @Override
    public void InicializarPila() {
        datos = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void Apilar(String x) {
        if (cantidad < MAX) {
            datos[cantidad] = x; //agrega una función al tope de la pila.
            cantidad++;
        }
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()) {
            cantidad--;
        }
    }

    @Override
    public String Tope() {
        return datos[cantidad - 1]; //devuelve la función que está en ejecución(en el ejercicio suma())
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }
}
