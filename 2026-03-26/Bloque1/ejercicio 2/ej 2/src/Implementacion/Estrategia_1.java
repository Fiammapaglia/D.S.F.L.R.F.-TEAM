package Implementacion;

import Interfaces.PilaTDA;

public class Estrategia_1 implements PilaTDA {

    private static final int MAX = 10;// se puede ir hacia atras 10 veces
    private String[] datos;  //declara donde guarda los estados del codigo
    private int cantidad; //cantidad de elementos en la pila, cuantos estados del codigo estan guardados

    @Override
    public void InicializarPila() {
        datos = new String[MAX];  //le da valor al que guarda los estados del codigo
        cantidad = 0;
    }

    @Override
    public void Apilar(String x) {
        if (cantidad < MAX) {
            datos[cantidad] = x; // guarda el nuevo estado
            cantidad++;  // aumenta la cant de estados que guardamos
        }
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()) {  // verifica si hay estados guardados
            cantidad--;  //cuando el usuario toca undo elimina el ultimo
        }
    }

    @Override
    public String Tope() {
        return datos[cantidad - 1]; // devuelve estado mas reciente
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }
}
