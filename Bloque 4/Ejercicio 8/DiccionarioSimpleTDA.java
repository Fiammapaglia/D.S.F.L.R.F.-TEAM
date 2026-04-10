public interface DiccionarioSimpleTDA {
    void InicializarDiccionario();
    void Agregar(int clave, String valor);
    void Eliminar(int clave);
    String Recuperar(int clave);
    int[] Claves();
}
