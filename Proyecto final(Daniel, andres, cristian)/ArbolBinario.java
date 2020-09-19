/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbin;

/**
 *
 * @author ccort
 */
public class ArbolBinario  {
     private NodoArbol raiz;

    public ArbolBinario() {
        this.raiz=null;
    }

    public boolean existe(int busquedaNit) {
        return existe(this.raiz, busquedaNit);
    }

    private boolean existe(NodoArbol n, int busquedaNit) {
        if (n == null) {
            return false;
        }
        if (n.getDato().getNit()==busquedaNit) {
            return true;
        } else if (busquedaNit < n.getDato().getNit()) {
            return existe(n.getIzquierda(), busquedaNit);
        } else {
            return existe(n.getDerecha(), busquedaNit);
        }

    }

    public void insertar(Empresa dato) {
        if (this.raiz == null) {
            this.raiz = new NodoArbol(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(NodoArbol padre, Empresa dato) {
        if (dato.getNit() > padre.getDato().getNit()) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new NodoArbol(dato));
            } else {
                this.insertar(padre.getDerecha(), dato);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new NodoArbol(dato));
            } else {
                this.insertar(padre.getIzquierda(), dato);
            }
        }
    }

    private void preorden(NodoArbol n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
    }

    private void inorden(NodoArbol n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDato();
            inorden(n.getDerecha());
        }
    }

    private void postorden(NodoArbol n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDato();
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }
}
