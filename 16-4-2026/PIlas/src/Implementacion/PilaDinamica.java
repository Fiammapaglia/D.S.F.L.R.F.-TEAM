package Implementacion;

import Interfaces.PilaTDA;
import Implementacion.Node;

public class PilaDinamica implements PilaTDA{

    private Node tope;//apunta al nodo

    @Override
    public void InicializarPila() {
        tope = null;
    }

    @Override
    public void Apilar(int x) {
        // El nuevo nodo apunta al tope actual, y pasa a ser el nuevo tope
        // Esto respeta LIFO: el ultimo en entrar es el primero

        Node node = new Node(x, tope);
        tope = node;
    }

    @Override
    public void Desapilar() {
        if(!PilaVacia()){
            // Avanzamos tope al siguiente nodo, descartando el nodo actual
            tope = tope.getNext();
        }
    }

    @Override
    public int Tope() {
        return 0;
    }

    @Override
    public boolean PilaVacia() {
        return false;
    }
}
