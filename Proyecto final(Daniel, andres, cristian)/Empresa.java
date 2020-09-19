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
public class Empresa {

    private String nombre;
    private int nit;
    private String email;
    private String telefono;
    private Pilas trabajadores;
    
    public Empresa(String nombre, int nit, String email, String telefono, Pilas trabajadores){
        this.nombre=nombre;
        this.nit= nit;
        this.email=email;
        this.telefono=telefono;
        this.trabajadores=trabajadores;
    }

    public String getNombre() {
        return nombre;
    }

    public Pilas getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Pilas trabajadores) {
        this.trabajadores = trabajadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "EMPRESA\n" + "nombre=" + nombre + ", nit=" + nit + ", email=" + email + ", telefono=" + telefono + "\nTRABAJADORES\n" + trabajadores.MostrarPila()  ;
    }

    
    
}
