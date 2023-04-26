package ClasesObjetos;

import java.util.Scanner;

public class AppPersonas {
    public static void main(String[] args) {
        //crear un objeto tipo Sccnaer
        Scanner consola = new Scanner(System.in);

        //crear una instancia de tipo Persona
        Persona individuo = new Persona();

        //Dar valores a nuestros distintos atributos
        System.out.println("Introduce un nombre");
        individuo.setNombre(consola.next());
        System.out.println("Primer apellido");
        individuo.setPrimerApellido(consola.next());
        System.out.println("Segundo apellido");
        individuo.setSegundoApellido(consola.next());
        System.out.println("DNI");
        individuo.setDni(consola.next());
        System.out.println("Edad");
        individuo.setEdad(consola.nextInt());

        //Mostrar la información de nuestro objeto
        System.out.println(individuo);
    }
}
