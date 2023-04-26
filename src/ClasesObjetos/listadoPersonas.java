package ClasesObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class listadoPersonas {

    public static void main(String[] args) {
        Persona alex = new Persona("Alex", "Muñoz", "Velasco", "12.345.678-L", 25);
        Persona ana = new Persona("Ana", "Gil", "Gil", "12.345.678-L", 55);
        Persona erik = new Persona("Erik", "Muñoz", "Velasco", "12.345.678-L", 34);
        Persona sara = new Persona("Sara", "Sanz", "Peres", "12.345.678-L", 48);

        List<Persona> listadoPersonas = new ArrayList<Persona>();
        listadoPersonas.add(alex);
        listadoPersonas.add(ana);
        listadoPersonas.add(erik);
        listadoPersonas.add(sara);

        for (Persona persona : listadoPersonas) {
            System.out.println(persona);
        }

        Collections.sort(listadoPersonas);
        for (Persona persona : listadoPersonas) {
            System.out.println(persona);
        }
    }
}