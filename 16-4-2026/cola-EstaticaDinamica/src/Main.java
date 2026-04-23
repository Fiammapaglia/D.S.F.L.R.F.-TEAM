import Implementacion.ColaDinamica;
import Interface.ColaTDA;
import Implementacion.ColaEstatica;

public class Main {
    public static void main(String[] args) {
        // crear cola estatica
        ColaTDA colaEst = new ColaEstatica();
        colaEst.InicializarCola();
        colaEst.InicializarCola();
        colaEst.Acolar(10);
        colaEst.Acolar(20);
        colaEst.Acolar(30);

        // crear cola aux estatica (para guardar duplicado) y cola dinamica
        ColaTDA colaAux = new ColaEstatica();
        colaAux.InicializarCola();
        ColaTDA colaDin =  new ColaDinamica();
        colaDin.InicializarCola();

        // desacolar y mandar a las colas
        while(!colaEst.ColaVacia()){
            int valor = colaEst.Primero(); //primer dato de la cola
            colaDin.Acolar(valor); //acolar en las dos
            colaAux.Acolar(valor);
            colaEst.Desacolar();
        }

        //restaurar la estatica original
        while (!colaAux.ColaVacia()){
            colaEst.Acolar(colaAux.Primero());
            colaAux.Desacolar();
        }
    }
}