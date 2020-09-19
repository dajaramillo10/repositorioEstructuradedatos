/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author ccort
 */
public class menu {

    public void menu() {
        ArbolBinario arbol = new ArbolBinario();

        Empresa emp1 = new Empresa("Facebook", 1233, "ojito@gmail.com", "2452345", generarTraba());
        Empresa emp2 = new Empresa("Twitter", 1234, "twitter@gmail.com", "4534534", generarTraba());
        Empresa emp3 = new Empresa("Instagram", 1235, "Instragra,@gmail.com", "2546455", generarTraba());
        Empresa emp4 = new Empresa("Tiktook", 1236, "tikkkk@gmail.com", "645645", generarTraba());
        Empresa emp5 = new Empresa("ConociendoAndo", 1237, "andooo@gmail.com", "6786565", generarTraba());
        Empresa emp6 = new Empresa("Reconocidos", 1238, "ojoooo@gmail.com", "8576867", generarTraba());
        Empresa emp7 = new Empresa("Freefire", 1239, "firehhhh@gmail.com", "5675675", generarTraba());
        Empresa emp8 = new Empresa("Nimotv", 12310, "tvvvvvv@gmail.com", "9876789", generarTraba());
        Empresa emp9 = new Empresa("Youtruber", 12311, "videossss@gmail.com", "324534", generarTraba());
        Empresa emp10 = new Empresa("Bohoyah", 12312, "Visctoriassss@gmail.com", "46545677", generarTraba());

        arbol.insertar(emp1);
        arbol.insertar(emp2);
        arbol.insertar(emp3);
        arbol.insertar(emp4);
        arbol.insertar(emp5);
        arbol.insertar(emp6);
        arbol.insertar(emp7);
        arbol.insertar(emp8);
        arbol.insertar(emp9);
        arbol.insertar(emp10);

        System.out.println("Recorriendo inorden:");
        arbol.inorden();
    }

    private Pilas generarTraba() {

        Pilas trabajadores = new Pilas(10);

        List<String> cargo = new ArrayList<>();
        cargo.add("gerente");
        cargo.add("admin");
        cargo.add("vitrinas");
        cargo.add("atencion");
        cargo.add("programador");
        cargo.add("diseñador");
        cargo.add("Influiencer");
        cargo.add("Paseador");
        cargo.add("caracolista");
        cargo.add("Caballero");

        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            String nombre = "";
            String identi = "";
            String cargoo;
            int horas;

            for (int j = 0; j < 7; j++) {
                nombre += (char) (Math.random() *(90-65+1)+65);
            }

            for (int j = 0; j < 10; j++) {

                identi += (char) (Math.random() *(57-48+1)+48);

            }

            cargoo = cargo.remove(((int) (Math.random() * (10 - i))));

            horas = (int) (Math.random() * 20 + 10);

            trabajadores.insertar(new trabajador(nombre, identi, cargoo, horas));
        }
        return trabajadores;
    }

}
