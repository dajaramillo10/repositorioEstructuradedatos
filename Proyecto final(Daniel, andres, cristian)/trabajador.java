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
public class trabajador {
    private String nombre;
    private String identi;
    private String cargo;
    private int horasTr;

    public trabajador(String nombre, String identi, String cargo, int horasTr) {
        this.nombre = nombre;
        this.identi = identi;
        this.cargo = cargo;
        this.horasTr = horasTr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdenti() {
        return identi;
    }

    public void setIdenti(String identi) {
        this.identi = identi;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getHorasTr() {
        return horasTr;
    }

    public void setHorasTr(int horasTr) {
        this.horasTr = horasTr;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", identi=" + identi + ", cargo=" + cargo + ", horasTr=" + horasTr ;
    }
    
    

}
