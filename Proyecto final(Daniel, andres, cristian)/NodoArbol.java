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
public class NodoArbol {

    private Empresa dato;

    private NodoArbol izquierda, derecha;

    public NodoArbol(Empresa dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }

    public Empresa getDato() {
        return dato;
    }

    public void setDato(Empresa dato) {
        this.dato = dato;
    }

    public NodoArbol getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoArbol izquierda) {
        this.izquierda = izquierda;
    }

    public NodoArbol getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoArbol derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println(this.getDato());
    }
}
