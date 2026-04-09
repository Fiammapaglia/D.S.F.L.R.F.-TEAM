package Implementacion;

import Interfaces.PilaTDA;

public class Estrategia_1 implements PilaTDA {

    private static final int MAX = 100;
    private String[] datos;
    private int cantidad;

    @Override
    public void InicializarPila() {
        datos = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void Apilar(String x) {
        if (cantidad < MAX) {

            String[] partes = x.split("");

            for (String p : partes) {
                if (p.equals("(") || p.equals(")")){
                    datos[cantidad] = p;
                    cantidad++;
                }
            }
            for (int i = 0; i < cantidad; i++) {
                if (datos[i].equals("(")) {
                    if (!(datos[i + 1].equals(")"))) {
                        System.out.println("Hay un paréntesis sin cerrar");
                    }
                } else if (datos[i].equals(")")) {
                    if (!(datos[i - 1].equals("("))) {
                        System.out.println("Hay un paréntesis sin abrir");
                    }
                }
        }
        vaciar();
    }

    }

    private void vaciar() {
        cantidad = 0;
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()) {
            cantidad--;
        }
    }

    @Override
    public String Tope() {
        if (!PilaVacia()) {
            return datos[cantidad - 1];
        }
        return null;
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }
}
