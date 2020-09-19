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
public class Pilas {
 
    private int tamano;
    private NodoPila cima;

    public Pilas(int tama) {
        cima = null;
        tamano = tama;
    }

    private boolean vacia() {
        return cima == null;
    }

    public void insertar(trabajador elemento) {
        NodoPila nuevo = new NodoPila(elemento);
        if (vacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
        tamano++;
    }

    public trabajador MostrarCima() throws Exception {
        if (!vacia()) {
            return cima.getTrabajador();
        } else {
            throw new Exception("La pila se encuentra vacia.");
        }
    }

    public void eleiminarUltimo() {
        cima = cima.getSiguiente();
        tamano--;
    }

    public String MostrarPila() {
        NodoPila aux = cima;
        String contenido="";
        while (aux != null) {
            if (aux.getTrabajador() != null) {
                contenido+=aux.getTrabajador()+ "\n";
            }
            aux = aux.getSiguiente();
        }
        return contenido;
    }

    
    public void MostrarCedula(String cedula) {
        NodoPila aux = cima;
        while (aux != null) {
            if (aux.getTrabajador() != null && aux.getTrabajador().getIdenti().equals(cedula)) {
                System.out.println(aux.getTrabajador());
                break;
            }
            aux = aux.getSiguiente();
        }

    }
    
    public String ceduMayor() {
        NodoPila aux = cima;
        int horasMayor = -1;
        String ceduTra="";
        while (aux != null) {
            if (aux.getTrabajador().getHorasTr()> horasMayor) {
                horasMayor = aux.getTrabajador().getHorasTr();
                ceduTra = aux.getTrabajador().getIdenti();
            }

            aux = aux.getSiguiente();
        }

        return ceduTra;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public NodoPila getCima() {
        return cima;
    }

    public void setCima(NodoPila cima) {
        this.cima = cima;
    }

}
