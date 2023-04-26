package estructurasControl;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        boolean incorrecto = true;

        do {
            System.out.println("Introduce un número");
            numero = teclado.nextInt();

            if (numero >0) {
                System.out.println("El número es correcto");
                incorrecto = false;
            } else {
                System.out.println("El número no es correcto");
            }
        } while (incorrecto);
    }
}
