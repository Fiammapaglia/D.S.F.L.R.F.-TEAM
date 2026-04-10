package Implementacion;

import Interface.ColaTDA;

public class ColaEstatica implements ColaTDA {

    private static final int MAX = 100;
    private String[] datos;
    private int cantidad;

    @Override
    public void InicializarCola() {
        datos = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void Acolar(String x) {
        if (cantidad < MAX) {
            datos[cantidad] = x;
            cantidad++;
        }
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()) {
            for (int i = 0; i < cantidad - 1; i++) {
                datos[i] = datos[i + 1];
            }
            cantidad--;
        }
    }

    @Override
    public String Primero() {
        return datos[0];
    }

    @Override
    public boolean ColaVacia() {
        return cantidad == 0;
    }
}
