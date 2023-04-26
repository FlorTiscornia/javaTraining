package estructurasControl;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un número");
        numero = teclado.nextInt();

        if (numero % 5 == 0) {
            System.out.println("El número es múltiplo de 5");
        } else {
            System.out.println("El número no es múltiplo de 5");
        }
    }
}