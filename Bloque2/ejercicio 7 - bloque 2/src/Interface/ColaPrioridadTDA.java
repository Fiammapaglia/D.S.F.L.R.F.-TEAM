package Interface;

public interface ColaPrioridadTDA {
    void InicializarColaPrioridad();
    void AcolarPrioridad(String pasajeros, int prioridad);
    void Desacolar();
    boolean ColaVacia();
    String Primero();
    int Prioridad();
}