package Interface;

public interface DiccionarioMultipleTDA {
    void InicializarDiccionario();
    void Agregar(String clave, int valor);
    void EliminarValor(String clave, int valor);
    void Eliminar(String clave);
    int[] Recuperar(String clave);
    String[] Claves();
}