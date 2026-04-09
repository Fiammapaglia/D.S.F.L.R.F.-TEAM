package Implementacion;

import Interface.ColaPrioridadTDA;

public class ColaPrioridadEstatica implements ColaPrioridadTDA {
    private static final int MAX = 10;
    private String[] datos;
    private int[] prioridades;
    private int cantidad;

    public void InicializarColaPrioridad() {
        this.datos = new String[10];
        this.prioridades = new int[10];
        this.cantidad = 0;
    }

    public void AcolarPrioridad(String persona, int prioridad) {
        if (this.cantidad < 10) {
            int i;
            for(i = this.cantidad - 1; i >= 0 && this.prioridades[i] < prioridad; --i) {
                this.datos[i + 1] = this.datos[i];
                this.prioridades[i + 1] = this.prioridades[i];
            }

            this.datos[i + 1] = persona;
            this.prioridades[i + 1] = prioridad;
            ++this.cantidad;
        }

    }

    public void Desacolar() {
        if (!this.ColaVacia()) {
            for(int i = 0; i < this.cantidad - 1; ++i) {
                this.datos[i] = this.datos[i + 1];
                this.prioridades[i] = this.prioridades[i + 1];
            }

            --this.cantidad;
        }

    }

    public boolean ColaVacia() {
        return this.cantidad == 0;
    }

    public String Primero() {
        return this.datos[0];
    }

    public int Prioridad() {
        return this.prioridades[0];
    }

    public int getCantidad() {
        return this.cantidad;
    }
}
