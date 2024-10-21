package Ejercicios_PP;

import java.util.Scanner;

public class ejercicioBucles_1 {

    public static void main(String[] args) {
        boolean divisorEncontrado = false; int cont=2;
        System.out.print("Indique un número: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero>=2) {
            while (cont<numero && !divisorEncontrado) {
                if (numero % cont == 0) {
                    divisorEncontrado = true;
                }
                cont++;
            }
            if (!divisorEncontrado) {
                System.out.println("El número es primo");
            } else {
                System.out.println("El número no es primo");
            }
        } else {
            System.out.println("Error: Debe introducir un número mayor que 2");
        }

    }

}
