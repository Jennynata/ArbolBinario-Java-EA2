public class ArbolBinario {
    Nodo raiz;

    // Constructor: el árbol empieza vacío
    public ArbolBinario() {
        raiz = null;
    }

    // Método para insertar números
    public void insertar(int dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    private Nodo insertarRecursivo(Nodo nodoActual, int dato) {
        if (nodoActual == null) {
            return new Nodo(dato);
        }
        if (dato < nodoActual.dato) {
            nodoActual.izquierdo = insertarRecursivo(nodoActual.izquierdo, dato);
        } else if (dato > nodoActual.dato) {
            nodoActual.derecho = insertarRecursivo(nodoActual.derecho, dato);
        }
        return nodoActual;
    }

    // Método para mostrar el recorrido inorden
    public void mostrarInorden() {
        System.out.print("Recorrido inorden (ordenado): ");
        inordenRecursivo(raiz);
        System.out.println();
    }

    private void inordenRecursivo(Nodo nodoActual) {
        if (nodoActual != null) {
            inordenRecursivo(nodoActual.izquierdo);
            System.out.print(nodoActual.dato + " ");
            inordenRecursivo(nodoActual.derecho);
        }
    }

    // Método para buscar un número
    public boolean buscar(int dato) {
        return buscarRecursivo(raiz, dato);
    }

    private boolean buscarRecursivo(Nodo nodoActual, int dato) {
        if (nodoActual == null) {
            return false;
        }
        if (dato == nodoActual.dato) {
            return true;
        }
        return dato < nodoActual.dato ? buscarRecursivo(nodoActual.izquierdo, dato) 
        : buscarRecursivo(nodoActual.derecho, dato);
    }
}