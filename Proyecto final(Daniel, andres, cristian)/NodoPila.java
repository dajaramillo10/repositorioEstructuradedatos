/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbin;

/**
 *
 * @author estudiante
 */
public class NodoPila {

    private trabajador trabajador;
    private NodoPila siguiente;

    public NodoPila(trabajador nom) {
        trabajador = nom;
        siguiente = null;
    }

    public trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }

     
}
