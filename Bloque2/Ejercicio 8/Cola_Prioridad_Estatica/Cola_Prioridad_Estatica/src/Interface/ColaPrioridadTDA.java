package Interface;

public interface ColaPrioridadTDA {
    void InicializarColaPrioridad();
    void AcolarPrioridad(String motivo, int prioridad);
    void Desacolar();
    boolean ColaVacia();
    String Primero();
    int Prioridad();
}