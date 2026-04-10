package Interface;

public interface DiccionarioMultipleTDA {
    void InicializarDiccionario();
    void Agregar(int clave, String valor);
    void EliminarValor(int clave, String valor);
    void Eliminar(int clave);
    String[] Recuperar(int clave);
    String[] Claves();
}