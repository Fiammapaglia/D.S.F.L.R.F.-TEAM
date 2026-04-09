package Interface;

public interface ColaPrioridadTDA {
    void InicializarColaPrioridad();

    void AcolarPrioridad(String var1, int var2);

    void Desacolar();

    boolean ColaVacia();

    String Primero();

    int Prioridad();

    int getCantidad();
}
